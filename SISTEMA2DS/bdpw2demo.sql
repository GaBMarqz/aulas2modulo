CREATE database bdpw2;
USE bdpw2;

CREATE table demo(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    idade INT(3),
    cpf VARCHAR(11),
    email VARCHAR(255),
    telefone INT(11),
    celular INT(12),
    abrir VARCHAR(40),
    dobrar VARCHAR(40)
);
ALTER TABLE demo
ADD COLUMN rg VARCHAR(9);
