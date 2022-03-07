   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller.sort;

import java.util.Comparator;
import net.devicemanagement.view.model.Monitor;

/**
 *
 * @author Tuan Anh
 */
public class SortMonitorByNameDESC implements Comparator<Monitor> {

    @Override
    public int compare(Monitor o1, Monitor o2) {
        return o2.getName().compareTo(o1.getName());
    }

}
