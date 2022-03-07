/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.view.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author anhbt
 */
public class Employee extends Person {
    private String employeeId;
    private String employeeDept;
    private String employeeEmail;

    public Employee() {
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(String employeeId, String id) {
        super(id);
        this.employeeId = employeeId;
    }

    public Employee(String employeeId, String employeeDept, 
            String employeeEmail, String id, String address, String phoneNumber, 
            String fullName, String dob) {
        super(id, address, phoneNumber, fullName, dob);
        this.employeeId = employeeId;
        this.employeeDept = employeeDept;
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeDept() {
        return employeeDept;
    }

    public void setEmployeeDept(String employeeDept) {
        this.employeeDept = employeeDept;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.employeeId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.employeeId, other.employeeId)) {
            return false;
        }
        return true;
    }


    
    
    
}

