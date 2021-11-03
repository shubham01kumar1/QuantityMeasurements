package com.quantitymeasurement;

/**
 * purpose -  to make an entity as length of unit and value
 *
 * @author Shubham
 * @version 2.0
 * @since 31/10/2021
 */
public class Length {
    private final Unit unit;
    private final double value;

    /**
     * purpose - parameterized constructor , to initialize passed values
     *
     * @param unit
     * @param value
     */
    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * purpose - getter, to get the stored value of unit variable
     *
     * @return unit
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * purpose - getter, to get the stored value of value variable
     *
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * purpose - to override the equals method of object class to check equality of lengths with same unit and value
     *
     * @param o
     * @return boolean type
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit.equals(length.unit);
    }
}
