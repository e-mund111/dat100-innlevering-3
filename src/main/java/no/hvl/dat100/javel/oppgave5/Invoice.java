package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    public double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    public void computeAmount() {

        if (c.getAgreement() == PowerAgreementType.NORGESPRICE) {
            amount = MonthlyPower.computeNorgesPrice(usage);

        } else if (c.getAgreement() == PowerAgreementType.SPOTPRICE) {
            amount = MonthlyPower.computeSpotPrice(usage, prices);

        } else {
            System.out.println("Ugyldig Agreement!");
        }

    }

    public void printInvoice() {
        computeAmount();
        double sum = MonthlyPower.computePowerUsage(usage);

        System.out.println("Customer number: " + c.getCustomer_id() + "\nName: " +
                c.getName() + "\nEmail: " + c.getEmail() + "\nAgreement: " +
                c.getAgreement() +"\n\nMonth: " + month);
        System.out.printf("Usage: %.2f kWh", sum);
        System.out.println();
        System.out.printf("Amount: %.2f NOK", amount);
    }
}
