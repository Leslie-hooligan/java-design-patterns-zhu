package com.zhu.iterator;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/**
 * @author Zhu Junchao
 * @create 2023/8/19 18:31 周六
 */
public class BstIterator<T extends Comparable<T>> implements Iterator<TreeNode<T>> {

    private final ArrayDeque<TreeNode<T>> pathStack;

    public BstIterator(TreeNode<T> root) {
        pathStack = new ArrayDeque<>();
        pushPathToNextSmallest(root);
    }

    private void pushPathToNextSmallest(TreeNode<T> root) {
        TreeNode<T> idx = root;
        while (idx != null) {
            pathStack.push(idx);
            idx = idx.getLeft();
        }
    }

    @Override
    public boolean hasNext() {
        return !pathStack.isEmpty();
    }

    @Override
    public TreeNode<T> next() throws NoSuchElementException {
        if (pathStack.isEmpty()) {
            throw new NoSuchElementException();
        }
        TreeNode<T> pop = pathStack.pop();
        pushPathToNextSmallest(pop.getRight());
        return pop;
    }
}
