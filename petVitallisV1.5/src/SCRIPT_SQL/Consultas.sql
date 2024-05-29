/*drop table tb_cadconsultas;*/

use db_pessoas;

create table tb_cadconsultas(
	 CPF int primary key,
     NomePet varchar(15),
     Consulta varchar(100),
     Dia varchar (11),
     Hora varchar (5)
)

select*from tb_cadconsultas;