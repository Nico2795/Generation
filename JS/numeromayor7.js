function numeroMayor(numero){
    let mayor = numero[0]
    for(var i=0; i<numero.length;i++) {
        if(mayor<numero[i]) {
            mayor = numero[i]
        }
    }
    return mayor;
}
console.log(numeroMayor([3, 5, 7, 1, 6]))
