#Poblar la base con al menos 5 productos#
#Poblar la base con al menos 4 tipos de productos#
INSERT INTO minimarket_schema.vendedor (vendedor_id, nombre, rut)
VALUES(1, 'Jose', 12628546-8);
INSERT INTO minimarket_schema.cliente (cliente_id, nombre, rut, correo)
VALUES(1, 'Nico', 191866819, 'nico2795@gmail.com');
INSERT INTO minimarket_schema.cliente (cliente_id, nombre, rut, correo)
VALUES(2, 'Marco', 192584961, 'marco@gmail.com');
INSERT INTO minimarket_schema.proveedor (proveedor_id, nombre, direccion, telefono)
VALUES(1, 'Nicole', 'casanicole123', 123456789);
INSERT INTO minimarket_schema.producto (nombre, precio)
VALUES('paracetamol',500);
INSERT INTO minimarket_schema.producto (nombre, precio)
VALUES('cartulina', 490);
INSERT INTO minimarket_schema.producto (nombre, precio)
VALUES('pan de molde ', 1800);
INSERT INTO minimarket_schema.producto (nombre, precio)
VALUES('paño de cocina', 1000);
INSERT INTO minimarket_schema.producto (nombre, precio)
VALUES('manqueque', 850);
INSERT INTO minimarket_schema.tipoProducto (nombre, producto_id)
VALUES('medicamento', 1);


SELECT * FROM minimarket_schema.producto;
SELECT * FROM minimarket_schema.tipoProducto







