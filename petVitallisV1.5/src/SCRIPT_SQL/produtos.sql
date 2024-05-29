USE db_pessoas;

select * from tb_cadfuncionario;

create table tb_cadproduto (
	codigoProduto INT PRIMARY KEY AUTO_INCREMENT,
	nomeProduto VARCHAR(200),
	tipoProduto VARCHAR(200),
	validadeProduto VARCHAR(200)
);

select * from tb_cadproduto;