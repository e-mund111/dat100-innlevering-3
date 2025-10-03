package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        // TODO

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for(int i = 0; i < prices.length; i++) {
            for(int j = 0; j < prices[i].length; i++) {
                System.out.printf("Day " + i+1 + "%.2f NOK", prices[i][j]);
                System.out.println();
            }
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        // TODO

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        for(int i = 0; i < powerusage.length; i++) {
            for(int j = 0; j < powerusage[i].length; i++) {
                usage += powerusage[i][j];
            }
        }
        if (usage > threshold) {
            exceeded = true;
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        // TODO

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // TODO

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        double norgespris = 0.5;

        for (double[] forbrukDag : usage) {
            for (double forbrukTime : forbrukDag) {
                price += (forbrukTime * norgespris);
            }
        }
        return price;
    }
}
