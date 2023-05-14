package com.hemant.other.nasdaq;

public class Algorithm {
    /**
     * Calculate the possible share prices
     *
     * @param price Initial price
     * @param up    Up factor
     * @param down  Down factor
     * @param depth Depth of calculation
     * @return A string with the possible share prices for the given factors and initial price
     */
    static String getSharePrices(double price, double up, double down, int depth) {
        double[][] lattice = new double[depth + 1][depth + 1];

        // populate the lattice with stock prices
        for (int i = 0; i <= depth; i++) {
            for (int j = 0; j <= i; j++) {
                lattice[j][i] = price * Math.pow(up, j) * Math.pow(down, i - j);
            }
        }

        // format the results as a string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= depth; i++) {
            sb.append(String.format("%.4f", lattice[i][depth]));
            if (i < depth) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        if( "45.1250 52.2500 60.5000".equals(getSharePrices(50,1.1,0.95,2)))
            System.out.println("Success!");
        else
            System.out.println("FAIL!");
    }
}
