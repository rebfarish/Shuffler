package edu.cnm.deepdive;

import java.util.Arrays;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;



public class ShufflerTest {

  @Test
  public void shuffleByte() {
    byte [] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    byte [] destination = Arrays.copyOf(source,source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);
  }

  @Test
  public void shuffleChar() {
    char [] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    char [] destination = Arrays.copyOf(source,source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);
  }

  @Test
  public void shuffleDouble() {
    double [] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    double [] destination = Arrays.copyOf(source,source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);
  }

  @Test
  public void shuffleFloat() {
    float [] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    float [] destination = Arrays.copyOf(source,source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);
  }

  @Test
  public void shuffleInt() {
    int [] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int [] destination = Arrays.copyOf(source,source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);
  }

  @Test
  public void shffleLong() {
    long [] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    long [] destination = Arrays.copyOf(source,source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);
  }

  @Test
  public void shuffleShort() {
    short [] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    short [] destination = Arrays.copyOf(source,source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);
  }

  @Test
  public void shuffleT() {
    Integer [] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer [] destination = Arrays.copyOf(source,source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertArrayEquals(source, destination);
  }
}
