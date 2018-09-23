package com.example.share;

import android.app.Application;

public class claimshare extends Application {
    String Time;
    String Sharename;
    String Tag1;
    String Tag2;
    String Tag3;

    public claimshare(String Time, String Sharename, String Tag1, String Tag2, String Tag3) {
        this.Time=Time;
        this.Sharename = Sharename;
        this.Tag1 = Tag1;
        this.Tag2 = Tag2;
        this.Tag3 = Tag3;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getSharename() {
        return Sharename;
    }

    public void setSharename(String Sharename) {
        this.Sharename = Sharename;
    }

    public String getTag1() {
        return Tag1;
    }

    public void setTag1(String Tag1) {
        this.Tag1 = Tag1;
    }

    public String getTag2() {
        return Tag2;
    }

    public void setTag2(String Tag2) {
        this.Tag2 = Tag2;
    }

    public String getTag3() {
        return Tag3;
    }

    public void setTag3(String Tag3) {
        this.Tag3 = Tag3;
    }

}
