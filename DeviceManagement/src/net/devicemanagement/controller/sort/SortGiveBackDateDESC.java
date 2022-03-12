/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller.sort;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import net.devicemanagement.view.model.GiveBack;

/**
 *
 * @author Tuan Anh
 */
public class SortGiveBackDateDESC implements Comparator<GiveBack> {

    @Override
    public int compare(GiveBack o1, GiveBack o2) {
        var format = "dd/MM/yyyy HH:mm:ss";
        var dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(o2.getGiveBackDate()).compareTo(dateFormat.format(o1.getGiveBackDate()));
    }
}
