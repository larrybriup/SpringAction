-- 

	show databases;
	
	use test_db;

	select database();

	show tables;

	select * from account;

	create table user_tbl (
		id int unsigned auto_increment,
		name varchar(45) not null,
		gender boolean not null,
		age int unsigned not null,
		birthday date not null,
		primary key (id)
	);

	desc user_tbl;

	drop table user_tbl;


	select * from user_tbl;
	
	select * from account;

	drop table account;


	show databases;




	