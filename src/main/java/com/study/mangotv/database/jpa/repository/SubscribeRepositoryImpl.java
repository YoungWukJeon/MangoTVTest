package com.study.mangotv.database.jpa.repository;

import java.util.List;

import com.querydsl.jpa.JPQLQuery;
import com.study.mangotv.database.jpa.common.BaseQuerydslRepositorySupport;
import com.study.mangotv.database.jpa.entity.QSubscribeEntity;
import com.study.mangotv.database.jpa.entity.QUserEntity;
import com.study.mangotv.database.jpa.entity.SubscribeEntity;


public class SubscribeRepositoryImpl extends BaseQuerydslRepositorySupport implements SubscribeRepositoryCustom {

    public SubscribeRepositoryImpl(){
        super(SubscribeEntity.class);
    }


    @Override
    public List<SubscribeEntity> getUserSubscribeList(Long userSrl){
        QSubscribeEntity qSubscribeEntity = QSubscribeEntity.subscribeEntity;
        QUserEntity qUserEntity = QUserEntity.userEntity;

        JPQLQuery<SubscribeEntity> query = from(qSubscribeEntity)
            .innerJoin(qUserEntity).on(qUserEntity.srl.eq(qSubscribeEntity.userSrl))
            .where(qUserEntity.srl.eq(userSrl));
        
        return query.fetchResults().getResults();
    }
}