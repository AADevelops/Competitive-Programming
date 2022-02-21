// The Cell Sell

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int daytimeMins = input.nextInt(); int eveningMins = input.nextInt(); int weekendMins = input.nextInt();
        double aTotal = 0;
        double bTotal = 0;

        // Plan A
        aTotal += (((daytimeMins - 100) >= 0) ? ((daytimeMins - 100) * 0.25) : 0) + (eveningMins * 0.15) + (weekendMins * 0.20);

        // Plan B
        bTotal += (((daytimeMins - 250) >= 0) ? ((daytimeMins - 250) * 0.45) : 0) + (eveningMins * 0.35) + (weekendMins * 0.25);

        bTotal = Math.round(bTotal * 100) / 100.0;
        aTotal = Math.round(aTotal * 100) / 100.0;

        System.out.println("Plan A costs " + aTotal);
        System.out.println("Plan B costs " + bTotal);

        if (aTotal == bTotal) {
            System.out.println("Plan A and B are the same price.");
        } else {
            System.out.println("Plan " + ((aTotal < bTotal) ? "A" : "B") + " is cheapest.");
        }
    }
}
