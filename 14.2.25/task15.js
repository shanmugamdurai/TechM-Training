var a =7
var b = a+50
for(let i=a;i<=b;i++) {
    if(i%5==0) {
        continue;
    }
    else {
        console.log(i)
    }
}