package com.study.mangotv.database.jpa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.study.mangotv.database.jpa.entity.pk.SubscribePk;

import lombok.Data;


@Data
@Entity
@Table(name = "subscribe")
@IdClass(SubscribePk.class)
public class SubscribeEntity {

    @Id
    @Column(name = "user_srl", nullable = false)
    private Long userSrl;

    @Id
    @Column(name  = "streamer_srl", nullable = false)
    private Long streamerSrl;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Column(name = "update_date", nullable = false)
    private Date updateDate;
}
