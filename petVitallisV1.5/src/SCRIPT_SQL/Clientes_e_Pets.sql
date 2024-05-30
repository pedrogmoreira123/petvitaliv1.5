create database	db_pessoas;

use db_pessoas;

create table tb_clientes(
    codigo int auto_increment primary key,
    nome varchar(200),
    email varchar(200),
    número varchar(200),
    cpf varchar(200)
);



select * from tb_clientes;

