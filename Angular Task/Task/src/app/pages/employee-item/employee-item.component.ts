import { Component, Input } from '@angular/core';
import { Employee } from '../../services/employee.service';

@Component({
  selector: 'app-employee-item',
  templateUrl: './employee-item.component.html',
  styleUrl: './employee-item.component.css'
})
export class EmployeeItemComponent {
  @Input() employee!: Employee;
}
