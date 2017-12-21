CREATE TABLE product (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	price DECIMAL(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO product (name, price) values ('Computador', 200.00);
INSERT INTO product (name, price) values ('Impressora', 800.00);
INSERT INTO product (name, price) values ('Mouse', 80.00);
