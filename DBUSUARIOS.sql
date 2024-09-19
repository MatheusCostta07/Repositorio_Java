CREATE DATABASE Usuarios; 
USE Usuarios; 

CREATE TABLE IF NOT EXISTS Usuarios( 
	ID_cliente int(8) AUTO_INCREMENT, 
	Email varchar(255) not null, 
	Usuario varchar(255),
	Senha varchar(255),
	PRIMARY KEY (ID_cliente) 
);

select * from Usuarios;

create table if not exists CadastroFiliais(
	ID_filial int(8) auto_increment,
	nome varchar(45) not null,
    telefone int(13),
    email varchar(45),
    nomeGerente varchar(45),
    endereco varchar(60),
	PRIMARY KEY (ID_filial) 
);

select * from CadastroFiliais;