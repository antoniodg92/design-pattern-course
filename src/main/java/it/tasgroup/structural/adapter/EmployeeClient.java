package it.tasgroup.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234","Jhon","Wick", "jhon@wick.com");
        employees.add(employeeFromDB);

        //Volgio instanziare EmployeeLdap, ma non funzionerà, qui l adapter ci viene in aiuto
        // Employee employeeFromLdap = new EmployeeLdap("chewie","solo","han", "han@solo.com");
        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie","solo","han", "han@solo.com");

//        Devo quidni creare un Adapter per poter aggiiungere questo oggetto alla nostra lista
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        return employees;
    }

}
