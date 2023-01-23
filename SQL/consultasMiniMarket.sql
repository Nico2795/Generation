
#--------------------------------------------------------------------------------------------#
#JOIN#
#Contecto tablas para que me muestre en pantalla el nombre del producto, el id del producto que viene de la tabla venta_producto, el precio unitario del producto. También que me de una columna que cuente el total de veces que ese producto se vendió, y por último una columns que me muestre la ganancia total de ese producto en particular en un año dado #. 

SELECT producto.nombre,venta_producto.producto_id,producto.precio, count(nombre), sum(precio)
FROM minimarketJose_schema.producto 
inner JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
WHERE fecha between '2021-11-11' and '2022-11-11'
and nombre = 'cartulina';

SELECT producto.nombre,venta_producto.producto_id,producto.precio, count(nombre), sum(precio)
FROM minimarketJose_schema.producto 
JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
WHERE fecha between '2021-11-11' and '2022-11-11'
and nombre = 'paracetamol'
;

SELECT producto.nombre,venta_producto.producto_id,producto.precio, count(nombre), sum(precio)
FROM minimarketJose_schema.producto 
inner join minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
WHERE fecha between '2021-11-11' and '2022-11-11'
and nombre = 'paño de cocina '
;
SELECT producto.nombre,venta_producto.producto_id,producto.precio, count(nombre), sum(precio)
FROM minimarketJose_schema.producto 
 inner JOIN minimarketJose_schema.venta_producto on minimarketJose_schema.producto.producto_id = minimarketJose_schema.venta_producto.producto_id
WHERE fecha between '2021-11-11' and '2022-11-11'
and nombre = 'pan de molde'
;

#----------------------------------------------------#
#Cantidad total de ganancias en un año#
SELECT SUM(total) 
FROM minimarketJose_schema.venta_producto
WHERE fecha between '2021-11-11' and '2022-11-11';
#Cantidad de productos vendidos en un año#
SELECT count(producto_id) 
FROM minimarketJose_schema.venta_producto
WHERE fecha between '2021-11-11' and '2022-11-11';

#---------------------------------------------------------------------------------------------------------------------------------#
