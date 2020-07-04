package com.itheima.mm.entity;

import java.io.Serializable;

public class ChangeLogDate  implements Serializable {
    private String userName;
    private String changeDate;
    private String context;

    public ChangeLogDate() {
    }

    public ChangeLogDate(String userName, String changeDate) {
        this.userName = userName;
        this.changeDate = changeDate;
    }

    public ChangeLogDate(String userName, String changeDate, String context) {
        this.userName = userName;
        this.changeDate = changeDate;
        this.context = context;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "ChangeLogDate{" +
                "userName='" + userName + '\'' +
                ", changeDate='" + changeDate + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
