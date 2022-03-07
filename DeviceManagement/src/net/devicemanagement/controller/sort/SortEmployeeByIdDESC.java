/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller.sort;

import java.util.Comparator;
import net.devicemanagement.view.model.Employee;

/**
 *
 * @author Tuan Anh
 */
public class SortEmployeeByIdDESC implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getEmployeeId().compareTo(o1.getEmployeeId());
    }

}
