package com.class21;
//Create a Class called Employee:
//Create three  variables  eID , salary and set the CEO to “Sumair”
//Create two objects of the class Employee
//Set the value of eID, salary for each of the objects
//Print out the eID , salary and  CEO for each of the objects

public class Employee {
	
	
	int salary;
    int eID;
    public static String CEO="Sumair";

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.eID =1;
        obj.salary=100;
        
        Employee obj1 = new Employee();
        obj1.eID =2;
        obj1.salary=200;
        
    obj.getEmployee();
    obj1.getEmployee();

    }
    void getEmployee() {
        System.out.println("Employee id "+eID+" employee salary "+salary+" and ceo "+CEO);
}}
