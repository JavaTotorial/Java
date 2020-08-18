package com.pcschool.ocp.finish.d06.case1;

public class Employee {
    private static final int BASE_SALARY = 23800;
    private int salary;

    public Employee() {
        setSalary(23800);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary > BASE_SALARY)
            this.salary = salary;
        else
            this.salary = BASE_SALARY;
    }
}
