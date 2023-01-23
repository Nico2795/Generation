SELECT COUNT(producto.nombre) 
FROM minimarketJose_schema.producto
left JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
WHERE producto.nombre = 'paracetamol';
SELECT COUNT(producto.nombre) 
FROM minimarketJose_schema.producto
RIGHT JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
WHERE producto.nombre = 'cartulina';
SELECT COUNT(producto.nombre) 
FROM minimarketJose_schema.producto
RIGHT JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
WHERE producto.nombre = 'paño de cocina';
SELECT COUNT(producto.nombre) 
FROM minimarketJose_schema.producto
RIGHT JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
WHERE producto.nombre = 'pan de molde';
SELECT COUNT(producto.nombre) 
FROM minimarketJose_schema.producto
RIGHt JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
WHERE producto.nombre = 'manqueque';

#--------------------------------------------------------------------------------------------#
#JOIN#
#En esta tabla veo el nombre del producto junto con las ventas realizadas#
##Veo el nombre, el id del producto, su precio, me cuenta cuantos vendi en el año y el total de las ventas en el año de ese producto#
SELECT producto.nombre,venta_producto.producto_id,producto.precio, count(nombre), sum(precio)
FROM minimarketJose_schema.producto 
JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
#Devuelveme el id del producto con la cantidad vendida#
WHERE fecha between 20200000 and 20221111
and nombre = 'cartulina'
;

SELECT producto.nombre,venta_producto.producto_id,producto.precio, count(nombre), sum(precio)
FROM minimarketJose_schema.producto 
JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
#Devuelveme el id del producto con la cantidad vendida#
WHERE fecha between 20200000 and 20221111
and nombre = 'paracetamol'
;

SELECT producto.nombre,venta_producto.producto_id,producto.precio, count(nombre), sum(precio)
FROM minimarketJose_schema.producto 
JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
#Devuelveme el id del producto con la cantidad vendida#
WHERE fecha between 20200000 and 20221111
and nombre = 'paño de cocina '
;

SELECT SUM(total) 
FROM minimarketJose_schema.venta_producto
WHERE fecha between 20200000 and 20221111;

#---------------------------------------------------------------------------------------------------------------------------------#
#Necesito poner los precios de cada uno en total, para luego asociar la suam de los totales con la venta id#

#Entre estas fechas, se vendieron 3 productos, no especifica que, mostrar tambien el id del producto #
SELECT COUNT(producto.nombre)
FROM minimarketJose_schema.producto
JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
WHERE fecha between 20200000 and 20221111;
#Aqui me deberia mostrar la suma de todas las ventas realizadas en el año#




SELECT SUM(total) 
FROM minimarketJose_schema.venta_producto
WHERE producto_id=1;

SELECT SUM(total) 
FROM minimarketJose_schema.venta_producto
WHERE producto_id=2;

SELECT count(producto_id) 
FROM minimarketJose_schema.venta_producto
WHERE producto_id=2;


#Entre estas fechas se sumo tal cantidad de dinero, sin especificar que cosa, mostrar los id de cada venta#
SELECT SUM(total) 
FROM minimarketJose_schema.venta_producto
WHERE fecha between 20200000 and 20221111;

#Una tabla que me muestre los nombres o id de los productos con la suma de estos#

SELECT producto.nombre, venta_producto.total
FROM minimarketJose_schema.producto 
JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id;
