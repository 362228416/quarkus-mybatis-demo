create table user
(
	id int auto_increment primary key,
	username varchar(32) null,
	password varchar(32) null,
	constraint username_union
		unique (username)
);

insert into user(username, password) value ('zhangsan','123456');
