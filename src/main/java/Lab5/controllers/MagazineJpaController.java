/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5.controllers;

import Lab5.controllers.exceptions.NonexistentEntityException;
import Lab5.entities.Magazine;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author 17009434
 */
public class MagazineJpaController implements Serializable {

    public MagazineJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Magazine magazine) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(magazine);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Magazine magazine) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            magazine = em.merge(magazine);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = magazine.getId();
                if (findMagazine(id) == null) {
                    throw new NonexistentEntityException("The magazine with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Magazine magazine;
            try {
                magazine = em.getReference(Magazine.class, id);
                magazine.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The magazine with id " + id + " no longer exists.", enfe);
            }
            em.remove(magazine);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Magazine> findMagazineEntities() {
        return findMagazineEntities(true, -1, -1);
    }

    public List<Magazine> findMagazineEntities(int maxResults, int firstResult) {
        return findMagazineEntities(false, maxResults, firstResult);
    }

    private List<Magazine> findMagazineEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Magazine.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Magazine findMagazine(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Magazine.class, id);
        } finally {
            em.close();
        }
    }

    public int getMagazineCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Magazine> rt = cq.from(Magazine.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
