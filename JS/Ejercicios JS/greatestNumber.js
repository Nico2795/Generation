function greatestNumber(lista1, lista2) {
    let listas = lista1.concat(lista2);
    let mayor = listas[0]
    for(var i = 0; i<listas.length ; i++) {
        if(mayor<listas[i]){
            mayor = listas [i]
        }
    }
    return mayor
}
console.log(greatestNumber([5,7,200],[1,2,10]))