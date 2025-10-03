package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        // test for 1a)
        System.out.println("Test for a):");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();

        // test for 1b)
        System.out.println();
        System.out.println("Test for b)");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

        // test for 1c)
        System.out.println();
        System.out.println("Test for c)");
        System.out.println("Total kWh: " + DailyPower.computePowerUsage(powerusage_day));

        // test for 1d)
        System.out.println();
        System.out.println("Test for d)");
        System.out.printf("Total pris for dagen: " + "%.2f NOK", DailyPower.computeSpotPrice(powerusage_day, powerprices_day));

        /* test for 1e)
        System.out.println();
        System.out.println("Test for e)");
        System.out.printf("Strømstøtte motatt: " + "%.2f", DailyPower.getSupport);
        */
        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}
