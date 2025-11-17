

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import testing_nextdate.Testing_NextDate;

public class NextDateBVATest {

    @Test
    public void BVA01() {
        int d = 1, m = 3, y = 2024;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{2,3,2024}, actual);
    }

    @Test
    public void BVA02() {
        int d = 2, m = 3, y = 2024;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{3,3,2024}, actual);
    }

    @Test
    public void BVA03() {
        int d = 29, m = 4, y = 2025;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{30,4,2025}, actual);
    }

    @Test
    public void BVA04() {
        int d = 30, m = 4, y = 2025;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{1,5,2025}, actual);
    }

    @Test
    public void BVA05() {
        int d = 30, m = 1, y = 2025;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{31,1,2025}, actual);
    }

    @Test
    public void BVA06() {
        int d = 31, m = 1, y = 2025;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{1,2,2025}, actual);
    }

    @Test
    public void BVA07() {
        int d = 27, m = 2, y = 2023;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{28,2,2023}, actual);
    }

    @Test
    public void BVA08() {
        int d = 28, m = 2, y = 2023;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{1,3,2023}, actual);
    }

    @Test
    public void BVA09() {
        int d = 27, m = 2, y = 2024;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{28,2,2024}, actual);
    }

    @Test
    public void BVA10() {
        int d = 28, m = 2, y = 2024;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{29,2,2024}, actual);
    }

    @Test
    public void BVA11() {
        int d = 29, m = 2, y = 2024;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{1,3,2024}, actual);
    }

    @Test
    public void BVA12() {
        int d = 30, m = 12, y = 2025;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{31,12,2025}, actual);
    }

    @Test
    public void BVA13() {
        int d = 31, m = 12, y = 2025;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{1,1,2026}, actual);
    }

    @Test
    public void BVA14() {
        int d = 28, m = 2, y = 1900;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{1,3,1900}, actual);
    }

    @Test
    public void BVA15() {
        int d = 28, m = 2, y = 2000;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{29,2,2000}, actual);
    }

    @Test
    public void BVA16() {
        int d = 29, m = 2, y = 2000;
        assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
        int[] actual = Testing_NextDate.nextDate(d, m, y);
        assertArrayEquals(new int[]{1,3,2000}, actual);
    }

    @Test
    public void BVA17() {
        int d = 31, m = 4, y = 2025;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

    @Test
    public void BVA18() {
        int d = 29, m = 2, y = 2023;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

    @Test
    public void BVA19() {
        int d = 0, m = 1, y = 2025;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

    @Test
    public void BVA20() {
        int d = 1, m = 13, y = 2025;
        assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
    }

}
