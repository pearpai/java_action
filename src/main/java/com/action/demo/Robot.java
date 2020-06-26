package com.action.demo;

public class Robot {

    /**
     * 当前位置
     */
    int x = 0;
    int y = 0;

    /**
     * 移动越界
     */
    int maxX = 20;
    int maxY = 20;

    int minX = 0;
    int minY = 0;

    /**
     * 当前面对方向
     */
    int nowDirection = CmdConstants.DIRECTION_X_RIGHT;
    char nowOperation;

    /**
     * 操作
     *
     * @param operation 操作 方向切换 或者 移动等
     * @throws Exception 移动越界
     */
    public void changeDirectionOrStep(char operation) throws Exception {
        this.nowOperation = operation;
        switch (operation) {
            case CmdConstants.BACK:
                this.nowDirection = -this.nowDirection;
                break;
            case CmdConstants.LEFT:
                if (this.nowDirection == CmdConstants.DIRECTION_X_RIGHT) {
                    this.nowDirection = CmdConstants.DIRECTION_Y_UP;
                } else if (this.nowDirection == CmdConstants.DIRECTION_X_LEFT) {
                    this.nowDirection = CmdConstants.DIRECTION_Y_DOWN;
                } else if (this.nowDirection == CmdConstants.DIRECTION_Y_UP) {
                    this.nowDirection = CmdConstants.DIRECTION_X_LEFT;
                } else if (this.nowDirection == CmdConstants.DIRECTION_Y_DOWN) {
                    this.nowDirection = CmdConstants.DIRECTION_X_RIGHT;
                }
                break;
            case CmdConstants.RIGHT:
                if (this.nowDirection == CmdConstants.DIRECTION_X_RIGHT) {
                    this.nowDirection = CmdConstants.DIRECTION_Y_DOWN;
                } else if (this.nowDirection == CmdConstants.DIRECTION_X_LEFT) {
                    this.nowDirection = CmdConstants.DIRECTION_Y_UP;
                } else if (this.nowDirection == CmdConstants.DIRECTION_Y_UP) {
                    this.nowDirection = CmdConstants.DIRECTION_X_RIGHT;
                } else if (this.nowDirection == CmdConstants.DIRECTION_Y_DOWN) {
                    this.nowDirection = CmdConstants.DIRECTION_X_LEFT;
                }
                break;
            case CmdConstants.FORWARD:
            case CmdConstants.WORK:
                break;
            default:
                addStep(operation);
                break;
        }

    }


    /**
     * 设置移动方向一定距离
     *
     * @param step 移动距离
     * @throws Exception 越界抛出信息
     */
    public void addStep(char step) throws Exception {
        int number = step - '0';
        switch (nowDirection) {
            case CmdConstants.DIRECTION_X_RIGHT:
                addX(number);
                break;
            case CmdConstants.DIRECTION_X_LEFT:
                addX(number * -1);
                break;
            case CmdConstants.DIRECTION_Y_UP:
                addY(number);
                break;
            case CmdConstants.DIRECTION_Y_DOWN:
                addY(number * -1);
                break;
            default:
                break;
        }
    }


    /**
     * X 方向移动
     *
     * @param add 移动距离
     * @throws Exception 越界抛错
     */
    public void addX(int add) throws Exception {
        if (add + this.x > maxX || add + this.x < minX) {
            throw new Exception("X越界停止执行");
        }
        this.x = this.x + add;
    }

    /**
     * y 方向移动
     *
     * @param add 移动距离
     * @throws Exception 越界抛错
     */
    public void addY(int add) throws Exception {
        if (add + this.y > maxY || add + this.y < minY) {
            throw new Exception("Y越界停止执行");
        }
        this.y = this.y + add;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNowDirection() {
        return nowDirection;
    }

    public void setNowDirection(int nowDirection) {
        this.nowDirection = nowDirection;
    }

    public char getNowOperation() {
        return nowOperation;
    }

    public void setNowOperation(char nowOperation) {
        this.nowOperation = nowOperation;
    }
}
