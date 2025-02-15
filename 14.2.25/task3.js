var a = 23
if(isPrime(a)) {
    console.log("Prime Number")
}
else {
    console.log("Not a Prime number")
}
function isPrime(a)
{
    if(a<2) {
        return false;
    }
    for(var i =2;i<=9;i++)
    {
        if(a%i==0) {
            return false;
        }
    }
    return true;
}