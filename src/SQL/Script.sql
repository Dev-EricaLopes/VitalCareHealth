
create database VitalCareHealth;
use VitalCareHealth;

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
SELECT `pacientes`.`Codigo`,
    `pacientes`.`Nome`,
    `pacientes`.`Endereco`,
    `pacientes`.`Telefone`,
    `pacientes`.`DataNascimento`
FROM `vitalcarehealth`.`pacientes`;


INSERT INTO Pacientes (Nome, Email, CPF, Endereco, Telefone, DataNasciment, Senha)
VALUES 
('Camila da Silva Souza', 'camila.silva@gmail.com', '987.654.321-00', 'Av. das Palmeiras, 456, Bairro Verde,Rio de Janeiro - RJ, CEP: 20000-4321', '(21) 98765-4321', ' 1990-05-20', '12345'),
('Jonatas da Silva Carvalho',' jonatassilva@email.com', '456.789.123-00', 'Rua dos Pinheiros, 789, Bairro Tranquilo, Belo Horizonte - MG, CEP: 30123-456', '(31) 98765-4321', '1980-10-10', '12345'),
('Gustavo Pereira do Nascimento', 'gustavopereira@email.com', '789.123.456-00', 'Travessa das Violetas, 987, Bairro Sereno, Porto Alegre - RS, CEP: 90000-789', '(51) 98765-4321', '1995-07-05', '12345'),
('Gustavo de Oliveira Bezera', 'gustavooliveira@email.com', '654.321.987-00', 'Rua das Oliveiras, 321, Bairro Feliz, Curitiba - PR, CEP: 80000-321', '(41) 98765-4321', '1988-12-25', '12345'),
('Mayara Neves de Castro', 'mayara.neves@email.com', '234.567.890-00', 'Rua das Acácias, 789, Bairro Tranquilo, Florianópolis - SC, CEP: 88000-123', '(48) 98765-4321', '1987-05-10', '12345'),
('Pamela dos Santos Sobré', 'pamela.santos@email.com', '345.678.901-00', 'Av. dos Ipês, 456, Bairro Verde, Salvador - BA, CEP: 40000-789', '(71) 98765-4321', '1987-04-28', '12345');


select * from pacientes;

update pacientes
set senha = `123456`
where codigo = 1;

