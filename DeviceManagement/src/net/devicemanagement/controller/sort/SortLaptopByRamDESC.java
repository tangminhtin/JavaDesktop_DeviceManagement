/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller.sort;

import java.util.Comparator;
import net.devicemanagement.view.model.Laptop;

/**
 *
 * @author Tuan Anh
 */
public class SortLaptopByRamDESC implements Comparator<Laptop> {

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o2.getRam().compareTo(o1.getRam());
    }

}
