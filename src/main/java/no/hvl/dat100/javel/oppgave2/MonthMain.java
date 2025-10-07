package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        // test for 2a)
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();

        // test for 2b)
        System.out.println();
        MonthlyPower.print_PowerPrices(power_prices_month);

        // test for 2c)
        System.out.println();
        System.out.printf("Totalt månedlig forbruk: %.2f kWh.", MonthlyPower.computePowerUsage(power_usage_month));
        System.out.println();

        // test for 2d)
        System.out.println();
        System.out.println("Vi har oversteget grensen: " + MonthlyPower.exceedThreshold(power_usage_month, 5000 ));

        // test for 2e)
        System.out.println();
        System.out.printf("Totale strømprisen for måneden med spotpris: %.2f NOK", MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        System.out.println();

        // test for 2f)
        System.out.println();
        System.out.printf("Strømstøtte for måneden: %.2fNOK", MonthlyPower.computePowerSupport(power_usage_month,power_prices_month));
        System.out.println();

        // test for 2g)
        System.out.println();
        System.out.printf("Månedspris med norgespris: %.2f NOK", MonthlyPower.computeNorgesPrice(power_usage_month));
        System.out.println();



        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}