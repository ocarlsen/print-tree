import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.javac.code.Kinds.NIL;

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

        for (int i = 0; i < children.size() - 1; i++) {
            TreeNode child = children.get(i);
            child.print(newPrefix, false, target);
        }

        // Last child.
        if (children.size() > 0) {
            TreeNode child = children.get(children.size() - 1);
            child.print(newPrefix, true, target);
        }
    }
}
