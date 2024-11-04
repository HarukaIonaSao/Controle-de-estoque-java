CREATE DATABASE IF NOT EXISTS controle_estoque;
USE controle_estoque;
#DESCRIBE categorias;
#DESCRIBE fornecedores;
#DESCRIBE produtos;
#DESCRIBE transacoes;

-- Categorias
CREATE TABLE categorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

-- Fornecedores
CREATE TABLE fornecedores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    contato VARCHAR(255)
);

#Produtos- NOT NULL- campo obrigatório
CREATE TABLE produtos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    preco DECIMAL(10, 2) NOT NULL,
    categoria_id INT,
    fornecedor_id INT,
    estoque INT DEFAULT 0,
    FOREIGN KEY (Categoria_id) REFERENCES categorias(Id),
    FOREIGN KEY (Fornecedor_id) REFERENCES fornecedores(Id)
);

--  Transações
CREATE TABLE transacoes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    produto_id INT,
    tipo ENUM('ENtrada', 'Saida') NOT NULL,
    quantidade INT NOT NULL,
    data TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (Produto_id) REFERENCES PRodutos(id)
);

#Testes
-- Inserindo categorias
INSERT INTO categorias (nome) VALUES ('Eletrônicos');
INSERT INTO categorias (nome) VALUES ('Alimentos');
INSERT INTO categorias (nome) VALUES ('Roupas');

-- Inserindo fornecedores
INSERT INTO fornecedores (nome, contato) VALUES ('Fornecedor A', 'contato@fornecedora.com');
INSERT INTO fornecedores (nome, contato) VALUES ('Fornecedor B', 'contato@fornecedorB.com');

-- Inserindo produtos
INSERT INTO produtos (nome, descricao, preco, categoria_id, fornecedor_id, estoque) 
VALUES ('Smartphone', 'Smartphone de última geração', 999.99, 1, 1, 50);
INSERT INTO produtos (nome, descricao, preco, categoria_id, fornecedor_id, estoque) 
VALUES ('Arroz', 'Arroz branco tipo 1', 20.00, 2, 1, 200);
INSERT INTO produtos (nome, descricao, preco, categoria_id, fornecedor_id, estoque) 
VALUES ('Camisa', 'Camisa de algodão', 49.90, 3, 2, 100);

-- Inserindo transações
INSERT INTO transacoes (produto_id, tipo, quantidade) VALUES (1, 'entrada', 10);
INSERT INTO transacoes (produto_id, tipo, quantidade) VALUES (2, 'saida', 5);
INSERT INTO transacoes (produto_id, tipo, quantidade) VALUES (3, 'entrada', 20);

