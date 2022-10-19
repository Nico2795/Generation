function highestToLowest(lista) {
    let numeros = lista.sort((a,b)=>b-a);
    return numeros
}
console.log(highestToLowest([1,5,6,8,9]))