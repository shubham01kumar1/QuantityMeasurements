package com.quantitymeasurement;

public enum Unit {
    FEET(30.0), YARD(90.0), INCH(2.5), CENTIMETER(1);

    private final double baseValue;

    /**
     * purposse - parameterized constructor to initialize the baseValue
     *
     * @param baseValue
     */
    Unit(double baseValue) {
        this.baseValue = baseValue;
    }

    /**
     * purpose -to comapare the lengths of different unit
     *
     * @param length1
     * @param length2
     * @return result (boolean type)
     */
    public static boolean compare(Length length1, Length length2) {
        double l1UnitBase = length1.getUnit().getBaseValue();
        double l2UnitBase = length2.getUnit().getBaseValue();
        boolean result = l1UnitBase * length1.getValue() == l2UnitBase * length2.getValue();
        return result;
    }

    /**
     * purpose - getter, to get the value stored in baseValue
     *
     * @return baseValue (double type)
     */
    public double getBaseValue() {
        return baseValue;
    }
}