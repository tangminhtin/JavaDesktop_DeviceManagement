/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.devicemanagement.controller.sort.SortEmployeeByIdASC;
import net.devicemanagement.controller.sort.SortEmployeeByIdDESC;
import net.devicemanagement.controller.sort.SortEmployeeByNameASC;
import net.devicemanagement.controller.sort.SortEmployeeByNameDESC;
import net.devicemanagement.controller.sort.SortLaptopByChipASC;
import net.devicemanagement.controller.sort.SortLaptopByChipDESC;
import net.devicemanagement.controller.sort.SortLaptopByRamASC;
import net.devicemanagement.controller.sort.SortLaptopByRamDESC;
import net.devicemanagement.controller.sort.SortMonitorByNameASC;
import net.devicemanagement.controller.sort.SortMonitorByNameDESC;
import net.devicemanagement.controller.sort.SortMonitorBySizeASC;
import net.devicemanagement.controller.sort.SortMonitorBySizeDESC;
import net.devicemanagement.controller.sort.SortPcByChipASC;
import net.devicemanagement.controller.sort.SortPcByChipDESC;
import net.devicemanagement.controller.sort.SortPcByRamASC;
import net.devicemanagement.controller.sort.SortPcByRamDESC;
import net.devicemanagement.controller.sort.SortPhoneByNameASC;
import net.devicemanagement.controller.sort.SortPhoneByNameDESC;
import net.devicemanagement.controller.sort.SortPhoneByPhaseASC;
import net.devicemanagement.controller.sort.SortPhoneByPhaseDESC;
import net.devicemanagement.view.model.Employee;
import net.devicemanagement.view.model.Laptop;
import net.devicemanagement.view.model.Monitor;
import net.devicemanagement.view.model.Pc;
import net.devicemanagement.view.model.Phone;

/**
 *
 * @author Tuan Anh
 */
//thực hiện chi tiết các hành động trong lớp interface
public class DataControllerImp implements DataController {

    @Override
    public <T> void writeToFile(List<T> data, String fileName) {
        try ( FileOutputStream fos = new FileOutputStream(fileName);  ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(data);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public <T> List<T> readDataFromFile(String fileName) {
        List<T> data = new ArrayList<>();
        File file = new File(fileName);
        if (file.length() > 0) {
            try ( FileInputStream fis = new FileInputStream(file);  ObjectInputStream ois = new ObjectInputStream(fis)) {
                data = (List<T>) ois.readObject();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        return data;
    }

    @Override
    public void sortPhoneByNameASC(List<Phone> phones) {
        Collections.sort(phones, new SortPhoneByNameASC());
    }

    @Override
    public void sortPhoneByNameDESC(List<Phone> phones) {
        Collections.sort(phones, new SortPhoneByNameDESC());
    }

    @Override
    public void sortPhoneByPhaseASC(List<Phone> phones) {
        Collections.sort(phones, new SortPhoneByPhaseASC());
    }

    @Override
    public void sortPhoneByPhaseDESC(List<Phone> phones) {
        Collections.sort(phones, new SortPhoneByPhaseDESC());
    }

    @Override
    public List<Phone> searchPhoneByImei(List<Phone> phones, String key) {
        List<Phone> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Phone phone : phones) {
            var imeiStr = Long.toString(phone.getImei());
            matcher = pattern.matcher(imeiStr);
            if (matcher.matches()) {
                resultList.add(phone);
            }
        }
        return resultList;
    }

    @Override
    public List<Phone> searchPhoneByName(List<Phone> phones, String key) {
        List<Phone> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Phone phone : phones) {
            matcher = pattern.matcher(phone.getName());
            if (matcher.matches()) {
                resultList.add(phone);
            }
        }
        return resultList;
    }

    @Override
    public List<Phone> searchPhoneByPhase(List<Phone> phones, String key) {
        List<Phone> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Phone phone : phones) {
            matcher = pattern.matcher(phone.getPhase());
            if (matcher.matches()) {
                resultList.add(phone);
            }
        }
        return resultList;
    }

    @Override
    public void sortPcByChipASC(List<Pc> pcs) {
        Collections.sort(pcs, new SortPcByChipASC());
    }

    @Override
    public void sortPcByChipDESC(List<Pc> pcs) {
        Collections.sort(pcs, new SortPcByChipDESC());
    }

    @Override
    public void sortPcByRamASC(List<Pc> pcs) {
        Collections.sort(pcs, new SortPcByRamASC());
    }

    @Override
    public void sortPcByRamDESC(List<Pc> pcs) {
        Collections.sort(pcs, new SortPcByRamDESC());
    }

    @Override
    public List<Pc> searchPcBySerial(List<Pc> pcs, String key) {
        List<Pc> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Pc pc : pcs) {
            matcher = pattern.matcher(pc.getSerial());
            if (matcher.matches()) {
                resultList.add(pc);
            }
        }
        return resultList;
    }

