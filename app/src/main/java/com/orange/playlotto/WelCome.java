package com.orange.playlotto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelCome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_wel_come );


    }

    public void lotto(View view) {
        Intent intent = new Intent();
        intent.setClass(WelCome.this, Lotto.class);
        startActivity(intent);
    }

    public void Powercolor(View view) {
        Intent intent = new Intent();
        intent.setClass(WelCome.this, PowerColor.class);
        startActivity(intent);
    }
}