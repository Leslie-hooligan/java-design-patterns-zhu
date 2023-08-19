package com.zhu.iterator;

import lombok.Getter;
import lombok.Setter;
import lombok.val;

/**
 * @author Zhu Junchao
 * @create 2023/8/19 18:15 周六
 */
@Getter
@Setter
public class TreeNode<T extends Comparable<T>> {

    private T value;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value) {
    this.value = value;
    left=null;
    right=null;
    }

    public void insert(T value) {
        TreeNode<T> parent = getParentNodeOfValueToBeInserted(value);
        parent.insertNewChild(value);
    }

    private TreeNode<T> getParentNodeOfValueToBeInserted(T value) {
        TreeNode crr = this;
        TreeNode<T> parent = null;
        while (crr != null) {
            parent=crr;
            crr = crr.traverseOneLevelDown(value);
        }
        return parent;
    }

    private TreeNode traverseOneLevelDown(T value) {
        if(isGreaterThan(value)){
            return this.left;
        }
        return this.right;
    }

    private void insertNewChild(T value) {
        if (this.isLessThanOrEqualTo(value)) {
            this.setRight(new TreeNode<>(value));
        } else {
            this.setLeft(new TreeNode<>(value));
        }
    }

    private boolean isGreaterThan(T val) {
        return this.value.compareTo(val) > 0;
    }

    private boolean isLessThanOrEqualTo(T val) {
        return this.value.compareTo(val) < 1;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
