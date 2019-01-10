/**
 * A simple BINARY tree node whose {@link #toString() method returns a string like the Unix 'tree' command.
 *
 * @see https://en.wikipedia.org/wiki/Tree_(command)
 */
public class BinaryTreeNode {

    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    BinaryTreeNode(int value) {
        this.value = value;
    }

    BinaryTreeNode insertLeft(int leftValue) {
        this.left = new BinaryTreeNode(leftValue);
        return this.left;
    }

    BinaryTreeNode insertRight(int rightValue) {
        this.right = new BinaryTreeNode(rightValue);
        return this.right;
    }

    @Override
    public String toString() {
        return print("", true, new StringBuilder()).toString();
    }

    private StringBuilder print(String prefix, boolean onLeft, StringBuilder target) {

        if (right != null) {
            target.append(right.print(prefix + (onLeft ? "│   " : "    "), false, new StringBuilder()));
        }

        target.append(prefix).append(onLeft ? "└── " : "┌── ").append(value).append('\n');

        if (left != null) {
            target.append(left.print(prefix + (onLeft ? "    " : "│   "), true, new StringBuilder()));
        }

        return target;
    }
}
