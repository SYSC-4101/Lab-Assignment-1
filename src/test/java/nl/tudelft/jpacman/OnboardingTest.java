package nl.tudelft.jpacman;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * A simple onboarding test to verify the test setup.
 */
public class OnboardingTest {

    private static final int EXPECTED_SUM = 3;

    /**
     * Tests a simple addition.
     */
    @Test
    public void testAddition() {
        assertThat(1 + 2).isEqualTo(EXPECTED_SUM);
    }
}