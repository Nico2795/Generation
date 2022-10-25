//TAREA1
//En primer lugar vamos a definir una función que pida una lista de precios de los productos y tambíen el día.
//Luuego necesitamos definir una variable donde almacenar el total que proviene de la suma de todos los valores dentro de la lista. 
//Luego hacer un condicional, si el dia ingresado corresponde al día mertes o jueves, que el programa nos devuelva el total junto con el descuento aplicado de un 20%
//Además si el día ingresado corresponde a cualquier otro día de la semana, que me entregue solo el valor del total sin el descuento
//Y por ultimo, si se ingresa un dato erroeno, que me muestre en pantalla un error


function total(productos,dia){
    valores = 0;
    productos.forEach(x => { valores += x});
    if(dia === "martes" || dia === "jueves"){
    return ("En este día tenemos descuento por lo que tu total sería ") + valores * 0.8;
    }
    else if(dia === "lunes" || dia === "miercoles" || dia === "viernes" || dia === "sabado" || dia === "domingo") {
        return ("Estos días no hay descuento, por lo que tu total sería: ") + valores;
    }
    else{return "error"}
}
console.log(total([1,2,3],"jueves"))

// TAREA 2
//Crear una funcion que pida una lista de precios  y si se ingresan más de 3 y al menos uno de ellos es mayor a 10000 que se aplique un descuento del 5%
//Crear una variable que almacene cúal será el número mayor
//Crear un bucle forEach, para que se vayan comparando y ocupando el lugar de max el elemento que contenga mayor valor
//Crear una variable que almacene el total y su respectivo bucle para sumar todos los elementos dentro de la lista
//Crear un condicional de que si el largo de la lista es mayor a 3 y si el numero mayor es mayor a 10000 entonces se aplica el descuento al total.
function descuento5(producto) {
    max = producto[0]
    producto.forEach(x => { if(max < x) max = x});
    valores = 0;
    producto.forEach(x => { valores += x});
    if(producto.length > 3 && max > 10000) {
        return "Llevas más de 3 productos y al menos uno de ellos es mayor a 10000 por lo que tienes un descuento, el total es : " + valores * .95
    };
    return valores
}
console.log(descuento5([1,2,100000,3]))

//Crear una función que determine si algún número ingresado en la lista es negativo, y si es así que me determine en que posición está ese número
//Definir una variable que almacene el número menor con su respectivo bucle
//Definir una condicional que diga, si el número menor es menor que 0, la consola me muestre un mensaje de error y que muestre la posición de ese número negativo
//Si no hay ningún número negativo que me de un mensaje positivo.

function numeronegativo(producto) {
    min= producto[0];
    producto.forEach(x => { if(min > x) min = x});
    if(min < 0){
        return "Hay un numero negativo en la posicion " + producto.indexOf(min) + " Y corresponde al número " + min;
    }
    else{
        return "Los numeros ingresados son correctos"
    }
}
console.log(numeronegativo([1,2,3,4,-5,6]))

function valorMayor(productos){
    max = [0];
    productos.forEach(x => {if(max< x) max= x});
    return max
}
console.log(valorMayor([200,5500,900,7000,500,300]))

function valorMenor(producto) {
    min= producto[0];
    producto.forEach(x => { if(min > x) min = x});
    return min
}
console.log(valorMenor([200,5500,900,7000,500,300]))


