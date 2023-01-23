CREATE SCHEMA IF NOT EXISTS minimarketJose_schema;
CREATE TABLE `minimarketJose_schema`.`vendedor`(
PRIMARY KEY(`vendedor_id`),
`vendedor_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR (100) NOT NULL,
`rut`VARCHAR (15) NOT NULL);

CREATE TABLE `minimarketJose_schema`.`cliente`(
PRIMARY KEY(`cliente_id`),
`cliente_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR (100) NOT NULL,
`rut`VARCHAR (15) NOT NULL,
`correo` VARCHAR(30) NOT NULL );

CREATE TABLE `minimarketJose_schema`.`venta`(
PRIMARY KEY(`venta_id`),
`venta_id` INT NOT NULL AUTO_INCREMENT);

CREATE TABLE `minimarketJose_schema`.`venta_producto`(
PRIMARY KEY(`venta_producto_id`),
`venta_producto_id` INT NOT NULL AUTO_INCREMENT);


CREATE TABLE `minimarketJose_schema`.`producto`(
PRIMARY KEY(`producto_id`),
`producto_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(40) NOT NULL,
`precio`INT NOT NULL);

CREATE TABLE `minimarketJose_schema`.`proveedor_producto`(
PRIMARY KEY(`proveedor_producto_id`),
`proveedor_producto_id` INT NOT NULL AUTO_INCREMENT);

CREATE TABLE `minimarketJose_schema`.`proveedor`(
PRIMARY KEY(`proveedor_id`),
`proveedor_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR (40) NOT NULL ,
`direccion` VARCHAR(100) NOT NULL,
`telefono` INT NOT NULL);

CREATE TABLE `minimarketJose_schema`.`tipoProducto`(
PRIMARY KEY(`tipoProducto_id`),
`tipoProducto_id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR (40) NOT NULL);

ALTER TABLE venta_producto
ADD fecha date not null; 
ALTER TABLE venta_producto
ADD total int ; 
#Cambiar total por precio#

ALTER TABLE minimarketJose_schema.venta ADD vendedor_id INT NOT NULL;
ALTER TABLE minimarketJose_schema.venta ADD CONSTRAINT vendedorVenta FOREIGN KEY (vendedor_id) REFERENCES minimarketJose_schema.vendedor(vendedor_id);
ALTER TABLE minimarketJose_schema.venta ADD cliente_id INT NOT NULL;
ALTER TABLE minimarketJose_schema.venta ADD CONSTRAINT clienteVenta FOREIGN KEY (cliente_id) REFERENCES minimarketJose_schema.cliente(cliente_id);
ALTER TABLE minimarketJose_schema.venta_producto ADD venta_id INT NOT NULL;
ALTER TABLE minimarketJose_schema.venta_producto ADD CONSTRAINT ventaProductoid FOREIGN KEY (venta_id) REFERENCES minimarketJose_schema.venta(venta_id);
ALTER TABLE minimarketJose_schema.venta_producto ADD producto_id INT NOT NULL;
ALTER TABLE minimarketJose_schema.venta_producto ADD CONSTRAINT productoVentaid FOREIGN KEY (producto_id) REFERENCES minimarketJose_schema.producto(producto_id);
ALTER TABLE minimarketJose_schema.proveedor_producto ADD producto_id INT NOT NULL;
ALTER TABLE minimarketJose_schema.proveedor_producto ADD CONSTRAINT productoProveedor FOREIGN KEY (producto_id) REFERENCES minimarketJose_schema.producto(producto_id);
ALTER TABLE minimarketJose_schema.proveedor_producto ADD proveedor_id INT NOT NULL;
ALTER TABLE minimarketJose_schema.proveedor_producto ADD CONSTRAINT proveedorProducto FOREIGN KEY (proveedor_id) REFERENCES minimarketJose_schema.proveedor(proveedor_id);
ALTER TABLE minimarketJose_schema.producto ADD tipoProducto_id INT NOT NULL;
ALTER TABLE minimarketJose_schema.producto ADD CONSTRAINT productoTipo FOREIGN KEY (tipoProducto_id) REFERENCES minimarketJose_schema.tipoProducto(tipoProducto_id);