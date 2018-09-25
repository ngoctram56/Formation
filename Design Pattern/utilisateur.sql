drop database if exists db_roleutilisateur;
create database db_roleutilisateur ;
use db_roleutilisateur ;

select * from roleUti ;

select * from utilisateur ;

select * from role ;


create or replace view v_role_util as select ru.id as idRU, utilisateur_id as idUser, r.designation as designation 
	from roleUti ru
	inner join role r where role_id=r.id;