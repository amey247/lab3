import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test
	public void testReverseInPlace() {
    int[] input1 = {3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3}, input1);
    int[] input2 = {4, 8, 16};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{16, 8, 4}, input2);
	}

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
    int[] input2 = {5, 9};
    assertArrayEquals(new int[]{9, 5}, ArrayExamples.reversed(input2));
  }

  /*@Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1.0, 1.0, 1.0, 1.0};
    assertArrayEquals(new double[]{1.0}, ArrayExamples.averageWithoutLowest(input1));
  }*/
}