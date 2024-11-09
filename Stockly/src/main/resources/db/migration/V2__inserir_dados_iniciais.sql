INSERT INTO produto (nome, preco) VALUES ('Produto 1', 100.00);
INSERT INTO produto (nome, preco) VALUES ('Produto 2', 200.00);

INSERT INTO pedido (total) VALUES (300.00);

INSERT INTO pedido_produto (pedido_id, produto_id) VALUES (1, 1);
INSERT INTO pedido_produto (pedido_id, produto_id) VALUES (1, 2);