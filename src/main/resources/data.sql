INSERT INTO USUARIO(nome, email, senha) VALUES('Admin', 'admin@email.com', '$2a$10$sFKmbxbG4ryhwPNx/l3pgOJSt.fW1z6YcUnuE2X8APA/Z3NI/oSpq');
INSERT INTO USUARIO(nome, email, senha) VALUES('User', 'user@email.com', '$2a$10$sFKmbxbG4ryhwPNx/l3pgOJSt.fW1z6YcUnuE2X8APA/Z3NI/oSpq');

INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_ADMIN');
INSERT INTO PERFIL(id, nome) VALUES(2, 'ROLE_USER');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(1, 1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(2, 2);

INSERT INTO CATEGORIA (nome, cor, descricao, status, dt_cadastro, dt_update, logs) VALUES ('POLITICA', '#0199CA', 'POLITICA','ATIVO', '2020-03-12 02:20:25', '2020-03-26 01:31:00', NULL);
INSERT INTO CATEGORIA (nome, cor, descricao, status, dt_cadastro, dt_update, logs) VALUES ('CORONAVÍRUS', '#EF232A', 'CORONAVÍRUS', 'ATIVO', '2020-03-12 02:21:55', '2020-03-26 01:27:30', NULL);
INSERT INTO CATEGORIA (nome, cor, descricao, status, dt_cadastro, dt_update, logs) VALUES ('SAÚDE', '#FBA209', 'SAÚDE', 'ATIVO', '2020-03-12 02:23:22', '2020-03-26 01:30:56', NULL);

INSERT INTO NOTICIA (titulo, corpo, fonte_autor, fonte_url, fonte_data, status, logs, categoria_id, autor_id, data_postagem, data_update) VALUES ('A vida como ela é', 'essa é uma historia simples da vida e como ela é.', 'Fabiano Lira', 'www.fabianolira.com.br','2020-03-12 02:23:22', 'INATIVO', 'logs aqui', 1, 1, '2020-03-12 02:23:22', NULL);
INSERT INTO NOTICIA (titulo, corpo, fonte_autor, fonte_url, fonte_data, status, logs, categoria_id, autor_id, data_postagem, data_update) VALUES ('Eu sou especial', 'essa é uma historia simples da vida e como ela é.', 'Julio Cezar', 'http.qualquer coisa.com.br','2020-03-12 02:23:22', 'INATIVO', 'logs aqui', 2, 2, '2020-03-12 02:23:22', NULL);
INSERT INTO NOTICIA (titulo, corpo, fonte_autor, fonte_url, fonte_data, status, logs, categoria_id, autor_id, data_postagem, data_update) VALUES ('O filho coruja', 'essa é uma historia simples da vida e como ela é.', 'Zeca Pinheiro', 'www.fabianolira.com.br','2020-03-12 02:23:22', 'INATIVO', 'logs aqui', 2, 1, '2020-03-12 02:23:22', NULL);
INSERT INTO NOTICIA (titulo, corpo, fonte_autor, fonte_url, fonte_data, status, logs, categoria_id, autor_id, data_postagem, data_update) VALUES ('Eu tenho interesse em vc', 'essa é uma historia simples da vida e como ela é.', 'Moises Bispo', 'www.ahoraeagora.com.br','2020-03-12 02:23:22', 'INATIVO', 'logs aqui', 1, 1, '2020-03-12 02:23:22', NULL);

INSERT INTO IMAGENS (nome, noticia_id, pasta) VALUES ('nome_imagem_1', 1, 'caminho da pasta para a imagem 1');
INSERT INTO IMAGENS (nome, noticia_id, pasta) VALUES ('nome_imagem_2', 1, 'caminho da pasta para a imagem 2');
INSERT INTO IMAGENS (nome, noticia_id, pasta) VALUES ('nome_imagem_3', 2, 'caminho da pasta para a imagem 3');
