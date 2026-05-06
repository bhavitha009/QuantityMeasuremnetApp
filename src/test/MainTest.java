@Test
public void testConvertToBaseUnit_FeetToFeet() {

    assertEquals(
            60.0,
            LengthUnit.FEET.convertToBaseUnit(5.0),
            0.001
    );
}

@Test
public void testConvertToBaseUnit_InchesToFeet() {

    assertEquals(
            12.0,
            LengthUnit.INCHES.convertToBaseUnit(12.0),
            0.001
    );
}

@Test
public void testConvertToBaseUnit_YardsToFeet() {

    assertEquals(
            36.0,
            LengthUnit.YARDS.convertToBaseUnit(1.0),
            0.001
    );
}

@Test
public void testConvertFromBaseUnit_FeetToInches() {

    assertEquals(
            12.0,
            LengthUnit.INCHES.convertFromBaseUnit(12.0),
            0.001
    );
}

@Test
public void testQuantityLengthRefactored_Equality() {

    assertTrue(
            new Length(
                    1.0,
                    LengthUnit.FEET
            ).equals(
                    new Length(
                            12.0,
                            LengthUnit.INCHES
                    )
            )
    );
}

@Test
public void testQuantityLengthRefactored_ConvertTo() {

    Length result =
            new Length(
                    1.0,
                    LengthUnit.FEET
            ).convertTo(
                    LengthUnit.INCHES
            );

    assertEquals(
            12.0,
            result.getValue(),
            0.001
    );
}

@Test
public void testQuantityLengthRefactored_Add() {

    Length result =
            new Length(
                    1.0,
                    LengthUnit.FEET
            ).add(
                    new Length(
                            12.0,
                            LengthUnit.INCHES
                    ),

                    LengthUnit.FEET
            );

    assertEquals(
            2.0,
            result.getValue(),
            0.001
    );
}

@Test
public void testQuantityLengthRefactored_NullUnit() {

    assertThrows(
            IllegalArgumentException.class,

            () -> new Length(
                    1.0,
                    null
            )
    );
}

@Test
public void testQuantityLengthRefactored_InvalidValue() {

    assertThrows(
            IllegalArgumentException.class,

            () -> new Length(
                    Double.NaN,
                    LengthUnit.FEET
            )
    );
}