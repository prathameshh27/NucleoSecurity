package com.example.spydey.prototypeone;

import android.util.Log;

import java.util.Date;

public class UserData {
    protected String is_user, open, close;
    //protected Date open, close;

    public UserData() {
        this.is_user = "debug String";
        this.open = "now()";
        this.close = "now()";
    }

    public UserData(String is_user, String open, String close) {
        this.is_user = is_user;
        this.open =open;
        this.close = close;
    }
}
