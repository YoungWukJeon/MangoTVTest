package com.study.mangotv.database.jpa.repository;

import java.util.List;

import com.study.mangotv.database.jpa.entity.SubscribeEntity;

public interface SubscribeRepositoryCustom {

    // 1 user 구독리스트 
    List<SubscribeEntity> getUserSubscribeList(Long userSrl);
}