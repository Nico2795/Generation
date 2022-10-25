/* Don José hace un 5% de descuento a los clientes que compran más de 3 productos y al
menos uno de ellos tiene un valor mayor a 10.000, realiza una función que calcule el
total verificando si corresponde o no el descuento */
//Crear una variable que me almacene el total
//Crear una funcion que m erecnonozca 3 items o más, y si supera los 3 m eaplique un descuento
// Crear una funcion que me reconozca el numero mas alto dentro del array y si este numero más alto es mayor a 10000 se aplica el descuento
function descuento5(productos){
    valores = 0;
    totales =productos.forEach(x => { valores += x});
    let max = productos[0];
    for(i=0; i<productos.length; i++){
        if(max<productos[i] && max > 10000 || productos.length>3){
            max= productos[i]
        }
    }
    return valores
}
console.log(descuento5([1,2,10000,2]))