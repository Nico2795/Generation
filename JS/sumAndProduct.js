function sumA(numeros){
    let suma = 0
    for(i = 0; i< numeros.length ; i++){
        suma = suma + numeros[i] 
        }
        //0 = 0+1
        //1 = 1+2
        //3 
    return suma
}
console.log(sumA([1,2]))

function Multiplicacion(numeros) {
    let mult = 1
    for(i=0;i<numeros.length;i++){
        mult = mult * numeros[i]
    }
    //1= 1*6
    //6 = 6*2
    //12
    return mult
}
console.log(Multiplicacion([6,2]))

// //function sumAndProduct(numeros){
//     let sum = 0;
//     let mult = 1;
//     numeros.forEach(item => {
//         sum= sum+item;
//     });
//     console.log("La suma es " + sum);
//     return sum;
// }
// sumAndProduct([2,2])//


function sumaymultiplicacion(numeros){
    console.log("la suma es " + sumA(numeros) + "Y la multiplicacion es " + Multiplicacion(numeros))

}
sumaymultiplicacion([8,2])