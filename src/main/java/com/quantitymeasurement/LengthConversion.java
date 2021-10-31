package com.quantitymeasurement;

public class LengthConversion {


    public Inch ftToInch(Feet feet) {
        Inch inch = new Inch(feet.getValue() * 12);
        return inch;
    }

    public Yard ftToYard(Feet feet) {
        Yard yard = new Yard(feet.getValue()/3);
        return yard;
    }

    public Yard inchToYard(Inch inch) {
        Yard yard = new Yard(inch.getValue()/36);
        return yard;
    }

    public Inch yardToInch(Yard yard) {
        Inch inch = new Inch(yard.getValue()*36);
        return inch;
    }

    public Feet yardToFeet(Yard yard) {
        Feet feet =  new Feet(yard.getValue()*3);
        return feet;
    }
}
