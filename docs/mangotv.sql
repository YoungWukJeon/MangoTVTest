use mangotv;

use mangotv;

create table `user`(
	`srl` int unsigned auto_increment,
    `id` varchar(30) not null,
    `password` varchar(255) not null,
    `nickname` varchar(20) not null,
    `email` varchar(255), 
    `status` varchar(10) not null default 'NORMAL',
    `icon_url` varchar(255) default null,
    `create_date` datetime not null,
    `update_date` datetime not null,
    `login_date` datetime not null,
    
    primary key(`srl`),
    unique(`id`),
    key `idx_status_01`(`status`, `login_date`)
);

create table `subscribe`(
	`user_srl` int unsigned not null,
    `streamer_srl` int unsigned not null,
    `status` varchar(10) not null default 'NORMAL',
    `create_date` datetime not null,
    `update_date` datetime not null,
    
    primary key `idx_user_srl` (`user_srl`, `streamer_srl`),
    key `idx_streamer_srl_01`(`streamer_srl`, `status`),
    key `idx_status_01`(`status`, `update_date`)
);

INSERT INTO `` (`srl`,`id`,`password`,`nickname`,`email`,`status`,`icon_url`,`create_date`,`update_date`,`login_date`) VALUES (18,'testUser','testPass','nickname',NULL,'NORMAL',NULL,'2019-03-01 07:19:31','2019-03-01 07:19:31','2019-03-01 07:19:31');
INSERT INTO `` (`srl`,`id`,`password`,`nickname`,`email`,`status`,`icon_url`,`create_date`,`update_date`,`login_date`) VALUES (19,'testStreamer','testPass','streamer1',NULL,'NORMAL',NULL,'2019-03-01 07:20:23','2019-03-01 07:20:23','2019-03-01 07:20:23');
INSERT INTO `` (`user_srl`,`streamer_srl`,`status`,`create_date`,`update_date`) VALUES (18,19,'NORMARL','2019-03-01 07:20:59','2019-03-01 07:20:59');