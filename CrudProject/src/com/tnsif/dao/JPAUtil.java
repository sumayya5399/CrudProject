package com.tnsif.dao;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	static
	{
	factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntityManager()
	{
	if(entityManager==null || !entityManager.isOpen()) {
	entityManager = factory.createEntityManager();
	}
	return entityManager;
	}
	}
}
