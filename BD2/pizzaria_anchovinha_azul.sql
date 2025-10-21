CREATE DATABASE pizzaria_anchovinha_azul;
USE pizzaria_anchovinha_azul;

CREATE TABLE clientes(
	id_cliente INT AUTO_INCREMENT PRIMARY KEY, 
	nome VARCHAR(100) NOT NULL,
    email VARCHAR(255) UNIQUE
    
);
SELECT * FROM clientes;

CREATE TABLE pedidos(
	id_pedidos INT AUTO_INCREMENT PRIMARY KEY,
    date_pedidos DATE,
    valor DECIMAL(10,2),
    id_cliente INT,
    CONSTRAINT fk_cliente_pedido FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)

);