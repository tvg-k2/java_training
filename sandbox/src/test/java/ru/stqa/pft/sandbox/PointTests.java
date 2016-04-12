package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistancePositivePoints() {
    Point p1 = new Point(0, 1);
    Point p2 = new Point(10, 1);
    Assert.assertEquals(p1.distance(p2), 10.0);
  }

  @Test
  public void testDistanceZero() {
    Point p1 = new Point(7, 1);
    Point p2 = new Point(7, 1);
    Assert.assertEquals(p1.distance(p2), 0.0);
  }

  @Test
  public void testDistanceNegativePoints() {
    Point p1 = new Point(-2, -1);
    Point p2 = new Point(-2, -8);
    Assert.assertEquals(p1.distance(p2), 7.0);
  }

}
