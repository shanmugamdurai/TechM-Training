var operation = () => {
    var choice =prompt("Enter your choice: ");
    var a = prompt("Enter a number: ");
    var b=prompt("Enter a number: ");
    switch(choice) {
        case "add" :
            var sum = function(a,b) {
                return a+b;
            }
            console.log(sum(a,b));
            break;
        case "subtract" :
            var sub = function(a,b) {
                return a-b;
            }
            console.log(sub(a,b));
            break;
        case "multiply" :
            var mul = function(a,b) {
                return a*b;
            }
            console.log(mul(a,b));
            break;
        case "divide" :
            var quotient = function(a,b) {
                return a/b;
            }
            console.log(quotient(a,b));
            var remainder = function(a,b) {
                return a%b;
            }
            console.log(remainder(a,b));
            break;
        default:
             console.log("Invalid choice");
    }
}
operation()