-- CREATE TABLE produto (id bigint NOT NULL AUTO_INCREMENT,
--                       descricao varchar(255) NOT NULL,
--                       valor decimal(8,2) NOT NULL,
--                       PRIMARY KEY (id));
--
-- CREATE TABLE itemvenda (id int NOT NULL AUTO_INCREMENT,
--                         quantidade int NOT NULL,
--                         totalvendaitem decimal(8,2) NOT NULL,
--                         PRIMARY KEY (id));
--
-- CREATE TABLE venda (id int NOT NULL AUTO_INCREMENT,
--                     data date NOT NULL,
--                     totalvenda decimal(8,2) NOT NULL,
--                     PRIMARY KEY (id));


-- pessoa (id bigint not null, nome varchar(255), primary key (id))
-- pessoa_fisica (id bigint not null, nome varchar(255), cpf varchar(255), primary key (id))
-- pessoa_juridica (id bigint not null, nome varchar(255), cnpj varchar(255), primary key (id))

-- create table pessoa_fisica (id bigint not null, nome varchar(255), cpf varchar(255), primary key (id));
-- create table pessoa_juridica (id bigint not null, nome varchar(255), cnpj varchar(255), primary key (id));

insert into pessoa_fisica (id, nome, cpf) values (1, 'Ana Maria', '12345678911');
insert into pessoa_fisica (id, nome, cpf) values (3, 'Fulano de Tal', '12345678922');

insert into pessoa_juridica (id, nome, cnpj) values (2, 'Mundo dos Filtros', '123456789000110');
insert into pessoa_juridica (id, nome, cnpj) values (4, 'Americanas', '123456789000120');

insert into produto (descricao, valor) values ('curvo ultrawide', 2500.00);
insert into produto (descricao, valor) values ('flat ultrawidr', 800.00);
insert into produto (descricao, valor) values ('curvo 34 pol', 2000.00);
insert into produto (descricao, valor) values ('flat 34 pol', 1500.00);

insert into venda (data, pessoa_id) values ('2023-03-12', 1);
insert into venda (data, pessoa_id) values ('2023-03-15', 2);
insert into venda (data, pessoa_id) values ('2023-03-17', 1);

insert into item_venda (quantidade, produto_id, venda_id) values (1, 1, 1);
insert into item_venda (quantidade, produto_id, venda_id) values (1, 2, 1);
insert into item_venda (quantidade, produto_id, venda_id) values (1, 3, 2);
insert into item_venda (quantidade, produto_id, venda_id) values (1, 4, 3);
insert into item_venda (quantidade, produto_id, venda_id) values (2, 2, 3);
