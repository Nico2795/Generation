function descuento(producto,dia){
    var valores = 0
    var total = producto.forEach(x => { valores += x});
    if(dia == "martes" || dia =="jueves"){
        total = (producto + total) *0.8
}
return total
}
console.log(descuento([200,200,200],"martes"))

//crear la funcion con los parametros producto y dia
//Luego crear una variable que saque el total de los productos
//Luego crear una condicion para que si los dias son martes o jueves me devuelva un descuento
