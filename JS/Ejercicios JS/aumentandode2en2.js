function numbers (array) {
    let x = 0;
    do{ 
        console.log(x)
        if(x===array) {
            break;
        }
    x = x+2
    }while (x>=1);
}
numbers(50)