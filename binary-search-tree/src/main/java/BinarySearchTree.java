import java.util.*;

class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;

    void insert(T value) {
        if (root == null) {
            root = new Node<>(value);
            return;
        }
        insertValueToNode(value, root);
    }

    private Node<T> insertValueToNode(T value, Node<T> current) {
        if (current == null) {
            return new Node<>(value);
        }

        // build binary tree
        if (value.compareTo(current.getData()) <= 0) {
            current.setLeft(insertValueToNode(value, current.getLeft()));
        } else {
            current.setRight(insertValueToNode(value, current.getRight()));
        }

        return current;
    }

    List<T> getAsSortedList() {
        return getSortedList(root);
    }

    private List<T> getSortedList(Node<T> node) {
        List<T> list = new ArrayList<T>();
        if (node == null) {
            return list;
        }

        // recursively traverse btree by order left -> current -> right
        list.addAll(getSortedList(node.getLeft()));
        list.add(node.getData());
        list.addAll(getSortedList(node.getRight()));

        return list;
    }

    List<T> getAsLevelOrderList() {
        // level ordered list of values
        List<T> values = new LinkedList<>();
        // FIFO queue for holding nodes
        Queue<Node<T>> queue = new LinkedList<>();

        // start with the top level
        queue.add(root);

        while (!queue.isEmpty()) {
            // from left->right traverse through a level
            Node<T> tempNode = queue.poll();
            values.add(tempNode.getData());

            // add nodes from the next level to the queue
            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }
            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }

        return values;
    }

    Node<T> getRoot() {
        return root;
    }

    static class Node<T> {

        private T data;
        private Node<T> left;
        private Node<T> right;

        public Node(T value) {
            data = value;
        }

        void setLeft(Node<T> left) {
            this.left = left;
        }

        Node<T> getLeft() {
            return this.left;
        }

        void setRight(Node<T> right) {
            this.right = right;
        }

        Node<T> getRight() {
            return this.right;
        }

        T getData() {
            return data;
        }
    }
}
