package com.itheima.mm.entity;

public class Result  {
    private boolean flag;
    private Object result;
    private String message;


    public Result() {
    }

    public Result(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public Result(boolean flag, Object result, String message) {
        this.flag = flag;
        this.result = result;
        this.message = message;
    }

    /**
     * 获取
     * @return flag
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * 设置
     * @param flag
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    /**
     * 获取
     * @return result
     */
    public Object getResult() {
        return result;
    }

    /**
     * 设置
     * @param result
     */
    public void setResult(Object result) {
        this.result = result;
    }

    /**
     * 获取
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "Result{flag = " + flag + ", result = " + result + ", message = " + message + "}";
    }
}
