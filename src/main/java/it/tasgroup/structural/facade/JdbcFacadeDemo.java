package it.tasgroup.structural.facade;


import java.util.List;

public class JdbcFacadeDemo { // rispetto la versione no facade, lato client , si ha una gedsitone piu semplice delle api

    public static void main (String args []) {

        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable(); //lato client la creazione della tabella è semlpificata da questo metodo della facade

        System.out.println("Table created.");

        jdbcFacade.insertIntoTable();

        System.out.println("Record inserted.");

        List<Address> addresses = jdbcFacade.getAddresses();

        for (Address address : addresses) {
            System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
        }
    }
}