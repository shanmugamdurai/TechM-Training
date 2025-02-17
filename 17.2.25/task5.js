const student = {
    id : 57,
    name: "Shanmugam",
    department :"ECE",
    college :"Panimalar",
    email: "abcd@gmail.com",
    details : function() {
       return this.id+" "+this.name+" "+this.department+" "+this.college+" "+this.email;
    },
      address : {
          doorNo : "7/11",
          street: "Anna street",
          area : "Arumbakkam",
          pincode :"600091",
      } 
    
}
student.impDetails = function() {
    return this.id + " "+this.name+" "+this.email;
}
student.fullDetails = function() {
    return this.id+" "+this.name+" "+this.department+" "+this.college+" "+this.email+" "+this.address.doorNo+" "+this.address.street+" "+this.address.area+" "+this.address.pincode;
}
console.log(student.details())
console.log(student.impDetails())
console.log(student.fullDetails())
delete student.email;
delete student.address;
console.log(student)