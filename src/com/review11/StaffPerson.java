package com.review11;



public abstract class StaffPerson {
    private String name;
    private String adress;
    private int salary;
    private String vehicleType;
    private String hireDate;
    private int tellNum;

    public StaffPerson(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super();
        this.name = name;
        this.adress = adress;
        this.salary = salary;
        this.vehicleType = vehicleType;
        this.hireDate = hireDate;
        this.tellNum = tellNum;
    }

    public String getAddress() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getTellNum() {
        return tellNum;
    }

    public void setTellNum(int tellNum) {
        this.tellNum = tellNum;
    }



}

class Secretary extends StaffPerson {

    public Secretary(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super(name, adress, salary, vehicleType, hireDate, tellNum);
    }

    @Override
    public String getVehicleType() {
        return super.getVehicleType();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAddress() {
        return super.getAdress();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public int getTellNum() {
        return super.getTellNum();
    }

}

class Professor extends StaffPerson {

    public Professor(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super(name, adress, salary, vehicleType, hireDate, tellNum);
    }

    @Override
    public String getVehicleType() {
        return super.getVehicleType();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public int getTellNum() {
        return super.getTellNum();
    }

}