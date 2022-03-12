/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller.sort;

import java.util.Comparator;
import net.devicemanagement.view.model.GiveBack;

/**
 *
 * @author Tuan Anh
 */
public class SortGiveBackByEmployeeNameDESC implements Comparator<GiveBack> {

    @Override
    public int compare(GiveBack o1, GiveBack o2) {
        return o2.getEmployee().getFullName().compareTo(o1.getEmployee().getFullName());
    }
}
