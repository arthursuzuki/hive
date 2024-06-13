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

use Hive;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100)
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

INSERT INTO usuarios (username, password, email) VALUES ('user1', 'password1', 'user1@example.com');
INSERT INTO usuarios (username, password, email) VALUES ('user2', 'password2', 'user2@example.com');

INSERT INTO papeis (nome) VALUES ('Membro da Comunidade');
INSERT INTO papeis (nome) VALUES ('Gerenciador de Pesquisa');

INSERT INTO usuario_papeis (usuario_id, papel_id) VALUES (1, 1);
INSERT INTO usuario_papeis (usuario_id, papel_id) VALUES (2, 2);

INSERT INTO artigos (titulo, autor_id, inicio_artigo, conteudo_completo) VALUES ('Artigo 1', 1, 'Início do Artigo 1', 'Conteúdo completo do Artigo 1');
INSERT INTO artigos (titulo, autor_id, inicio_artigo, conteudo_completo) VALUES ('Artigo 2', 2, 'Início do Artigo 2', 'Conteúdo completo do Artigo 2');

INSERT INTO usuario_artigos (usuario_id, artigo_id) VALUES (1, 1);
INSERT INTO usuario_artigos (usuario_id, artigo_id) VALUES (2, 2);

INSERT INTO projetos (nome, descricao, usuario_id) VALUES ('Projeto 1', 'Descrição do Projeto 1', 1);
INSERT INTO projetos (nome, descricao, usuario_id) VALUES ('Projeto 2', 'Descrição do Projeto 2', 2);

INSERT INTO usuario_projetos (usuario_id, projeto_id) VALUES (1, 1);
INSERT INTO usuario_projetos (usuario_id, projeto_id) VALUES (2, 2);

CREATE VIEW view_lista_membros_comunidade AS
SELECT u.id, u.email
FROM usuarios u
JOIN usuario_papeis up ON u.id = up.usuario_id
JOIN papeis p ON up.papel_id = p.id
WHERE p.nome = 'Membro da Comunidade';

CREATE VIEW view_perfil_membro_comunidade AS
SELECT u.id, u.username, u.email
FROM usuarios u;

CREATE VIEW view_projetos_membro_comunidade AS
SELECT p.id, p.nome, p.descricao, p.data_criacao, p.usuario_id
FROM projetos p;

CREATE VIEW view_artigos_projeto AS
SELECT a.id, a.titulo, a.inicio_artigo, a.data_publicacao, a.autor_id
FROM artigos a;
