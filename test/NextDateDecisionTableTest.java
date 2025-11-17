


import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import testing_nextdate.Testing_NextDate;

public class NextDateDecisionTableTest {

@Test
public void DT01() {
    int d = 15, m = 1, y = 2025;
    assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
    int[] actual = Testing_NextDate.nextDate(d, m, y);
    int[] expected = new int[]{16, 1, 2025};
    assertArrayEquals("Next date mismatch. actual=" + Arrays.toString(actual), expected, actual);
}


@Test
public void DT02() {
    int d = 31, m = 1, y = 2025;
    assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
    int[] actual = Testing_NextDate.nextDate(d, m, y);
    int[] expected = new int[]{1, 2, 2025};
    assertArrayEquals("Next date mismatch. actual=" + Arrays.toString(actual), expected, actual);
}


@Test
public void DT03() {
    int d = 31, m = 12, y = 2025;
    assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
    int[] actual = Testing_NextDate.nextDate(d, m, y);
    int[] expected = new int[]{1, 1, 2026};
    assertArrayEquals("Next date mismatch. actual=" + Arrays.toString(actual), expected, actual);
}


@Test
public void DT04() {
    int d = 15, m = 6, y = 2025;
    assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
    int[] actual = Testing_NextDate.nextDate(d, m, y);
    int[] expected = new int[]{16, 6, 2025};
    assertArrayEquals("Next date mismatch. actual=" + Arrays.toString(actual), expected, actual);
}


@Test
public void DT05() {
    int d = 30, m = 4, y = 2025;
    assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
    int[] actual = Testing_NextDate.nextDate(d, m, y);
    int[] expected = new int[]{1, 5, 2025};
    assertArrayEquals("Next date mismatch. actual=" + Arrays.toString(actual), expected, actual);
}


@Test
public void DT06() {
    int d = 27, m = 2, y = 2023;
    assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
    int[] actual = Testing_NextDate.nextDate(d, m, y);
    int[] expected = new int[]{28, 2, 2023};
    assertArrayEquals("Next date mismatch. actual=" + Arrays.toString(actual), expected, actual);
}


@Test
public void DT07() {
    int d = 28, m = 2, y = 2023;
    assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
    int[] actual = Testing_NextDate.nextDate(d, m, y);
    int[] expected = new int[]{1, 3, 2023};
    assertArrayEquals("Next date mismatch. actual=" + Arrays.toString(actual), expected, actual);
}


@Test
public void DT08() {
    int d = 28, m = 2, y = 2024;
    assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
    int[] actual = Testing_NextDate.nextDate(d, m, y);
    int[] expected = new int[]{29, 2, 2024};
    assertArrayEquals("Next date mismatch. actual=" + Arrays.toString(actual), expected, actual);
}


@Test
public void DT09() {
    int d = 29, m = 2, y = 2024;
    assertTrue("Input should be valid.", Testing_NextDate.isValidDate(d, m, y));
    int[] actual = Testing_NextDate.nextDate(d, m, y);
    int[] expected = new int[]{1, 3, 2024};
    assertArrayEquals("Next date mismatch. actual=" + Arrays.toString(actual), expected, actual);
}


@Test
public void DT10() {
    int d = 31, m = 4, y = 2025;
    assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
}


@Test
public void DT11() {
    int d = 30, m = 2, y = 2023;
    assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
}


@Test
public void DT12() {
    int d = 29, m = 2, y = 2023;
    assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
}


@Test
public void DT13() {
    int d = 0, m = 13, y = 0;
    assertFalse("Input should be invalid.", Testing_NextDate.isValidDate(d, m, y));
}

}
