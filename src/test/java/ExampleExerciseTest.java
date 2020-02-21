import static org.junit.jupiter.api.Assertions.*;

import edu.princeton.cs.algs4.In;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExampleExerciseTest {

  private static String example_testfile = ExampleExerciseTest.class.getClassLoader()
      .getResource("example_testfile.txt").getFile();

  @Test
  public void testExample() {
    ExampleExercise ex = new ExampleExercise();

    In in = new In(example_testfile);
    int a = in.readInt();
    int b = in.readInt();

    assertEquals(13, a);
    assertEquals(11, b);
    assertEquals(24, ex.sum(a, b));
  }
}
