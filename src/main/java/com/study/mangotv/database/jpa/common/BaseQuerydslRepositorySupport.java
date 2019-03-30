package com.study.mangotv.database.jpa.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public abstract class BaseQuerydslRepositorySupport extends QuerydslRepositorySupport {

    public BaseQuerydslRepositorySupport(Class<?> domainClass) {
        super(domainClass);
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        super.setEntityManager(entityManager);
    }
}