package com.company;

public class Main {

    public static void main(String[] args) {
        double [] scan= {0.3 ,0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.2, 1.6, 0.6, 0.9,};
        double [] scan2 = {0.3, 0.7, 0.8, 0.4, 1.4,1.1};
	// write your code here
        SkyView sv1= new SkyView (numRows:4, numCols:3, scan);
        SkyView sv2 = new SkyView (numRows:3, numCols:2, scan2);


    }
}
