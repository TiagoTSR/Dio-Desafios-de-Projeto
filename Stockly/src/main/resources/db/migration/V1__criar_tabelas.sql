CREATE TABLE produto (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL
);

CREATE TABLE pedido (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    total DECIMAL(10, 2) NOT NULL
);

CREATE TABLE pedido_produto (
    pedido_id BIGINT NOT NULL,
    produto_id BIGINT NOT NULL,
    FOREIGN KEY (pedido_id) REFERENCES pedido(id),
    FOREIGN KEY (produto_id) REFERENCES produto(id),
    PRIMARY KEY (pedido_id, produto_id)
);