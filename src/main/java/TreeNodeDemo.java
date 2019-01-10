/**
 * Sample code demonstrating {@link TreeNode#toString()}.
 */
public class TreeNodeDemo {

    public static void main(String[] args) {

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

        System.out.println("balanced");
        System.out.println(balanced);

        // Skewed.
        final TreeNode skewed = new TreeNode(10);
        skewed.insert(30).insert(40).insert(50).insert(60).insert(70).insert(80);

        System.out.println("skewed");
        System.out.println(skewed);
    }
}
