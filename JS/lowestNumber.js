function lowestNumber(numero){
    let min = numero[0];
    for(i=0; i<numero.length; i++){
        if(min>numero[i]){
            min= numero[i]
        }
    }
    return min
}
console.log(lowestNumber([-6,5,10,20]))
