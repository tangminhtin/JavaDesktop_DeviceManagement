/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller.sort;

import java.util.Comparator;
import net.devicemanagement.view.model.Phone;

/**
 *
 * @author Tuan Anh
 */
public class SortPhoneByPhaseDESC implements Comparator<Phone> {

    @Override
    public int compare(Phone o1, Phone o2) {
        return o2.getPhase().compareTo(o1.getPhase());
    }

}
