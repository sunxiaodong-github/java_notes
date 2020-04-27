package com.java.base.learn.designPatterns.builder;

/**
 * <p>
 *     建造者模式
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-27 上午1:50
 **/
public class Client {

    public static void main(String[] args) {
        // 普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 准备建造房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.contructHouse();
        System.out.println("<===============>");

        // 高楼
        houseDirector.setHouseBuilder(new HighBuilding());
        houseDirector.contructHouse();
    }
}
