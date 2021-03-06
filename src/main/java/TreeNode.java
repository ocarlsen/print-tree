import java.util.ArrayList;
import java.util.List;

/**
 * A simple N-ARY tree node whose {@link #toString() method returns a string like the Unix 'tree' command.
 *
 * @see https://en.wikipedia.org/wiki/Tree_(command)
 */
public class TreeNode {

    private final List<TreeNode> children = new ArrayList<>();

    private int value;

    TreeNode(int value) {
        this.value = value;
    }

    TreeNode insert(int value) {
        TreeNode child = new TreeNode(value);
        children.add(child);
        return child;
    }

    @Override
    public String toString() {
        StringBuilder target = new StringBuilder();
        print("", true, target);
        return target.toString();
    }

    private void print(String prefix, boolean isTail, StringBuilder target) {
        target.append(prefix).append(isTail ? "└── " : "├── ").append(value).append('\n');

        String newPrefix = prefix + (isTail ? "    " : "│   ");

        for (int i = children.size() - 1; i > 0; i--) {
            TreeNode child = children.get(i);
            child.print(newPrefix, false, target);
        }

        // Last child.
        if (children.size() > 0) {
            TreeNode child = children.get(0);
            child.print(newPrefix, true, target);
        }
    }
}
