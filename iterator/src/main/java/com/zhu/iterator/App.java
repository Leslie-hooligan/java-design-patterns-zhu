package com.zhu.iterator;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class App 
{
    public static void main( String[] args )
    {
        TreasureChest treasureChest = new TreasureChest();
        Iterator<Item> iterator = treasureChest.iterator(ItemType.ANY);
        while( iterator.hasNext() ){
            System.out.println(iterator.next());
        }

        TreeNode root = new TreeNode<>(8);

        root.insert(3);
        root.insert(10);
        root.insert(1);
        root.insert(6);
        root.insert(14);
        root.insert(4);
        root.insert(7);
        root.insert(13);

        BstIterator bstIterator = new BstIterator<>(root);

        while (bstIterator.hasNext()) {
            log.info("Next node: " + bstIterator.next().getValue());
        }
    }
}
