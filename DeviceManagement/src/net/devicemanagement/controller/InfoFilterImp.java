/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.devicemanagement.view.model.Borrowing;


/**
 *
 * @author Tuan Anh
 */
public class InfoFilterImp implements InfoFilter {
  
    @Override
    public boolean isRecordExist(List<Borrowing> borrowings, Borrowing r) {
        return borrowings.contains(r);
    }
}
