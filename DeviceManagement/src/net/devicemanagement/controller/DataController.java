/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.devicemanagement.controller;

import java.util.List;
import net.devicemanagement.view.model.Employee;
import net.devicemanagement.view.model.Laptop;
import net.devicemanagement.view.model.Monitor;
import net.devicemanagement.view.model.Pc;
import net.devicemanagement.view.model.Phone;

/**
 *
 * @author Tuan Anh
 */
/*
lớp interface để nêu ra các hành động cần được thực hiện, nhưng interface lại
không nói hành động được thực hiện ntn
việc thực hiện chi tiết do các lớp thực thi interface đảm nhiệm
vd: DataControllerImp
 */
public interface DataController {

    int PHONE = 1;
    int PC = 2;
    int LAPTOP = 3;
    int MONITOR = 4;
    int EMPLOYEE = 5;
    int BORROWING = 6;

    String PHONE_FILE = "PHONE.DAT";

    String PC_FILE = "PC.DAT";

    String LAPTOP_FILE = "LAPTOP.DAT";

    String MONITOR_FILE = "MONITOR.DAT";

    String EMPLOYEE_FILE = "EMPLOYEE.DAT";
    
    String BORROWING_FILE = "BORROWING.DAT";

    <T> void writeToFile(List<T> data, String fileName);

    <T> List<T> readDataFromFile(String fileName);

    void sortPhoneByNameASC(List<Phone> phones);

    void sortPhoneByNameDESC(List<Phone> phones);

    void sortPhoneByPhaseASC(List<Phone> phones);

    void sortPhoneByPhaseDESC(List<Phone> phones);

    List<Phone> searchPhoneByImei(List<Phone> phones, String key);

    List<Phone> searchPhoneByName(List<Phone> phones, String key);

    List<Phone> searchPhoneByPhase(List<Phone> phones, String key);

    void sortPcByChipASC(List<Pc> pcs);

    void sortPcByChipDESC(List<Pc> pcs);

    void sortPcByRamASC(List<Pc> pcs);

    void sortPcByRamDESC(List<Pc> pcs);

    List<Pc> searchPcBySerial(List<Pc> pcs, String key);

    List<Pc> searchPcByName(List<Pc> pcs, String key);

    List<Pc> searchPcByRam(List<Pc> pcs, String key);

    void sortLaptopByChipASC(List<Laptop> laptops);

    void sortLaptopByChipDESC(List<Laptop> laptops);

    void sortLaptopByRamASC(List<Laptop> laptops);

    void sortLaptopByRamDESC(List<Laptop> laptops);

    List<Laptop> searchLaptopBySerial(List<Laptop> laptops, String key);

    List<Laptop> searchLaptopByName(List<Laptop> laptops, String key);

    List<Laptop> searchLaptopByRam(List<Laptop> laptops, String key);

    void sortMonitorByNameASC(List<Monitor> monitors);

    void sortMonitorByNameDESC(List<Monitor> monitors);

    void sortMonitorBySizeASC(List<Monitor> monitors);

    void sortMonitorBySizeDESC(List<Monitor> monitors);

    List<Monitor> searchMonitorBySerial(List<Monitor> monitors, String key);

    List<Monitor> searchMonitorByName(List<Monitor> monitors, String key);

    List<Monitor> searchMonitorBySize(List<Monitor> monitors, String key);

    void sortEmployeeByNameASC(List<Employee> employees);

    void sortEmployeeByNameDESC(List<Employee> employees);

    void sortEmployeeByIdASC(List<Employee> employees);

    void sortEmployeeByIdDESC(List<Employee> employees);
    
    List<Employee> searchEmployeeById(List<Employee> employees, String key);
    
    List<Employee> searchEmployeeByName(List<Employee> employees, String key);
    
    List<Employee> searchEmployeeByDept(List<Employee> employees, String key);

}
