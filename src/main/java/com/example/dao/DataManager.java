package com.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DataManager {

private static DataManager dataManager;

public EntityManager manager;

    public DataManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
        this.manager = entityManagerFactory.createEntityManager();
    }

    public static DataManager getInstanceManager(){
        if(dataManager == null) {
            dataManager = new DataManager();
        }
        return dataManager;
    }
}
