package com.java.base.learn.designPatterns.flyweight;

import java.util.HashMap;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午3:29
 **/
public class WebSiteFactory {

    private HashMap<String, ConcreteWebSize> pool = new HashMap<>();

    public WebSize getWebSiteCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type, new ConcreteWebSize(type));
        }
        return (WebSize) pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}
