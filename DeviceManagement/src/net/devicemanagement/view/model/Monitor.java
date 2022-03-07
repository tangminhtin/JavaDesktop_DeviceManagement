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
public class Monitor implements Serializable {

    private String serial;
    private String name;
    private String size;
    private String resolution;

    public Monitor() {
        
    }
       
    public Monitor(String serial) {
        this.serial = serial;
    }

    public Monitor(String serial, String name, String size, String resolution) {
        this.serial = serial;
        this.name = name;
        this.size = size;
        this.resolution = resolution;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.serial);
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
        final Monitor other = (Monitor) obj;
        if (!Objects.equals(this.serial, other.serial)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Monitor{" + "serial=" + serial + ", name=" + name + ", "
                + "size=" + size + ", resolution=" + resolution + '}';
    }
}
