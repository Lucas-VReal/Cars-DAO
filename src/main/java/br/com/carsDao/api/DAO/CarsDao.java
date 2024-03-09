package br.com.carsDao.api.DAO;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class CarsDao {

    private final EntityManager entityManager;

    public CarsDao(EntityManager entityManager) {
        this.entityManager = Persistence.createEntityManagerFactory("cars_dao").createEntityManager();
    }


}
