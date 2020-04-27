package com.java.base.learn.designPatterns.builder;

/**
 * <p>
 *     抽象建造者
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-27 上午1:38
 **/
public abstract class HouseBuilder {
    protected House house = new House();

    // 将建造流程写好，抽象方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    // 将产品返回
    public House buildHouse(){
        return house;
    }
}
