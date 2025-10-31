CREATE DATABASE EtecUirapuru;
USE EtecUirapuru;

CREATE TABLE alunos(
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(255),
curso VARCHAR(255),
idade INT(3)
);

ALTER TABLE alunos ADD cargo VARCHAR(255) AFTER salario;
UPDATE alunos SET cargo = "programador" WHERE id=1;
INSERT INTO alunos (nome, curso, idade) VALUES ("Alberto", "Gastronomia", 28);
SELECT * FROM alunos WHERE idade >= 18;
UPDATE alunos
SET nome = "Flavio"
WHERE id=1;
ALTER TABLE alunos ADD sexo VARCHAR(255);
SELECT
(SELECT COUNT(*) FROM alunos WHERE sexo="masculino") AS QntdeHomens,
(SELECT COUNT(*) FROM alunos WHERE sexo="feminino") AS QntdeMulheres;