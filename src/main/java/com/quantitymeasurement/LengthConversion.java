package com.quantitymeasurement;

public class LengthConversion {


    public Inch ftToInch(Feet feet) {
        Inch inch = new Inch(feet.getValue() * 12);
        return inch;
    }
}
