
create database vitalcarehealth;
use vitalcarehealth;

CREATE TABLE Pacientes (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Nome VARCHAR(100) NOT NULL,
    genero enum ( 'M', 'F'),
    Email VARCHAR(50),
    CPF CHAR(11),
    Endereco VARCHAR(255),
    Telefone VARCHAR(15),
    DataNascimento DATE

);

INSERT INTO Pacientes (Nome, Email, CPF, Endereco, Telefone, DataNascimento)
VALUES ('Erik Ryan Oliveira da Silva Barros', 'E-mail: erik.oliveira@email.com', '123.456.789-00', 'Rua das Flores, 123, Bairro Alegre, São Paulo - SP, CEP:01234-567', '(11) 98765-4321', ' 15/03/1985');
SELECT * FROM PACIENTES;

INSERT INTO Pacientes (Nome, Email, CPF, Endereco, Telefone, DataNascimento)
VALUES 
('Camila da Silva Souza', 'camila.silva@email.com', '987.654.321-00', 'Av. das Palmeiras, 456, Bairro Verde, Rio de Janeiro - RJ, CEP: 20000-123', '(21) 98765-4321', '20/05/1990'),
('Jonatas da Silva Carvalho',' jonatassilva@email.com', '456.789.123-00', 'Rua dos Pinheiros, 789, Bairro Tranquilo, Belo Horizonte - MG, CEP: 30123-456', '(31) 98765-4321', '10/10/1980'),
('Gustavo Pereira do Nascimento', 'gustavopereira@email.com', '789.123.456-00', 'Travessa das Violetas, 987, Bairro Sereno, Porto Alegre - RS, CEP: 90000-789', '(51) 98765-4321', '05/07/1995'),
('Gustavo de Oliveira Bezera', 'gustavooliveira@email.com', '654.321.987-00', 'Rua das Oliveiras, 321, Bairro Feliz, Curitiba - PR, CEP: 80000-321', '(41) 98765-4321', '25/12/1988'),
('Mayara Neves de Castro', 'mayara.neves@email.com', '234.567.890-00', 'Rua das Acácias, 789, Bairro Tranquilo, Florianópolis - SC, CEP: 88000-123', '(48) 98765-4321', '(48) 98765-4321'),
('Pamela dos Santos Sobré', 'pamela.santos@email.com', '345.678.901-00', 'Av. dos Ipês, 456, Bairro Verde, Salvador - BA, CEP: 40000-789', '(71) 98765-4321', '28/04/1987');

SELECT * FROM PACIENTES;


