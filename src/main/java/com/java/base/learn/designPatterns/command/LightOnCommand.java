package com.java.base.learn.designPatterns.command;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-15 下午4:00
 **/
public class LightOnCommand implements Command {

    LightReceiver light;

    public LightOnCommand(LightReceiver light){
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
