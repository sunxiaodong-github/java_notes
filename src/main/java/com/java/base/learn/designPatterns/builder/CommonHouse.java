package com.java.base.learn.designPatterns.builder;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-27 上午1:41
 **/
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子建地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
