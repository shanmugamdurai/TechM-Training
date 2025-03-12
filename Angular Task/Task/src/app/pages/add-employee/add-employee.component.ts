import { Component } from '@angular/core';
import { Employee, EmployeeService } from '../../services/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrl: './add-employee.component.css'
})
export class AddEmployeeComponent {
  constructor(private employeeService: EmployeeService) {}

  onSubmit(form: any) {
    const newEmployee: Employee = form.value;
    this.employeeService.addEmployee(newEmployee).subscribe(() => {
      console.log('Employee added successfully');
      form.reset();
    });
  }
}
