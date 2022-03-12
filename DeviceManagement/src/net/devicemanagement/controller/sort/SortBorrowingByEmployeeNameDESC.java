/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller.sort;

import java.util.Comparator;
import net.devicemanagement.view.model.Borrowing;

/**
 *
 * @author Tuan Anh
 */
public class SortBorrowingByEmployeeNameDESC implements Comparator<Borrowing> {

    @Override
    public int compare(Borrowing o1, Borrowing o2) {
        return o2.getEmployee().getFullName().compareTo(o1.getEmployee().getFullName());
    }
}
