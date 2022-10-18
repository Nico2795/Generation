//Función para averiguar si el número dado es divisible por 4 o por 9, y si no es por nínguno que arroje un "Falso".
function divisible (numero){
    if (numero % 4 == 0) {
        console.log("verdadero")
    }
    else if (numero % 9 == 0) {
        console.log("verdadero")
    }
    else {console.log("falso")}
}
divisible(15)