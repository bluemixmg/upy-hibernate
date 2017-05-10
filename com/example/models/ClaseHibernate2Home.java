package com.example.models;
// Generated 09/05/2017 05:06:06 PM by Hibernate Tools 4.0.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ClaseHibernate2.
 * @see com.example.models.ClaseHibernate2
 * @author Hibernate Tools
 */
@Stateless
public class ClaseHibernate2Home {

	private static final Log log = LogFactory.getLog(ClaseHibernate2Home.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ClaseHibernate2 transientInstance) {
		log.debug("persisting ClaseHibernate2 instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ClaseHibernate2 persistentInstance) {
		log.debug("removing ClaseHibernate2 instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ClaseHibernate2 merge(ClaseHibernate2 detachedInstance) {
		log.debug("merging ClaseHibernate2 instance");
		try {
			ClaseHibernate2 result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ClaseHibernate2 findById(int id) {
		log.debug("getting ClaseHibernate2 instance with id: " + id);
		try {
			ClaseHibernate2 instance = entityManager.find(ClaseHibernate2.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
