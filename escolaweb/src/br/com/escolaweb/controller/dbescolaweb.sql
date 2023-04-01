create database dbescolaweb;
CREATE TABLE pessoa(
  _id VARCHAR(255) PRIMARY KEY NOT NULL,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(100) NOT NULL,
  data_nasc DATE NULL,
  cadastro TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  ativo BOOLEAN DEFAULT 1 NOT NULL
);

create table aluno(
   _id  varchar(255) primary key not null,
   _id_pessoa varchar(255)  not null,
    matricula varchar(20) not null,
    foreign key (_id_pessoa) references pessoa(_id)
);

create table funcionario(
   _id  varchar(255) primary key not null,
   _id_pessoa varchar(255)  not null,
    cargo varchar(20) not null,
    foreign key (_id_pessoa) references pessoa(_id)
);