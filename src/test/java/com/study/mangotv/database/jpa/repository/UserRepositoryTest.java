package com.study.mangotv.database.jpa.repository;

import java.util.Date;

import javax.transaction.Transactional;

import com.study.mangotv.database.jpa.entity.UserEntity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    public void saveAndFind_Test(){
        Date now = new Date();

        UserEntity userEntity = new UserEntity();
        userEntity.setId("testStreamer");
        userEntity.setPassword("testPass");
        userEntity.setNickname("streamer1");
        userEntity.setStatus("NORMAL");
        userEntity.setCreateDate(now);
        userEntity.setUpdateDate(now);
        userEntity.setLoginDate(now);

        UserEntity savedUserEntity = userRepository.save(userEntity);

        System.err.println("save data");
        System.err.println(userRepository.findById(savedUserEntity.getSrl()).get());
    }
}