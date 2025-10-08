package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers customers = new Customers(5);
         // test av 4a)

        System.out.println("Test for 4a)");
        System.out.println("Lengde: ");
        System.out.println();
        // test av 4b)

        System.out.println("Test av 4b)");
        System.out.println(customers.countNonNull());
        System.out.println();

        //test av 4c
        Customer c2 = new Customer("Per Perry","pp@gmail.com"
                ,2,PowerAgreementType.NORGESPRICE);
        System.out.println();
        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

    }
}
