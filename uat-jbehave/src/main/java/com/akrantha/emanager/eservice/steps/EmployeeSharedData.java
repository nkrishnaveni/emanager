package com.akrantha.emanager.eservice.steps;

import com.akrantha.emanager.dtos.Employee;
import com.akrantha.emanager.dtos.EmployeeCollection;
import com.akrantha.emanager.dtos.ErrorDTO;

public class EmployeeSharedData {
    private Employee requestEmployee, responseEmployee;

    private EmployeeCollection employeeCollection;

    private ErrorDTO error;

    public Employee getRequestEmployee() {
        return requestEmployee;
    }

    public void setRequestEmployee(Employee requestEmployee) {
        this.requestEmployee = requestEmployee;
    }

    public Employee getResponseEmployee() {
        return responseEmployee;
    }

    public void setResponseEmployee(Employee responseEmployee) {
        this.responseEmployee = responseEmployee;
    }

    public EmployeeCollection getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(EmployeeCollection employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    public ErrorDTO getError() {
        return error;
    }

    public void setError(ErrorDTO error) {
        this.error = error;
    }

}
