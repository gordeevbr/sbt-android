import org.junit.*;
import org.junit.runner.RunWith;
import org.robolectric.*;
import org.robolectric.annotation.*;
import org.robolectric.Robolectric;

import com.hanhuy.android.robolectric.sample.MainActivity;

@RunWith(RobolectricTestRunner.class)
@Config(manifest="src/main/AndroidManifest.xml")
public class RoboTest {
  @Test public void doSomethingSimple() {
    MainActivity activity = Robolectric.setupActivity(MainActivity.class);
  }
}
