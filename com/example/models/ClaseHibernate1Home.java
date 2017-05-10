package com.example.models;
// Generated 09/05/2017 05:06:06 PM by Hibernate Tools 4.0.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ClaseHibernate1.
 * @see com.example.models.ClaseHibernate1
 * @author Hibernate Tools
 */
@Stateless
public class ClaseHibernate1Home {

	private static final Log log = LogFactory.getLog(ClaseHibernate1Home.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ClaseHibernate1 transientInstance) {
		log.debug("persisting ClaseHibernate1 instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ClaseHibernate1 persistentInstance) {
		log.debug("removing ClaseHibernate1 instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ClaseHibernate1 merge(ClaseHibernate1 detachedInstance) {
		log.debug("merging ClaseHibernate1 instance");
		try {
			ClaseHibernate1 result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ClaseHibernate1 findById(int id) {
		log.debug("getting ClaseHibernate1 instance with id: " + id);
		try {
			ClaseHibernate1 instance = entityManager.find(ClaseHibernate1.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
