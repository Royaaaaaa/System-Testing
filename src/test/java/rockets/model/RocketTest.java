package rockets.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RocketTest {
    private Rocket target1;
    private Rocket target2;

    @BeforeEach
    public void setUp() {
        target1 = new Rocket("", "", "");
        target2 = new Rocket("rocket", "country", "manufacturer");
    }

    @DisplayName("should return true when parameter is an empty string")
    @Test
    public void testReturnTrueWhenParamIsEmpty() {
        assertTrue(target1.getName().trim().equals(""));
        assertTrue(target1.getCountry().trim().equals(""));
        assertTrue(target1.getManufacturer().trim().equals(""));
    }

    @DisplayName("should return false when parameter is not an empty string")
    @Test
    public void testReturnFalseWhenParamIsNotEmpty() {

        assertFalse(target2.getName().trim().equals(""));
        assertFalse(target2.getCountry().trim().equals(""));
        assertFalse(target2.getManufacturer().trim().equals(""));

    }

    @DisplayName("should return true when two rockets are the same")
    @Test
    public void shouldReturnTrueWhenRocketsAreTheSame() {
        Rocket testRocket = new Rocket("rocket", "country", "manufacturer");
        assertTrue(target2.equals(testRocket));
    }

    @DisplayName("should return false when two rockets are different")
    @Test
    public void shouldReturnFalseWhenRocketsAreDifferent() {
        Rocket testRocket = new Rocket("rocket1", "country1", "manufacturer1");
        assertFalse(target2.equals(testRocket));
    }

}