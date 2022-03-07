/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.devicemanagement.controller;

import java.util.List;
import net.devicemanagement.view.model.Borrowing;


/**
 *
 * @author Tuan Anh
 */
public interface InfoFilter {
    //kiểm tra xem thiết bị đã tồn tại trong danh sách hay chưa 
    boolean isRecordExist(List<Borrowing> borrowings, Borrowing r);     
}
