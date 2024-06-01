
create database	db_pessoas;
drop table tb_pets;
use db_pessoas;

create table tb_pets(
    nome varchar(200),
    cpf varchar(200),
    número varchar(200),
    nomepet varchar(200),
    idade varchar(200),
    especie_raça varchar(200),
    sexo varchar(200)
);

select * from tb_pets;

