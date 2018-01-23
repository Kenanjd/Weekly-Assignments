package com.kenandunn.week_1;

public class Main {

    public static void main(String[] args) {
        String cityName = "Columbus";
        int zipCode;
        int[] highTemps = {56, 54, 55, 50, 48};
        double averageTemp;

        averageTemp =
                ((highTemps[0] + highTemps[1] + highTemps[2] + highTemps[3]) / 5);


        zipCode = 43215;


        System.out.println("City: " + cityName + " Zip Code: " + zipCode + " Average High temperature: " + averageTemp);
    }
}
