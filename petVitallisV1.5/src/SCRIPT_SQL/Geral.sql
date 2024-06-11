/*drop database db_pessoas;*/



create database	db_pessoas;
use db_pessoas;



create table tb_pets(
    codigo int auto_increment primary key,
    nome varchar(200),
    cpf varchar(200),
    número varchar(200),
    nomepet varchar(200),
    idade varchar(200),
    especie_raça varchar(200),
    sexo varchar(200)
);

create table tb_cadconsultas(
     Código varchar(200),
     NomePet varchar(15),
     Consulta varchar(100),
     Dia varchar (11),
     Hora varchar (5)
);

create table tb_cadproduto (
	codigoProduto INT PRIMARY KEY AUTO_INCREMENT,
	nomeProduto VARCHAR(200),
	tipoProduto VARCHAR(200),
	quantidadeProduto VARCHAR(200)
);

create table tb_cadfuncionario(
    Nome varchar (50),
    Cpf varchar (11),
    Rg varchar (11),
    DataDeNascimento varchar (10),
    Pis varchar (15),
    Endereco varchar (200),
    NumeroDaResidencia varchar(20),
    Cep varchar (10),
    CargoFuncionario varchar (2000)
)


select * from tb_cadproduto;

select*from tb_cadconsultas;

select * from tb_pets;

select * from tb_cadfuncionario;



