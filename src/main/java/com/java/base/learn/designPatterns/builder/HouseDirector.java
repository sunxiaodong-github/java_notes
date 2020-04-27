package com.java.base.learn.designPatterns.builder;

/**
 * <p>
 *     指挥者
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-27 上午1:45
 **/
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    // 构造器传入 houseBuilder
    public  HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    // 通过setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的一个流程，交给指挥者
    public House contructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
