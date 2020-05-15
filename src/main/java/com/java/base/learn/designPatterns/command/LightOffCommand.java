package com.java.base.learn.designPatterns.command;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-15 下午4:04
 **/
public class LightOffCommand implements Command {

    LightReceiver light;

    public LightOffCommand(LightReceiver light){
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
