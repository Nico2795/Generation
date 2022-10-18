/*function checkEmptyString(str) {
    if (str === ""){
        console.log("this string is empty")
    }
    else {
        console.log(str.charAt(0))
    }
}
checkEmptyString("")*/

//Comparar 2 strings y ver si
//Son iguales(==)
//Devolver un true si son iguales, false si no.

function compararStr(str1,str2) {
    if(str1 == str2) {
        console.log("true")
    }
    else { console.log("false")
    }
    toString(str1,str2)
}
compararStr("hola", "Hola")
console.log(typeof(compararStr))