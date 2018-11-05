/*Database declaration*/
create database hackerrankmanage;
use hackerrankmanage;



/*Database tables declaration*/
create table prob_cat (
	id int not null,
	name varchar(20) not null,
    primary key(id)
);

create table prob_type (
	id int not null,
    type varchar(50) not null,
    type_init varchar(2) not null,
    primary key(id)
);

create table prob_mod (
	id int not null,
    name text not null,
    type int not null,
    category int not null,
    solution int,
    is_solved boolean not null,
    primary key(id),
    foreign key(type) references prob_type(id),
    foreign key(category) references prob_cat(id)
);



/*Table static data insertion*/
insert into prob_cat(id, name) values 
(1, 'ALgorithm'), (2, 'Data Structure');

insert into prob_type(id, type, type_init) values 
(101, 'Bit Manipulation', 'BM'), (102, 'Constructive Algorithms', 'CA'), (103, 'Dynamic Programming', 'DP'),
(104, 'Game Theory', 'GT'), (105, 'Graph Theory', 'GH'), (106, 'Greedy', 'GR'),
(107, 'Implementation', 'IM'), (108, 'NP Complete', 'NP'), (109, 'Recursion', 'RC'),
(110, 'Search', 'SR'), (111, 'Sorting', 'ST'), (112, 'Strings', 'SG'),
(113, 'Warmup', 'WU'), (201, 'Advanced', 'AV'), (202, 'Arrays', 'AR'),
(203, 'Balanced Trees', 'BT'), (204, 'Disjoint Set', 'DS'), (205, 'Heap', 'HP'),
(206, 'Linked Lists', 'LL'), (207, 'Queues', 'QU'), (208, 'Stacks', 'SC'),
(209, 'Trees', 'TE'), (210, 'Trie', 'TR');

insert into prob_mod(id, name, type, category, solution, is_solved) values 
(10101, 'AL_BM_2sComplement', 101, 1, 99, false), (10102, 'AL_BM_ANDProduct', 101, 1, 99, false),
(10103, 'AL_BM_AOrB', 101, 1, 99, false), (10104, 'AL_BM_ChangingBits', 101, 1, 99, false),
(10105, 'AL_BM_Cipher', 101, 1, 99, false), (10106, 'AL_BM_CounterGame', 101, 1, 99, false),
(10107, 'AL_BM_FlippingBits', 101, 1, 99, false), (10108, 'AL_BM_HammingDistance', 101, 1, 99, false),
(10109, 'AL_BM_IterateIt', 101, 1, 99, false), (10110, 'AL_BM_LonelyInteger', 101, 1, 99, false),
(10111, 'AL_BM_ManipulativeNumbers', 101, 1, 99, false), (10112, 'AL_BM_MaximizingTheFunction', 101, 1, 99, false),
(10113, 'AL_BM_MaximizingXOR', 101, 1, 99, false), (10114, 'AL_BM_MixingProteins', 101, 1, 99, false),
(10115, 'AL_BM_SansaAndXOR', 101, 1, 99, false), (10116, 'AL_BM_StoneGame', 101, 1, 99, false),
(10117, 'AL_BM_StringTransmission', 101, 1, 99, false), (10118, 'AL_BM_SumVSXOR', 101, 1, 99, false),
(10119, 'AL_BM_TheGreatXOR', 101, 1, 99, false), (10120, 'AL_BM_WhatsNext', 101, 1, 99, false),
(10121, 'AL_BM_XoringNinja', 101, 1, 99, false), (10122, 'AL_BM_XORKey', 101, 1, 99, false),
(10123, 'AL_BM_XORMatrix', 101, 1, 99, false), (10124, 'AL_BM_XorSequence', 101, 1, 99, false),
(10125, 'AL_BM_XORSubsequences', 101, 1, 99, false), (10126, 'AL_BM_YetAnotherMinimaxProblem', 101, 1, 99, false);



/*Basic table manipulation*/
select * from prob_cat;
drop table prob_cat;
select * from prob_type;
drop table prob_type;
select * from prob_mod;
drop table prob_mod;



/*Custome table manipulation*/
select distinct count(prob_cat.name) 
as sum_algorithm, prob_cat.name 
from prob_mod left join prob_cat 
on prob_mod.category = prob_cat.id;


/*Other setting*/
ALTER USER 'root'@'localhost' IDENTIFIED BY 'W!s3s4c0m3c0'; 