import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class BinaryTreeNodeTest {

    @Test
    public void toString_BalancedTree() {
        final BinaryTreeNode balanced = new BinaryTreeNode(50);
        final BinaryTreeNode a = balanced.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTreeNode b = balanced.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);

        String actual = balanced.toString();
        String expected =
                "│       ┌── 80\n" +
                "│   ┌── 70\n" +
                "│   │   └── 60\n" +
                "└── 50\n" +
                "    │   ┌── 40\n" +
                "    └── 30\n" +
                "        └── 10\n";

        assertThat(actual, is(expected));
    }
   @Test
    public void toString_SkewedRightTree() {
        final BinaryTreeNode skewedRight = new BinaryTreeNode(10);
        skewedRight.insertRight(30).insertRight(40).insertRight(50).insertRight(60).insertRight(70).insertRight(80);

        String actual = skewedRight.toString();
        String expected =
                "│                       ┌── 80\n" +
                "│                   ┌── 70\n" +
                "│               ┌── 60\n" +
                "│           ┌── 50\n" +
                "│       ┌── 40\n" +
                "│   ┌── 30\n" +
                "└── 10\n";

       assertThat(actual, is(expected));
    }
   @Test
    public void toString_SkewedLeftTree() {
         final BinaryTreeNode skewedLeft = new BinaryTreeNode(10);
        skewedLeft.insertLeft(30).insertLeft(40).insertLeft(50).insertLeft(60).insertLeft(70).insertLeft(80);

        String actual = skewedLeft.toString();
        String expected =
                "└── 10\n" +
                "    └── 30\n" +
                "        └── 40\n" +
                "            └── 50\n" +
                "                └── 60\n" +
                "                    └── 70\n" +
                "                        └── 80\n";

       assertThat(actual, is(expected));
    }
}