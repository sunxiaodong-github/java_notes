package com.java.base.learn.designPatterns.command;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/16 11:49 PM
 */
public class TVOnCommand implements Command {

    TVReceiver receiver;

    public TVOnCommand(TVReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