    @Override
    public List<Pc> searchPcByName(List<Pc> pcs, String key) {
        List<Pc> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Pc pc : pcs) {
            matcher = pattern.matcher(pc.getName());
            if (matcher.matches()) {
                resultList.add(pc);
            }
        }
        return resultList;
    }

    @Override
    public List<Pc> searchPcByRam(List<Pc> pcs, String key) {
        List<Pc> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Pc pc : pcs) {
            matcher = pattern.matcher(pc.getRam());
            if (matcher.matches()) {
                resultList.add(pc);
            }
        }
        return resultList;
    }

    @Override
    public void sortLaptopByChipASC(List<Laptop> laptops) {
        Collections.sort(laptops, new SortLaptopByChipASC());
    }

    @Override
    public void sortLaptopByChipDESC(List<Laptop> laptops) {
        Collections.sort(laptops, new SortLaptopByChipDESC());
    }

    @Override
    public void sortLaptopByRamASC(List<Laptop> laptops) {
        Collections.sort(laptops, new SortLaptopByRamASC());
    }

    @Override
    public void sortLaptopByRamDESC(List<Laptop> laptops) {
        Collections.sort(laptops, new SortLaptopByRamDESC());
    }

    @Override
    public List<Laptop> searchLaptopBySerial(List<Laptop> laptops, String key) {
        List<Laptop> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Laptop laptop : laptops) {
            matcher = pattern.matcher(laptop.getSerial());
            if (matcher.matches()) {
                resultList.add(laptop);
            }
        }
        return resultList;
    }

    @Override
    public List<Laptop> searchLaptopByName(List<Laptop> laptops, String key) {
        List<Laptop> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Laptop laptop : laptops) {
            matcher = pattern.matcher(laptop.getName());
            if (matcher.matches()) {
                resultList.add(laptop);
            }
        }
        return resultList;

    }

    @Override
    public List<Laptop> searchLaptopByRam(List<Laptop> laptops, String key) {
        List<Laptop> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Laptop laptop : laptops) {
            matcher = pattern.matcher(laptop.getRam());
            if (matcher.matches()) {
                resultList.add(laptop);
            }
        }
        return resultList;

    }

    @Override
    public void sortMonitorByNameASC(List<Monitor> monitors) {
        Collections.sort(monitors, new SortMonitorByNameASC());
    }

    @Override
    public void sortMonitorByNameDESC(List<Monitor> monitors) {
        Collections.sort(monitors, new SortMonitorByNameDESC());
    }

    @Override
    public void sortMonitorBySizeASC(List<Monitor> monitors) {
        Collections.sort(monitors, new SortMonitorBySizeASC());
    }

    @Override
    public void sortMonitorBySizeDESC(List<Monitor> monitors) {
        Collections.sort(monitors, new SortMonitorBySizeDESC());
    }

    @Override
    public List<Monitor> searchMonitorBySerial(List<Monitor> monitors, String key) {
        List<Monitor> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Monitor monitor : monitors) {
            matcher = pattern.matcher(monitor.getSerial());
            if (matcher.matches()) {
                resultList.add(monitor);
            }
        }
        return resultList;
    }

    @Override
    public List<Monitor> searchMonitorByName(List<Monitor> monitors, String key) {
        List<Monitor> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Monitor monitor : monitors) {
            matcher = pattern.matcher(monitor.getName());
            if (matcher.matches()) {
                resultList.add(monitor);
            }
        }
        return resultList;
    }

    @Override
    public List<Monitor> searchMonitorBySize(List<Monitor> monitors, String key) {
        List<Monitor> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Monitor monitor : monitors) {
            matcher = pattern.matcher(monitor.getSize());
            if (matcher.matches()) {
                resultList.add(monitor);
            }
        }
        return resultList;
    }

    @Override
    public void sortEmployeeByNameASC(List<Employee> employees) {
        Collections.sort(employees, new SortEmployeeByNameASC());
    }

    @Override
    public void sortEmployeeByNameDESC(List<Employee> employees) {
        Collections.sort(employees, new SortEmployeeByNameDESC());
    }

    @Override
    public void sortEmployeeByIdASC(List<Employee> employees) {
        Collections.sort(employees, new SortEmployeeByIdASC());
    }

    @Override
    public void sortEmployeeByIdDESC(List<Employee> employees) {
        Collections.sort(employees, new SortEmployeeByIdDESC());
    }

    @Override
    public List<Employee> searchEmployeeById(List<Employee> employees, String key) {
        List<Employee> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Employee employee : employees) {
            matcher = pattern.matcher(employee.getEmployeeId());
            if (matcher.matches()) {
                resultList.add(employee);
            }
        }
        return resultList;
    }

    @Override
    public List<Employee> searchEmployeeByName(List<Employee> employees, String key) {
        List<Employee> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Employee employee : employees) {
            matcher = pattern.matcher(employee.getFullName());
            if (matcher.matches()) {
                resultList.add(employee);
            }
        }
        return resultList;
    }

    @Override
    public List<Employee> searchEmployeeByDept(List<Employee> employees, String key) {
        List<Employee> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Employee employee : employees) {
            matcher = pattern.matcher(employee.getEmployeeDept());
            if (matcher.matches()) {
                resultList.add(employee);
            }
        }
        return resultList;
    }

}
