CREATE SCHEMA IF NOT EXISTS farmacia_linlin_schema;
CREATE TABLE `farmacia_linlin_schema`.`Proveedor`(
PRIMARY KEY (`proveedor_id`),
`proveedor_id` INT NOT NULL AUTO_INCREMENT,
`direccion`VARCHAR (100) NOT NULL,
`telefono`INT NOT NULL,
`rut`VARCHAR (15) NOT NULL,
`nombre`VARCHAR(40) NOT NULL);

CREATE TABLE `farmacia_linlin_schema`.`proveedor_articulo`(
PRIMARY KEY (`proveedor_articulo_id`),
`proveedor_articulo_id` INT NOT NULL AUTO_INCREMENT);

CREATE TABLE `farmacia_linlin_schema`.`articulo`(
PRIMARY KEY (`articulo_id`),
`articulo_id` INT NOT NULL AUTO_INCREMENT,
`nombre`VARCHAR(40) NOT NULL,
`precio`INT NOT NULL);

ALTER TABLE farmacia_linlin_schema.proveedor_articulo ADD proveedor_id INT NOT NULL; 
ALTER TABLE farmacia_linlin_schema.proveedor_articulo ADD CONSTRAINT articuloProveedor FOREIGN KEY (proveedor_id) REFERENCES farmacia_linlin_schema.proveedor(proveedor_id);
ALTER TABLE farmacia_linlin_schema.proveedor_articulo ADD articulo_id INT NOT NULL; 
ALTER TABLE farmacia_linlin_schema.proveedor_articulo ADD CONSTRAINT proveedorarticuloarticulo_idarticulo_idarticulo_idArticulo FOREIGN KEY (articulo_id) REFERENCES farmacia_linlin_schema.articulo(articulo_id);
