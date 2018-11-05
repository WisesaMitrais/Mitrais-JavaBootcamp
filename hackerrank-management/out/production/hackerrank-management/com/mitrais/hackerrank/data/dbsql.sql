create database hackerrankmanage;
use hackerrankmanage;

create table prob_cat (
	id int not null,
	name varchar(20) not null,
    primary key(id)
);

insert into prob_cat(id, name) values 
(1, 'ALgorithm'),
(2, 'Data Structure');

select * from prob_cat;
