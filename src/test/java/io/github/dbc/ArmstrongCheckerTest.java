package io.github.dbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArmstrongCheckerTest {

    private ArmstrongChecker armstrongChecker;

    @BeforeEach
    void setUp() {
        armstrongChecker = new ArmstrongChecker();
    }

    @ParameterizedTest(name = "isArmstrong({0}) = true")
    @ValueSource(ints = {153, 370, 371, 407})
    void shouldBeAValidArmstrongNumber(int number) {
        assertTrue(armstrongChecker.isArmstrong(number));
    }

    @ParameterizedTest(name = "isArmstrong({0}) = false")
    @ValueSource(ints = {-3, -1, 100, 999, 1000, 1001})
    void shouldNotBeAnArmstrongNumber(int number) {
        assertFalse(armstrongChecker.isArmstrong(number));
    }
}
