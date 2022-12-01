CREATE TABLE IF NOT EXISTS imovel(
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    tipo VARCHAR(255) NOT NULL,
    valor NUMERIC(8,2) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS usuario(
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS aluguel(
    id BIGINT NOT NULL AUTO_INCREMENT,
    data_inicio DATE NOT NULL,
    data_fim DATE NOT NULL,
    imovel_id BIGINT NOT NULL,
    usuario_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (imovel_id) REFERENCES imovel(id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE IF NOT EXISTS pagamento(
    id BIGINT NOT NULL AUTO_INCREMENT,
    valor DECIMAL(10,2) NOT NULL,
    data DATE NOT NULL,
    aluguel_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (aluguel_id) REFERENCES aluguel(id)
);