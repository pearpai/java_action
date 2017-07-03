package com.action.threads.deadlock;

import java.util.ArrayList;
import java.util.List;

/**
 * Thread 1  locks A, waits for B
 * Thread 2  locks B, waits for A
 * Created by wuyunfeng on 2017/6/27.
 */
public class TreeNode {

    TreeNode parent = null;
    List children = new ArrayList();

    public synchronized void addChild(TreeNode child){
        if (!this.children.contains(child)){
            this.children.add(child);
            child.setParentOnly(this);
        }
    }

    public synchronized void addChildOnly(TreeNode child){
        if (!this.children.contains(child)){
            this.children.add(child);
        }
    }

    public synchronized void setParent(TreeNode parent){
        this.parent = parent;
        parent.addChildOnly(this);
    }


    public synchronized void setParentOnly(TreeNode parent){
        this.parent = parent;
    }
}
