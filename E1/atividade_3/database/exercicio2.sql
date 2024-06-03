CREATE DATABASE exercicio2;

CREATE TABLE caneta (
    id_caneta SERIAL PRIMARY KEY,
    marca VARCHAR(50) NOT NULL,
    cor VARCHAR(20) NOT NULL,
    tinta VARCHAR(20) NOT NULL
);

CREATE TABLE carro (
    id_carro SERIAL PRIMARY KEY,
    fabricante VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    cor VARCHAR(20) NOT NULL
);

CREATE TABLE tenis(
    id_tenis SERIAL PRIMARY KEY,
    marca VARCHAR(50) NOT NULL,
    cor VARCHAR(20) NOT NULL,
    cano VARCHAR(20) NOT NULL
);
