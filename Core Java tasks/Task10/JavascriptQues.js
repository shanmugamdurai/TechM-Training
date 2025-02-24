const student = {
    id : 57,
    name: "Shanmugam",
    department :"ECE",
    details : function() {
       return this.id+" "+this.name+" "+this.department;
    },
      address : {
          doorNo : "7/11",
          street: "Anna street",
          addressDetails : function() {
            return this.doorNo+" "+this.street;
          },
          onlyDoorNo : function() {
            return this.doorNo;
          }
      } 
}
console.log(student.id);
console.log(student.name);
console.log(student.department);
console.log(student.details());
console.log(student.address.addressDetails());
console.log(student.address.onlyDoorNo());
delete student.department;
delete student.address.onlyDoorNo();
console.log(student);

