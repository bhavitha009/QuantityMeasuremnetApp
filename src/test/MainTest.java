@Test
public void testAddition_ExplicitTargetUnit_Feet() {

    Length result =
            Main.demonstrateLengthAddition(
                    new Length(
                            1.0,
                            Length.LengthUnit.FEET
                    ),

                    new Length(
                            12.0,
                            Length.LengthUnit.INCHES
                    ),

                    Length.LengthUnit.FEET
            );

    assertEquals(
            2.0,
            result.getValue(),
            0.001
    );
}

@Test
public void testAddition_ExplicitTargetUnit_Inches() {

    Length result =
            Main.demonstrateLengthAddition(
                    new Length(
                            1.0,
                            Length.LengthUnit.FEET
                    ),

                    new Length(
                            12.0,
                            Length.LengthUnit.INCHES
                    ),

                    Length.LengthUnit.INCHES
            );

    assertEquals(
            24.0,
            result.getValue(),
            0.001
    );
}

@Test
public void testAddition_ExplicitTargetUnit_Yards() {

    Length result =
            Main.demonstrateLengthAddition(
                    new Length(
                            1.0,
                            Length.LengthUnit.FEET
                    ),

                    new Length(
                            12.0,
                            Length.LengthUnit.INCHES
                    ),

                    Length.LengthUnit.YARDS
            );

    assertEquals(
            0.666,
            result.getValue(),
            0.01
    );
}

@Test
public void testAddition_ExplicitTargetUnit_Centimeters() {

    Length result =
            Main.demonstrateLengthAddition(
                    new Length(
                            1.0,
                            Length.LengthUnit.INCHES
                    ),

                    new Length(
                            1.0,
                            Length.LengthUnit.INCHES
                    ),

                    Length.LengthUnit.CENTIMETERS
            );

    assertEquals(
            5.08,
            result.getValue(),
            0.1
    );
}

@Test
public void testAddition_ExplicitTargetUnit_NullTargetUnit() {

    assertThrows(
            IllegalArgumentException.class,

            () -> Main.demonstrateLengthAddition(
                    new Length(
                            1.0,
                            Length.LengthUnit.FEET
                    ),

                    new Length(
                            12.0,
                            Length.LengthUnit.INCHES
                    ),

                    null
            )
    );
}

@Test
public void testAddition_ExplicitTargetUnit_WithZero() {

    Length result =
            Main.demonstrateLengthAddition(
                    new Length(
                            5.0,
                            Length.LengthUnit.FEET
                    ),

                    new Length(
                            0.0,
                            Length.LengthUnit.INCHES
                    ),

                    Length.LengthUnit.YARDS
            );

    assertEquals(
            1.666,
            result.getValue(),
            0.01
    );
}

@Test
public void testAddition_ExplicitTargetUnit_NegativeValues() {

    Length result =
            Main.demonstrateLengthAddition(
                    new Length(
                            5.0,
                            Length.LengthUnit.FEET
                    ),

                    new Length(
                            -2.0,
                            Length.LengthUnit.FEET
                    ),

                    Length.LengthUnit.INCHES
            );

    assertEquals(
            36.0,
            result.getValue(),
            0.001
    );
}

@Test
public void testAddition_ExplicitTargetUnit_Commutativity() {

    Length result1 =
            Main.demonstrateLengthAddition(
                    new Length(
                            1.0,
                            Length.LengthUnit.FEET
                    ),

                    new Length(
                            12.0,
                            Length.LengthUnit.INCHES
                    ),

                    Length.LengthUnit.YARDS
            );

    Length result2 =
            Main.demonstrateLengthAddition(
                    new Length(
                            12.0,
                            Length.LengthUnit.INCHES
                    ),

                    new Length(
                            1.0,
                            Length.LengthUnit.FEET
                    ),

                    Length.LengthUnit.YARDS
            );

    assertEquals(
            result1.getValue(),
            result2.getValue(),
            0.001
    );
}