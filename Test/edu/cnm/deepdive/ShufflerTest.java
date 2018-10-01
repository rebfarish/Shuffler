package edu.cnm.deepdive;

import java.util.Arrays;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ShufflerTest {

  @Deployment
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
        .addClass(Shuffler.class)
        .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

  @org.junit.Test
  public void shuffleByte() {
    byte [] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    byte [] destination = Arrays.copyOf(source,source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
  }

  @org.junit.Test
  public void shuffleChar() {
  }

  @org.junit.Test
  public void shuffleDouble() {
  }

  @org.junit.Test
  public void shuffleFloat() {
  }

  @org.junit.Test
  public void shuffleInt() {
  }

  @org.junit.Test
  public void shuffleLong() {
  }

  @org.junit.Test
  public void shuffleShort() {
  }

  @org.junit.Test
  public void shuffleT() {
  }
}
