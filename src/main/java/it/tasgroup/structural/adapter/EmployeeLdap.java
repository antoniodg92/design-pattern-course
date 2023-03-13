package it.tasgroup.structural.adapter;

public class EmployeeLdap { //non puo implementare l interfaccia Employee

    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    public EmployeeLdap(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }


    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    public String getCn() {
        return cn;
    }

    public String getMail() {
        return mail;
    }
}
