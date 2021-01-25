package com.orange.playlotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class PowerColor extends AppCompatActivity {
    private TextView pc_num0, pc_num1, pc_num2, pc_num3, pc_num4, pc_num5, pc_num6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_power_color );

//        pc_num0 = findViewById( R.id.pc_num0 );
//        pc_num1 = findViewById( R.id.pc_num1 );
//        pc_num2 = findViewById( R.id.pc_num2 );
//        pc_num3 = findViewById( R.id.pc_num3 );
//        pc_num4 = findViewById( R.id.pc_num4 );
//        pc_num5 = findViewById( R.id.pc_num5 );
//        pc_num6 = findViewById( R.id.pc_num6 );//使用第三方套件 註解原來用法

    }

//    public void Powercolor(View view) {/**威力彩*/
//        HashSet<Integer> set = new HashSet<>();/**HashSet內容不重複特性*/
//        while (set.size() < 6) {
//            set.add( (int) (Math.random() * 38 + 1) );/**38亂數*/
//        }
//        int j = 0;
//        int[] Powercolor = new int[6];/**38選6*/
//        for (Integer num : set) {
//            Powercolor[j] = num;
//            j++;
//        }
//
//        int end = (int) (Math.random() * 9 + 1);/**特別號8選1*///使用第三方套件 註解原來用法
//        pc_num0.setText( "" + Powercolor[0] );
//        pc_num1.setText( "" + Powercolor[1] );
//        pc_num2.setText( "" + Powercolor[2] );
//        pc_num3.setText( "" + Powercolor[3] );
//        pc_num4.setText( "" + Powercolor[4] );
//        pc_num5.setText( "" + Powercolor[5] );
//        pc_num6.setText( "" + end );
//
//
//    }
}