package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();


        //Test 5a og b) satt amount fra private til public for å teste
        Customer c = new Customer("testC", "testC@",3, PowerAgreementType.NORGESPRICE);
        Invoice invoice3 = new Invoice(c, "January",CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        System.out.println("Test 5a og b) ");
        invoice3.computeAmount();
        System.out.printf("Pris: %.2f NOK", invoice3.amount);
        System.out.println();

        //test 5c
        System.out.println("===========");
        System.out.println("Test 5c) ");
        System.out.println();
        invoice3.printInvoice();
        System.out.println();

        //test 5d
        Customer a = new Customer("testA", "testA@",1, PowerAgreementType.SPOTPRICE);
        Customer b = new Customer("testB", "testB@",2, PowerAgreementType.SPOTPRICE);

        System.out.println();

        System.out.println("Test 5d)");
        Invoice[] invoices = {
                new Invoice(a,"January", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month),
                new Invoice(b,"January", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month),
                new Invoice(c, "January",CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month),
        };

        Invoices.processInvoices(invoices);


        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */

    }
}
