function esPrimo(x){
    if(x<=1){
        return false;
    }
    else{
        for(var i = 2; i <= x-1 ; i++){
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

for(var i = 1 ; i <=23; i++) {
    if(esPrimo(i)) {
        console.log(i + ", Es primo");
    }
    else{console.log( i + ", No es primo");
    }
}
// Opcion 2 --> While

var cont = 1; 
 //Le digo que funcione hasta que yo quiera con un break

while(true){
    if(esPrimo(cont)) {
        console.log(cont + ", Es primo")
    }
    else{
        console.log(cont + ", No es primo")
    }
    if(cont == 23) {
        break
    }
    cont++;
}
