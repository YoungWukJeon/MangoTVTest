package com.study.mangotv.database.jpa.entity.pk;

import java.io.Serializable;

import lombok.Data;


@Data
public class SubscribePk implements Serializable{
    //TODO: 관리 할지 말지 ... 
    private static final long serialVersionUID = 1L;

    private Long userSrl;

    private Long streamerSrl;
}