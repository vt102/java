package com.andy;

public class Main {

    public static void main(String[] args) {
        System.out.println("6'4.5\" is " + calcFeetAndInchesToCentimetres(6.0, 4.5) + " cm.");
        System.out.println("172.25\" is " + calcFeetAndInchesToCentimetres(172.25) + " cm.");
    }

    public static double calcFeetAndInchesToCentimetres (double feet, double inches) {
        if (feet < 0.0) {
            return -1;
        } else if ((inches < 0.0) || (inches > 12.0)) {
            return -1;
        }

        return ((feet * 12.0) + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimetres (double inches) {
        if (inches < 0) {
            return -1;
        }

        return calcFeetAndInchesToCentimetres( ((int)inches / 12) , inches % 12.0);
    }
}
