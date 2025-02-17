function sumOfDig(a) {
    let sum=0;
    while(a>0) {
        sum += a%10;
        a = Math.floor(a/10);
    }
    return sum;
}
var num = prompt("Enter a number : ")
var a = sumOfDig(num);
if(a%2==0) {
    console.log("Sum of the digits is an even number")
}
else {
    console.log("Sum of the digits is a odd number")
}