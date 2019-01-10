/**
 * Sample code demonstrating {@link BinaryTreeNode#toString()}.
 */
public class BinaryTreeNodeDemo {

    public static void main(String[] args) {

        final BinaryTreeNode balanced = new BinaryTreeNode(50);
        final BinaryTreeNode a = balanced.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTreeNode b = balanced.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);

        System.out.println("balanced");
        System.out.println(balanced);

        // Skewed right.
        final BinaryTreeNode skewedRight = new BinaryTreeNode(10);
        skewedRight.insertRight(30).insertRight(40).insertRight(50).insertRight(60).insertRight(70).insertRight(80);

        System.out.println("skewedRight");
        System.out.println(skewedRight);

        // Skewed left.
        final BinaryTreeNode skewedLeft = new BinaryTreeNode(10);
        skewedLeft.insertLeft(30).insertLeft(40).insertLeft(50).insertLeft(60).insertLeft(70).insertLeft(80);

        System.out.println("skewedLeft");
        System.out.println(skewedLeft);
    }
}
