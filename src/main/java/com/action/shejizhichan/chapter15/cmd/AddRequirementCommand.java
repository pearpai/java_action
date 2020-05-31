package com.action.shejizhichan.chapter15.cmd;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 10:25
 * @Version 1.0
 */
public class AddRequirementCommand extends Command {


    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();

        super.pg.add();
        super.cg.add();

        super.rg.plan();
    }
}
