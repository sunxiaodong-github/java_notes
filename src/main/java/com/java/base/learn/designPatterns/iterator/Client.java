package com.java.base.learn.designPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 10:53 PM
 */
public class Client {

    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        colleges.add(computerCollege);
        colleges.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();
    }
}
