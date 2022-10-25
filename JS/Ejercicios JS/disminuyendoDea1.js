function disminuyendo (numero){
    let x = numero;
    do{
        console.log(x)
        x--;
        if(x === 0){
            break;
        }
    }while(x>=1)
}
disminuyendo(5)