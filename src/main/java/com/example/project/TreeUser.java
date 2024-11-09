package com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
        throw new UnsupportedOperationException("Not supported yet.");
        if (bt == null) {
           return 0;
        }
        boolean[] bool = new boolean[1];
        bt.isLeaf(bool);
        if (bool[0]) {
            return 1;
        }
        int leftLeaves = countLeaves(bt.getLeft());
        int rightLeaves = countLeaves(bt.getRight());
        return leftLeaves + rightLeaves;
    }
    }
}
