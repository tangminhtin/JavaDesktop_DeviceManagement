/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller.sort;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import net.devicemanagement.view.model.Borrowing;

/**
 *
 * @author Tuan Anh
 */
public class SortBorrowingDateDESC implements Comparator<Borrowing> {

    @Override
    public int compare(Borrowing o1, Borrowing o2) {
        var format = "dd/MM/yyyy HH:mm:ss";
        var dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(o2.getBorrowingDate()).compareTo(dateFormat.format(o1.getBorrowingDate()));
    }
}
