package az.pashabank.learning.session.service;

import az.pashabank.learning.session.model.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<EmployeeDto> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    public List<EmployeeDto> getEmployees() {
        return employees;
    }

    public EmployeeDto getEmployee(Long id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void createEmployee(EmployeeDto employeeDto) {
        employees.add(employeeDto);
    }

    public void updateEmployee(Long id,EmployeeDto employeeDto) {
        EmployeeDto employee = getEmployee(id);
        employees.remove(employee);
        employee.setName(employeeDto.getName());
        employee.setSurname(employeeDto.getSurname());
        employee.setAge(employeeDto.getAge());
        employees.add(employee);
    }

    public void deleteEmployee(Long id) {
        EmployeeDto employee = getEmployee(id);
        employees.remove(employee);
    }
}
