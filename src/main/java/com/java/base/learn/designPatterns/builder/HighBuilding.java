package com.java.base.learn.designPatterns.builder;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-27 上午1:43
 **/
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("高楼的地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的屋顶");
    }
}
