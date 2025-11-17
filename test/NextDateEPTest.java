

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import testing_nextdate.Testing_NextDate;

public class NextDateEPTest {

    @Test
    public void EP01() {
        int d = 15, m = 1, y = 2025;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{16,1,2025}, actual);
    }

    @Test
    public void EP02() {
        int d = 15, m = 6, y = 2025;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{16,6,2025}, actual);
    }

    @Test
    public void EP03() {
        int d = 28, m = 2, y = 2024;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{29,2,2024}, actual);
    }

    @Test
    public void EP04() {
        int d = 28, m = 2, y = 2023;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{1,3,2023}, actual);
    }

    @Test
    public void EP05() {
        int d = 31, m = 12, y = 2025;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{1,1,2026}, actual);
    }

    @Test
    public void EP06() {
        int d = 31, m = 4, y = 2025;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

    @Test
    public void EP07() {
        int d = 30, m = 2, y = 2023;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

    @Test
    public void EP08() {
        int d = 29, m = 2, y = 2023;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

    @Test
    public void EP09() {
        int d = 0, m = 5, y = 2025;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

    @Test
    public void EP10() {
        int d = 10, m = 0, y = 2025;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

    @Test
    public void EP11() {
        int d = 10, m = 13, y = 2025;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

    @Test
    public void EP12() {
        int d = 10, m = 5, y = 0;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

    @Test
    public void EP13() {
        int d = 28, m = 2, y = 1900;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{1,3,1900}, actual);
    }

    @Test
    public void EP14() {
        int d = 28, m = 2, y = 2000;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{29,2,2000}, actual);
    }

}
