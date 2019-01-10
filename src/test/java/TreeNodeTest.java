import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TreeNodeTest {

    @Test
    public void toString_Balanced() {
        final TreeNode balanced = new TreeNode(50);
        final TreeNode a = balanced.insert(30);
        a.insert(10);
        a.insert(40);
        final TreeNode b = balanced.insert(70);
        b.insert(60);
        b.insert(80);
        final TreeNode c = balanced.insert(90);
        c.insert(85);
        c.insert(95);

        String actual = balanced.toString();
        String expected = "└── 50\n" +
                "    ├── 90\n" +
                "    │   ├── 95\n" +
                "    │   └── 85\n" +
                "    ├── 70\n" +
                "    │   ├── 80\n" +
                "    │   └── 60\n" +
                "    └── 30\n" +
                "        ├── 40\n" +
                "        └── 10\n";

        assertThat(actual, is(expected));
    }

    @Test
    public void toString_Skewed() {
        final TreeNode skewed = new TreeNode(10);
        skewed.insert(30).insert(40).insert(50).insert(60).insert(70).insert(80);

        String actual = skewed.toString();
        String expected = "└── 10\n" +
                "    └── 30\n" +
                "        └── 40\n" +
                "            └── 50\n" +
                "                └── 60\n" +
                "                    └── 70\n" +
                "                        └── 80\n";

        assertThat(actual, is(expected));
    }
}