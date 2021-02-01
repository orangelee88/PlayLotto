package com.orange.playlotto;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {

    public static Toast toast;

    public static void showToastOne(Context context, int content){
        if (toast == null){
            toast = Toast.makeText(context,content + "",Toast.LENGTH_SHORT);
        }else {
            toast.setText(content + "");
        }
        toast.show();
    }

    public static void showToastOne(Context context,String content){
        if (toast == null){
            toast = Toast.makeText(context,content + "",Toast.LENGTH_SHORT);
        }else {
            toast.setText(content + "");
        }
        toast.show();
    }

    public static void clean(){
        toast = null;
    }
}

