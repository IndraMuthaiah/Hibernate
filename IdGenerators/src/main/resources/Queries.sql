create database mydb;

use mydb;
create table Product( id int primary key,name varchar(20),description varchar(50), price decimal(8,3));
select * from mydb.Product;
 
#use with @GeneratedValue(strategy = GenerationType.IDENTITY)
create table mydb.employee(id int primary key auto_increment,name varchar(20));
select * from mydb.employee;
drop table mydb.employee;

#@TableGenerator(name = "emp_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 100)
#@GeneratedValue(strategy = GenerationType.TABLE,generator = "emp_gen")
create table mydb.employee(id int primary key,name varchar(20));
create table mydb.id_gen(gen_name varchar(60) primary key, gen_val int(20));
select * from mydb.id_gen;

#@GenericGenerator(name = "emp_id", strategy = "com.indy.springdata.idgenerators.CustomRandomIDGenerator")
#@GeneratedValue(generator = "emp_id")
create table mydb.employee(id int primary key,name varchar(20));