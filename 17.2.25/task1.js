function multiplicationTable() {
    let a= prompt("Enter the table number: ");
    let b=prompt("Enter the limit: ");
    for(let i=1;i<=b;i++)
    {
        console.log(a+" x "+i+"= "+ a*i)
    }
}
multiplicationTable()