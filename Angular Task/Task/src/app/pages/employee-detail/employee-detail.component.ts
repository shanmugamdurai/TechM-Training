import { Component } from '@angular/core';
import { Employee, EmployeeService } from '../../services/employee.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-employee-detail',
  templateUrl: './employee-detail.component.html',
  styleUrl: './employee-detail.component.css'
})
export class EmployeeDetailComponent {
  employee!: Employee;

  constructor(private route: ActivatedRoute, private employeeService: EmployeeService) {}

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.employeeService.getEmployeeById(id).subscribe((data) => {
      this.employee = data;
    });
  }
}
