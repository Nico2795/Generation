// function checkEmptyString(str) {
//     if(str ==="") {
//     console.log("This string is empty");
// }
//     else{console.log(str.charAt(0))
//     }
// }
//   // Example test, should return a
// checkEmptyString("apple")
function checkTwoStringsSame(str1, str2) {
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    if(str1 == str2) {
        return true
    }
    else {
        return false
    }
}
console.log(checkTwoStringsSame("String", "string"))