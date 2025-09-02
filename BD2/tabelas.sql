#DDL

CREATE DATABASE loja_do_cleitinho;
USE loja_do_cleitinho;
CREATE TABLE produtos(

	id INT,
    nome VARCHAR(255),
    data_validade VARCHAR(15),
    preço DOUBLE,
    quantidade INT
    
);
ALTER TABLE produtos ADD COLUMN categorias VARCHAR(25);
SELECT * FROM produtos;


CREATE TABLE funcionarios(

	matricula INT,
    nome VARCHAR(420),
    idade INT,
    salario DOUBLE

);
SELECT * FROM funcionarios;