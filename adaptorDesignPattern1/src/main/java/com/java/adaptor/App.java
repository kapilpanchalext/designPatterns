package com.java.adaptor;

import com.java.adaptor.factory.RoundHole;
import com.java.adaptor.factory.RoundPeg;
import com.java.adaptor.factory.SquarePeg;
import com.java.adaptor.factory.SquarePegAdaptor;

public class App {
    public static void main(String[] args) {
        System.out.println("Adaptor Design Pattern!");
        
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        
        System.out.println("RoundPeg fits: " + roundHole.fits(roundPeg));
        
        SquarePeg smallSqPeg = new SquarePeg(5);
        SquarePeg largeSqPeg = new SquarePeg(10);
        
        SquarePegAdaptor smallAdaptor = new SquarePegAdaptor(smallSqPeg);
        SquarePegAdaptor largeAdaptor = new SquarePegAdaptor(largeSqPeg);
        
        System.out.println("Small Square Peg Fits: " + roundHole.fits(smallAdaptor));
        System.out.println("Large Square Peg Fits: " + roundHole.fits(largeAdaptor));
    }
}
