package com.study.mangotv.database.jpa.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import com.study.mangotv.database.jpa.entity.pk.SubscribePk;
import com.study.mangotv.database.jpa.entity.SubscribeEntity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SubscribeRepositoryTest {

    @Autowired
    private SubscribeRepository subscribeRepository;

    @Test
    @Transactional
    public void saveAndFind_Test(){
        Long userSrl = 18L;
        Long streamerSrl = 19L;

        SubscribeEntity subscribeEntity = new SubscribeEntity();
        subscribeEntity.setUserSrl(userSrl);
        subscribeEntity.setStreamerSrl(streamerSrl);
        subscribeEntity.setStatus("NORMARL");
        subscribeEntity.setCreateDate(new Date());
        subscribeEntity.setUpdateDate(new Date());

        subscribeRepository.save(subscribeEntity);

        SubscribePk subscribePk = new SubscribePk();
        subscribePk.setUserSrl(userSrl);
        subscribePk.setStreamerSrl(streamerSrl);
        
        System.err.println("save data");
        System.err.println(subscribeRepository.findById(subscribePk).get());
    }

    @Test
    public void getUserSubscribeList() {
        Long userSrl = 18L;

        List<SubscribeEntity> subscribeEntityList = subscribeRepository.getUserSubscribeList(userSrl);
        for(SubscribeEntity subscribeEntity : subscribeEntityList){
            System.err.println(subscribeEntity);
        }
    }
}