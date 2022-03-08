/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.view.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Tuan Anh
 */
public class GiveBack implements Serializable {
    private static final long serialVersionUID = 4602209708090925408L;
    private Employee employee;
    private Phone phone;
    private Pc pc;
    private Laptop laptop;
    private Monitor monitor;
    private Date giveBackDate;

    public GiveBack() {
    }

    public GiveBack(Employee employee, Phone phone, Pc pc, Laptop laptop, Monitor monitor, Date giveBackDate) {
        this.employee = employee;
        this.phone = phone;
        this.pc = pc;
        this.laptop = laptop;
        this.monitor = monitor;
        this.giveBackDate = giveBackDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.employee);
        hash = 53 * hash + Objects.hashCode(this.phone);
        hash = 53 * hash + Objects.hashCode(this.pc);
        hash = 53 * hash + Objects.hashCode(this.laptop);
        hash = 53 * hash + Objects.hashCode(this.monitor);
        return hash;
    }

    public Pc getPc() {
        return pc;
    }

    public void setPc(Pc pc) {
        this.pc = pc;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Date getGiveBackDate() {
        return giveBackDate;
    }

    public void setGiveBackDate(Date giveBackDate) {
        this.giveBackDate = giveBackDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GiveBack other = (GiveBack) obj;
        if (!Objects.equals(this.employee, other.employee)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.pc, other.pc)) {
            return false;
        }
        if (!Objects.equals(this.laptop, other.laptop)) {
            return false;
        }
        if (!Objects.equals(this.monitor, other.monitor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GiveBack{" + "employee=" + employee + ", phone=" + phone + ", pc=" + pc + ", laptop=" + laptop + ", monitor=" + monitor + ", giveBackDate=" + giveBackDate + '}';
    }

}
