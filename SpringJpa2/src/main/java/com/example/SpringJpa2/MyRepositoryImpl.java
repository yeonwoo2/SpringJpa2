package com.example.SpringJpa2;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.sql.rowset.serial.SerialArray;


public class MyRepositoryImpl<T, ID extends SerialArray> extends SimpleJpaRepository<T,ID> implements MyRepository<T ,ID>{

    private EntityManager entityManager;

    public MyRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public boolean contains(T entity) {
        return entityManager.contains(entity);
    }
}
