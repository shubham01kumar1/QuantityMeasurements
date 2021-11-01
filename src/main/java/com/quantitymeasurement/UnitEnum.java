package com.quantitymeasurement;


public enum UnitEnum {
    FEET(30.0), YARD(90.0), INCH(2.5), CENTIMETER(1);

    private double base;

    UnitEnum(double base) {
        this.base = base;
    }

    public static boolean compare(Length l1, Length l2) {
        double l1UnitBase = l1.getUnit().getBase();
        double l2UnitBase = l2.getUnit().getBase();
        boolean result = l1UnitBase * l1.getValue() == l2UnitBase * l2.getValue();
        return result;
    }

    public double getBase() {
        return base;
    }

}