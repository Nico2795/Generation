CREATE SCHEMA IF NOT EXISTS miniMarket_schema;
CREATE TABLE `minimarket_schema`.`vendedor`(
PRIMARY KEY(`vendedor_id`),
`vendedor_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR (100) NOT NULL,
`rut`VARCHAR (15) NOT NULL);

CREATE TABLE `minimarket_schema`.`cliente`(
PRIMARY KEY(`cliente_id`),
`cliente_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR (100) NOT NULL,
`rut`VARCHAR (15) NOT NULL,
`correo` VARCHAR(30) NOT NULL );

CREATE TABLE `minimarket_schema`.`venta`(
PRIMARY KEY(`venta_id`),
`venta_id` INT NOT NULL AUTO_INCREMENT);

CREATE TABLE `minimarket_schema`.`venta_producto`(
PRIMARY KEY(`venta_producto_id`),
`venta_producto_id` INT NOT NULL AUTO_INCREMENT);

CREATE TABLE `minimarket_schema`.`producto`(
PRIMARY KEY(`producto_id`),
`producto_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(40) NOT NULL,
`precio`INT NOT NULL);

CREATE TABLE `minimarket_schema`.`proveedor_producto`(
PRIMARY KEY(`proveedor_producto_id`),
`proveedor_producto_id` INT NOT NULL AUTO_INCREMENT);

CREATE TABLE `minimarket_schema`.`proveedor`(
PRIMARY KEY(`proveedor_id`),
`proveedor_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR (40) NOT NULL ,
`direccion `VARCHAR(100) NOT NULL,
`telefono` INT NOT NULL);

ALTER TABLE minimarket_schema.venta ADD vendedor_id INT NOT NULL;
 

