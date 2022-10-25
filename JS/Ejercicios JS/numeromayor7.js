function numeroMayor(numero){
    let mayor = numero[0]
    let valores = 0;
    let total = numero.forEach(x => { valores += x});
    for(var i=0; i<numero.length;i++) {
        if(mayor<numero[i]) {
            mayor = numero[i]
        }
        else if(mayor > 10000 && numero[3]){

        }
        return (valores * 0.8)
    }
}
console.log(numeroMayor([3, 5, 7, 1, 6]))
