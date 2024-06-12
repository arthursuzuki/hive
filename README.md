# HIVE
O Hive é o Portal da Inovação Acadêmica da Cesar School, com intuito de impulsionar a criatividade e o empreendedorismo entre os estudantes. Como um espaço colaborativo, o Hive conecta talentos e ideias inovadoras, transformando desafios acadêmicos em oportunidades reais de impacto.

## Participantes

Rodrigo Lucena Cavalcanti - rlc2@cesar.school

Caio Machado de Aquino Fonseca - cmaf@cesar.school

Henrique Lobo Queiroz Guimarães - hlqg@cesar.school

Lucas Souto Maior Caldas - lsmc2@cesar.school

Arthur Suzuki - ajls@cesar.school

## Codigo MySQL

CREATE DATABASE Hive;

CREATE USER 'superuser'@'localhost' IDENTIFIED BY 'rlc20040714';
GRANT ALL PRIVILEGES ON *.* TO 'superuser'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;


CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT null
    email VARCHAR(100);
);



CREATE TABLE papeis (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE usuario_papeis (
    usuario_id INT,
    papel_id INT,
    PRIMARY KEY (usuario_id, papel_id),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (papel_id) REFERENCES papeis(id)
);

CREATE TABLE artigos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor_id INT,
    inicio_artigo TEXT,
    conteudo_completo TEXT,
    data_publicacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (autor_id) REFERENCES usuarios(id)
);

CREATE TABLE usuario_artigos (
    usuario_id INT,
    artigo_id INT,
    PRIMARY KEY (usuario_id, artigo_id),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (artigo_id) REFERENCES artigos(id)
);

CREATE TABLE projetos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    usuario_id INT,
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE usuario_projetos (
    usuario_id INT,
    projeto_id INT,
    PRIMARY KEY (usuario_id, projeto_id),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (projeto_id) REFERENCES projetos(id)
);

INSERT INTO papeis (nome) VALUES ('Membro da Comunidade');
INSERT INTO papeis (nome) VALUES ('Gerenciador de Pesquisa');

SELECT u.id, u.nome_completo, u.email
FROM usuarios u
JOIN usuario_papeis up ON u.id = up.usuario_id
JOIN papeis p ON up.papel_id = p.id
WHERE p.nome = 'Membro da Comunidade';

SELECT u.nome_completo, u.email
FROM usuarios u
WHERE u.id = ?;  -- Substituir "?" pelo ID do membro

SELECT p.id, p.nome, p.descricao, p.data_criacao
FROM projetos p
WHERE p.usuario_id = ?;  -- Substituir "?" pelo ID do membro

SELECT a.id, a.titulo, a.inicio_artigo, a.data_publicacao
FROM artigos a
JOIN usuario_artigos ua ON a.id = ua.artigo_id
WHERE ua.usuario_id = ? AND a.autor_id = ?;  -- Substituir "?" pelo ID do membro e autor_id
