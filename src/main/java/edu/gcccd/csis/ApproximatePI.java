package edu.gcccd.csis;

public class ApproximatePI {
    public static void main(String[] args) {
        int i;
        int totalTries = 0;
        int totalSuccess = 0;
        double x, y;
        for (i = 0; i < 1000000000; i++) {

            x = (Math.random());
            y = (Math.random());
            totalTries++;
            if (x * x + y * y <= 1)
                totalSuccess++;
        }
        // It takes my computer about 30 seconds to send the println. Your computer might be different.
        System.out.println("Approximation of PI = " + 4 * (double) totalSuccess / (double) totalTries);

    }
}
