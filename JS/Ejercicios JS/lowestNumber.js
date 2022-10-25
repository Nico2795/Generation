function lowestNumber(numero){
    let min = numero[0];
    for(i=0; i<numero.length; i++){
        if(min>numero[i]){
            min= numero[i]
        }
        else if (min < 0){
            return "hay un numero negativo en la lista, en la posicion de " +
            numero.indexOf(min)
        }
    }
    return min
}
console.log(lowestNumber([6,5,10,-20]))
