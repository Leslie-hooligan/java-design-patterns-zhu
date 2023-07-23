package com.zhu.adapter;

/**
 * @author Zhu Junchao
 * @create 2023/7/23 16:43 周日
 */
public class FishingBoatAdapter implements RowingBoat{
    private FishingBoat fishingBoat = new FishingBoat();

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
