package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer c1 = new Customer("Ola Nordmann",
                "olanor@gmail.com",1, PowerAgreementType.SPOTPRICE);

        //get test
        System.out.println("________________");
        System.out.println("Customer number: " + c1.getCustomer_id());
        System.out.println("Name: " + c1.getName());
        System.out.println("Email: " + c1.getEmail());
        System.out.println("Agreement: " + c1.getAgreement());
        System.out.println("________________");

        //set test
        c1.setEmail("olanordmann@outlook.com");
        System.out.println("Ny email med set: " + c1.getEmail());
        System.out.println("________________");

        // to string test
        System.out.println(c1.toString());
        System.out.println("________________");

    }
}
