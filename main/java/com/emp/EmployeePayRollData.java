package com.emp;
/*
 *@Description:-Create an Employee Payroll Service to Read and Write Employee Payroll to a Console
 */

public class EmployeePayRollData {
    //variable
    public int id;
    public String name;
    public double salary;

    public EmployeePayRollData(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //take one method
    public String toString()
    {
        return  "id = " + id + ", name=" + name + "\'"  +  ", salary" + salary;
    }
}
