package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utilities.MathUtilities;

public class TestMathUtilities {

  @Test
  public void testGenerateSequence1() {
    Double[] result = MathUtilities.generateSequence(1.0, 10.0, 10);
    for (int i = 0; i < result.length; i++) {
      assertEquals((double) i + 1, result[i], 0);
    }
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGenerateSequence2() {
    MathUtilities.generateSequence(1.0, 2.0, 0);
  }

  @Test
  public void testGenerateSequence3() {
    Double[] result = MathUtilities.generateSequence(10.0, 1.0, 10);
    for (int i = 0; i < result.length; i++) {
      assertEquals((double) i + 1, result[i], 0);
    }
  }

  @Test
  public void testCombine() {
    Double[] s1 = MathUtilities.generateSequence(1.0, 5.0, 5);
    Double[] s2 = MathUtilities.generateSequence(6.0, 10.0, 5);
    Double[] com = MathUtilities.combine(s1, s2);
    assertEquals(com.length, s1.length + s2.length);
    for (int i = 0; i < com.length; i++) {
      assertEquals((double) i + 1, com[i], 0);
      // System.out.println(c[i]);
    }
  }

  @Test
  public void testCreateCombinedLoopedNormalDataset() {
    Double[][] result = MathUtilities.createCombinedLoopedNormalDataset(
        new Double[] { 2.5, 7.5 }, new Double[] { 1.0, 1.0 }, new Double[] {
            1.0, 1.0 }, 0.0, new Double[] { 0.0, 47.0 }, 48);
    for (int j = 0; j < result[0].length; j++) {
      // System.out.println(r[0][j] + "," + r[1][j]);
    }
  }

  @Test
  public void testMin() {
    assertEquals(1,
        MathUtilities.min(MathUtilities.generateSequence(1.0, 10.0, 10)), 0);
  }

  @Test
  public void testMax() {
    assertEquals(10,
        MathUtilities.max(MathUtilities.generateSequence(1.0, 10.0, 10)), 0);
  }

  public void testRange() {
    assertEquals(9,
        MathUtilities.range(MathUtilities.generateSequence(1.0, 10.0, 10)), 0);
  }

}
