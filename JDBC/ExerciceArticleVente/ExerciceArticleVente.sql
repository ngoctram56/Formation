drop database article_vente_db;
create database article_vente_db;
use article_vente_db;

create table article(
code int auto_increment primary key,
designation varchar(50),
prixUnitaire double,
qte_stock int
);

create table vente(
id int primary key auto_increment,
article int,
qte int,
annee int,
constraint fk_vente_article foreign key (article) references article (code)
);

select* from article;
select* from vente;
select sum(prixUnitaire*qte_stock) from article;
select*, prixUnitaire*qte from vente v inner join article a on v.id = a.code where id=2;
select sum(prixUnitaire*qte) from vente v inner join article a on v.id = a.code;

create or replace view recap_article as 
select a.code, a.prixUnitaire, a.qte_stock, v.qte, sum(a.prixUnitaire*v.qte)  from vente v inner join article a on v.article=a.code group by a.code;