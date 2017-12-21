CREATE TABLE product_category (
	product_id BIGINT(20) NOT NULL,
	category_id BIGINT(20) NOT NULL,
	PRIMARY KEY (product_id, category_id),
	FOREIGN KEY (product_id) REFERENCES product(id),
	FOREIGN KEY (category_id) REFERENCES category(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO product_category (product_id, category_id) values (1, 1);
INSERT INTO product_category (product_id, category_id) values (2, 1);
INSERT INTO product_category (product_id, category_id) values (3, 1);
INSERT INTO product_category (product_id, category_id) values (2, 2);