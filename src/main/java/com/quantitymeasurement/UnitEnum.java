package com.quantitymeasurement;


public enum UnitEnum {
    FEET(12), YARD(36), INCH(1);

    private double base;

    UnitEnum(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public static boolean compare(Length l1, Length l2) {
        double l1UnitBase = l1.getUnit().getBase();
        double l2UnitBase = l2.getUnit().getBase();
        boolean result = l1UnitBase * l1.getValue() == l2UnitBase * l2.getValue();
        return result;
    }

}