/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.view.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Tuan Anh
 */
public class Pc implements Serializable {

    private String serial;
    private String name;
    private String cpu;
    private String ram;
    private String disk;
    private String vga;

    public Pc() {
        
    }
    
    
    
    public Pc(String serial) {
        this.serial = serial;
    }

    public Pc(String serial, String name, String cpu, String ram, String disk,
            String vga) {
        this.serial = serial;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
        this.vga = vga;
    }


    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.serial);
        return hash;
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
        final Pc other = (Pc) obj;
        if (!Objects.equals(this.serial, other.serial)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pc{" + "serial=" + serial + ", name=" + name + ", cpu=" + cpu
                + ", ram=" + ram + ", disk=" + disk + ", vga=" + vga + '}';
    }

}
