import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test
	public void testReverseInPlace() {
    int[] input2 = {3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3}, input2);
	}

  @Test
	public void testReverseInPlace2() {
    int[] input2 = {4, 8, 16};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{16, 8, 4}, input2);
	}
}