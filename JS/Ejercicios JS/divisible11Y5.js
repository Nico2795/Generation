function divisible (numero) {
    if(numero % 11 === 0 && numero % 5 === 0) {
        console.log("El numero " + numero + " es divisible por 11 y 5");
    }
    else {
        console.log("El numero ingresado no es divisible por 11 ni 5")
    }
}
divisible([])