package com.zhu.iterator;

import java.util.List;

/**
 * @author Zhu Junchao
 * @create 2023/8/19 17:40 周六
 */

public class TreasureChestItemIterator implements Iterator {

    private final TreasureChest item;
    private int index;
    private final ItemType type;

    public TreasureChestItemIterator(TreasureChest chest, ItemType type) {
        this.item = chest;
        this.type = type;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Object next() {
        index = findNextIdx();
        if (index != -1){
            return item.getItems().get(index);
        }
        return null;
    }

    private int findNextIdx() {
        List<Item> items = item.getItems();
        int idx = index;
        while (true) {
            idx++;
            if (idx >= items.size()) {
                idx = -1;
                break;
            }
            if (ItemType.ANY.equals(type) || items.get(idx).getType().equals(type)) {
                break;
            }
        }
        return idx;
    }
}
