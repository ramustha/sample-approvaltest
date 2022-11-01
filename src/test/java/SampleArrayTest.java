import org.approvaltests.Approvals;
import org.junit.Test;

import java.util.Arrays;

public class SampleArrayTest {

  @Test
  public void testList() {
    String[] names = {"Llewellyn", "James", "Dan", "Jason", "Katrina"};
    Arrays.sort(names);

    Approvals.verifyAll("Test List of Name", names);
  }

}
