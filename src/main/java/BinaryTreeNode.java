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
        StringBuilder target = new StringBuilder();
        print("", true, target);
        return target.toString();
    }

    private void print(String prefix, boolean onLeft, StringBuilder target) {

        if (right != null) {
            String newPrefix = prefix + (onLeft ? "│   " : "    ");
            StringBuilder rightTarget = new StringBuilder();
            right.print(newPrefix, false, rightTarget);
            target.append(rightTarget);
        }

        target.append(prefix).append(onLeft ? "└── " : "┌── ").append(value).append('\n');

        if (left != null) {
            String newPrefix = prefix + (onLeft ? "    " : "│   ");
            StringBuilder leftTarget = new StringBuilder();
            left.print(newPrefix, true, leftTarget);
            target.append(leftTarget);
        }
    }
}
