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

    public Yard InchToYard(Inch inch) {
        Yard yard = new Yard(inch.getValue()/36);
        return yard;
    }
}
