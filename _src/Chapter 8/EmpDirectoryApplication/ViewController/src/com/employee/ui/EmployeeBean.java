package com.employee.ui;

public class EmployeeBean {
    int count;
    String value;
    
    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    public EmployeeBean() {
    }

    public String callInit() {
        // Add event code here...
        return "employee";
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

   
}
