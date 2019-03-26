package com.study.mangotv.database.jpa.repository;

import com.study.mangotv.database.jpa.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

}