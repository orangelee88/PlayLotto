package com.orange.playlotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;


public class Lotto extends AppCompatActivity {
    private TextView open_lottonum0, open_lottonum1, open_lottonum2, open_lottonum3, open_lottonum4, open_lottonum5, open_lottonum6;
    private TextView choose_lottonum0, choose_lottonum1, choose_lottonum2, choose_lottonum3, choose_lottonum4, choose_lottonum5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lotto );

        open_lottonum0 = findViewById( R.id.open_lottonum0 );
        open_lottonum1 = findViewById( R.id.open_lottonum1 );
        open_lottonum2 = findViewById( R.id.open_lottonum2 );
        open_lottonum3 = findViewById( R.id.open_lottonum3 );
        open_lottonum4 = findViewById( R.id.open_lottonum4 );
        open_lottonum5 = findViewById( R.id.open_lottonum5 );
        open_lottonum6 = findViewById( R.id.open_lottonum6 );
        choose_lottonum0 = findViewById( R.id.choose_lottonum0 );
        choose_lottonum1 = findViewById( R.id.choose_lottonum1 );
        choose_lottonum2 = findViewById( R.id.choose_lottonum2 );
        choose_lottonum3 = findViewById( R.id.choose_lottonum3 );
        choose_lottonum4 = findViewById( R.id.choose_lottonum4 );
        choose_lottonum5 = findViewById( R.id.choose_lottonum5 );

    }

    public void lotty(View view) {/**大樂透*/
        HashSet<Integer> set = new HashSet<>();/**HashSet內容不重複特性*/
        while (set.size() < 7) {
            set.add( (int) (Math.random() * 49 + 1) );/**49亂數*/
        }

        int i = 0;
        int[] lottery = new int[7];/**49選6*/
        for (Integer num : set) {
            lottery[i] = num;
            i++;
        }
        open_lottonum0.setText( "" + lottery[0] );
        open_lottonum1.setText( "" + lottery[1] );
        open_lottonum2.setText( "" + lottery[2] );
        open_lottonum3.setText( "" + lottery[3] );
        open_lottonum4.setText( "" + lottery[4] );
        open_lottonum5.setText( "" + lottery[5] );
        open_lottonum6.setText( "" + lottery[6] );

    }

    public void btn1(View view) {
        choose_lottonum0.setText( "01" );
    }

    public void btn2(View view) {
        choose_lottonum1.setText( "02" );
    }

    public void btn3(View view) {
        choose_lottonum2.setText( "03" );
    }

    public void btn4(View view) {
        choose_lottonum3.setText( "04" );
    }

    public void btn5(View view) {
        choose_lottonum4.setText( "05" );
    }

    public void btn6(View view) {
        choose_lottonum5.setText( "06" );
    }

    public void btn7(View view) {
        choose_lottonum0.setText( "07" );
    }
}