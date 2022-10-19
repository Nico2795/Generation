// FORMA 1
// function dobleNumber(numeros){
//     for(var i = 0; i<numeros.length ; i++){
//         console.log(numeros[i] * 2)
//     }
// }
// dobleNumber([3,6,8,10,20])

// FORMA 2
function dobleNumber(numeros){
    numeros.forEach(numeros=>console.log(numeros*2));
}
dobleNumber([3,6,8,10,20])