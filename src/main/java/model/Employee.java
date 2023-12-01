package model;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String id;
    private int startYear;
    private String position;
    private double salary;
    private String address;

    public Employee(String name, String id, int startYear, String position, double salary, String address) {
        this.name = name;
        this.id = id;
        this.startYear = startYear;
        this.position = position;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
