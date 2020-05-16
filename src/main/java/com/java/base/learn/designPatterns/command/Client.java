package com.java.base.learn.designPatterns.command;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-15 下午4:21
 **/
public class Client {

    public static void main(String[] args) {
        LightReceiver receiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(receiver);
        LightOffCommand lightOffCommand = new LightOffCommand(receiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("==============按开灯按钮==============");
        remoteController.onButtonWasPushed(0);

        System.out.println("==============按关灯按钮==============");
        remoteController.offButtonWasPushed(0);

        System.out.println("==============撤销按关灯按钮==============");
        remoteController.undoButtonWasPushed();

        TVReceiver tvReceiver = new TVReceiver();

        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("==============按关闭电视机按钮==============");
        remoteController.offButtonWasPushed(1);

        System.out.println("==============按打开电视机按钮==============");
        remoteController.onButtonWasPushed(1);

        System.out.println("==============撤销按打开电视机按钮==============");
        remoteController.undoButtonWasPushed();
    }
}
