package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers customerList = new Customers(5);
         // test av 4a) måtte sette private Customer[] customers til public for å teste

        System.out.println("Test for 4a)");
        System.out.println("Lengde: " + customerList.customers.length);
        System.out.println();
        // test av 4b)

        System.out.println("Test av 4b)");
        customerList.customers[0] = new Customer("testA", "testA@",1, PowerAgreementType.SPOTPRICE);
        customerList.customers[1] = new Customer("testB", "testB@",2, PowerAgreementType.SPOTPRICE);

        System.out.println("Ikke null customers: " +customerList.countNonNull());
        System.out.println();

        //test av 4c
        System.out.println("Test 4c)");
        System.out.println(customerList.getCustomer(1));
        System.out.println();
        System.out.println("Kunde med id 99: " +customerList.getCustomer(99));
        System.out.println();

        //test 4d
        System.out.println("Test 4d");
        System.out.println("Legger til en kunde : " +customerList.addCustomer(new Customer("testP", "testP@",3, PowerAgreementType.SPOTPRICE)));
        System.out.println("Legger til en kunde til : " +customerList.addCustomer(new Customer("testP", "testP@",4, PowerAgreementType.SPOTPRICE)));
        System.out.println("Legger til en kunde til : " +customerList.addCustomer(new Customer("testP", "testP@",5, PowerAgreementType.SPOTPRICE)));
        System.out.println("Legger til en kunde til : " +customerList.addCustomer(new Customer("testP", "testP@",6, PowerAgreementType.SPOTPRICE)));
        System.out.println();

        System.out.println();
        System.out.println("Test 4e)");
        System.out.println("Antall kunder i tabell: " + customerList.countNonNull());
        System.out.println("Fjerner en kunde");
        customerList.removeCustomer(5);
        System.out.println("Antall kunder i endret tabell: " + customerList.countNonNull());

        System.out.println();
        System.out.println("Test 4f)");
        System.out.println("Lengden på orginal tabell er: " +customerList.customers.length);
        System.out.println("Størrelse på orginal tabell med NonNull: " + customerList.countNonNull());
        Customer[] customers = customerList.getCustomers();
        System.out.println("Størrelse på ny tabell: " + customers.length);
        System.out.println("===============");
        System.out.println("Tester at en tilfeldig kunde er i begge tabeller: ");
        System.out.println();
        System.out.println("Kunde i orginal tabell: \n" + customerList.customers[0]);
        System.out.println("================");
        System.out.println("Kunde i den kopierte tabellen: \n" + customers[0]);


        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

    }
}
