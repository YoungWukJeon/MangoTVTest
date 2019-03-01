package com.study.mangotv.database.jpa.repository;

import com.study.mangotv.database.jpa.entity.pk.SubscribePk;
import com.study.mangotv.database.jpa.entity.SubscribeEntity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscribeRepository extends JpaRepository<SubscribeEntity, SubscribePk>, SubscribeRepositoryCustom {

}