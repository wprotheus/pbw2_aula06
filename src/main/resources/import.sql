-- início
-- @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
insert into pessoa (tipo, id, nome, cpf, cnpj) values ('F', 1, 'Ana Maria', '123456789-11', null);
insert into pessoa (tipo, id, nome, cpf, cnpj) values ('F', 2, 'Fulano de Tal', '123456789-22', null);
insert into pessoa (tipo, id, nome, cpf, cnpj) values ('J', 3, 'Mundo dos Filtros', null,  '123456789/0001-10');
insert into pessoa (tipo, id, nome, cpf, cnpj) values ('J', 4, 'Americanas', null, '123456789/0001-20');
-- fim

-- início
-- @Inheritance(strategy = InheritanceType.JOINED)
-- insert into pessoa (id, nome) values (1, 'Ana Maria');
-- insert into pessoa (id, nome) values (2, 'Fulano de Tal');
-- insert into pessoa (id, nome) values (3, 'Mundo dos Filtros');
-- insert into pessoa (id, nome) values (4, 'Americanas');
--
-- insert into pessoa_fisica (cpf, pessoa_id) values ('123456789-11', 1);
-- insert into pessoa_fisica (cpf, pessoa_id) values ('123456789-22', 2);
--
-- insert into pessoa_juridica (cnpj, pessoa_id) values ('123456789/0001-10', 3);
-- insert into pessoa_juridica (cnpj, pessoa_id) values ('123456789/0001-20', 4);
-- fim

-- início
-- @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
-- insert into pessoa_fisica (id, nome, cpf) values (1, 'Ana Maria', '12345678911');
-- insert into pessoa_fisica (id, nome, cpf) values (3, 'Fulano de Tal', '12345678922');
--
-- insert into pessoa_juridica (id, nome, cnpj) values (2, 'Mundo dos Filtros', '123456789000110');
-- insert into pessoa_juridica (id, nome, cnpj) values (4, 'Americanas', '123456789000120');
-- fim


insert into produto (descricao, valor) values ('curvo ultrawide', 2500.00);
insert into produto (descricao, valor) values ('flat ultrawidr', 800.00);
insert into produto (descricao, valor) values ('curvo 34 pol', 2000.00);
insert into produto (descricao, valor) values ('flat 34 pol', 1500.00);

insert into venda (data, pessoa_id) values ('2023-03-12', 1);
insert into venda (data, pessoa_id) values ('2023-03-15', 2);
insert into venda (data, pessoa_id) values ('2023-03-17', 4);

insert into item_venda (quantidade, produto_id, venda_id) values (1, 1, 1);
insert into item_venda (quantidade, produto_id, venda_id) values (1, 2, 1);
insert into item_venda (quantidade, produto_id, venda_id) values (1, 3, 2);
insert into item_venda (quantidade, produto_id, venda_id) values (1, 4, 3);
insert into item_venda (quantidade, produto_id, venda_id) values (2, 2, 3);
