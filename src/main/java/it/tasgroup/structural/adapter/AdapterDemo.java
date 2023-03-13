package it.tasgroup.structural.adapter;

import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {

        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        System.out.println(employees); //aggiungo alla Lista di Employee un nuovo Employee diverso da uno di quelli gia presenti nel codice

    }
}
