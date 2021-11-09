package com.quantitymeasurement;

/**
 * purpose -  to make an entity as measurement quantity compose of it's unit, value and method to do operations on that measurement quantity.
 *
 * @author Shubham
 * @version 2.1
 * @since 31/10/2021
 */
public class UnitMeasurementSystem {
    private final MeasurementUnits unit;
    private final double value;

    /**
     * purpose - parameterized constructor , to initialize passed values
     *
     * @param unit
     * @param value
     */
    public UnitMeasurementSystem(MeasurementUnits unit, double value) {
        this.unit = unit;
        this.value = value;
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
     * purpose -to compare the different units of a measurement quantity
     *
     * @param thatUnit (UnitMeasurementSystem type)
     * @return result (boolean type)
     */
    public boolean compare(UnitMeasurementSystem thatUnit) {
        if (this.unit.getClass() != thatUnit.unit.getClass())
            return false;
        if (this.unit.equals(thatUnit.unit))
            return this.equals(thatUnit);
        return Double.compare(this.unit.convertToBaseUnit(this.value), thatUnit.unit.convertToBaseUnit(thatUnit.getValue())) == 0;
    }

    /**
     * purpose - to add the length of different unit
     *
     * @param thatUnit (UnitMeasurementSystem object type)
     * @return result in INCH (Object of Length class)
     */
    public double add(UnitMeasurementSystem thatUnit) {
        if (this.unit.getClass() != thatUnit.unit.getClass() ||
                !this.unit.supportAddition() || !thatUnit.unit.supportAddition())
            return 0.0;
        return this.unit.convertToBaseUnit(this.value) + thatUnit.unit.convertToBaseUnit(thatUnit.getValue());
    }

    /**
     * purpose - to override the equals method of object class to check equality of lengths with same length and value
     *
     * @param o (Object type)
     * @return boolean type
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurementSystem length = (UnitMeasurementSystem) o;
        return Double.compare(length.value, value) == 0 && this.unit.equals(length.unit);
    }
}
