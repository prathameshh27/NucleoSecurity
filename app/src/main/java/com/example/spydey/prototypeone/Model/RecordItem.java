package com.example.spydey.prototypeone.Model;
import android.util.Log;
import com.example.spydey.prototypeone.UserData;

import java.util.Date;

public class RecordItem extends UserData
{
    public String recordDate;

    public RecordItem()
    {

    }

    public RecordItem(String is_user, String open, String close) {
        super(is_user, open, close);
    }
}
