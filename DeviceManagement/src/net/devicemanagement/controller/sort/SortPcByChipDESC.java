/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller.sort;

import java.util.Comparator;
import net.devicemanagement.view.model.Pc;

/**
 *
 * @author Tuan Anh
 */
public class SortPcByChipDESC implements Comparator<Pc> {

    @Override
    public int compare(Pc o1, Pc o2) {
        return o2.getCpu().compareTo(o1.getCpu());
    }

}
