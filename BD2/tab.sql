 CREATE DATABASE db_pk;
USE db_pk;

CREATE TABLE curso(
id_curso INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
descricao VARCHAR(255)
);

CREATE TABLE aluno(
id_aluno INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
idade INT NOT NULL,
email VARCHAR (100) UNIQUE NOT NULL,
data_nascimento DATE NOT NULL,
id_curso INT,
telefone VARCHAR(20),
CONSTRAINT fk_aluno_curso FOREIGN KEY (id_curso) REFERENCES curso(id_curso)
); 
