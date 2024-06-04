
create database VitalCareHealth;
use VitalCareHealth;

CREATE TABLE Pacientes (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(100) NOT NULL,
    Endereco VARCHAR(255),
    Telefone VARCHAR(15),
    DataNascimento DATE
);

INSERT INTO Pacientes (Nome, Endereco, Telefone, DataNascimento)
VALUES ('João Silva', 'Rua das Flores, 123', '123456789', '1980-05-15');

INSERT INTO Pacientes (Nome, Endereco, Telefone, DataNascimento)
VALUES
('Maria Oliveira', 'Avenida Brasil, 456', '987654321', '1992-08-22'),
('Pedro Santos', 'Rua A, 789', '5647382910', '1985-12-30'),
('Ana Costa', 'Praça B, 101', '1029384756', '1975-03-10');

SELECT * FROM PACIENTES;

teste

