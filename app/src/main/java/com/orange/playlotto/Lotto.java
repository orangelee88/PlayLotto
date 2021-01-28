package com.orange.playlotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;


public class Lotto extends AppCompatActivity {
    private TextView open_lottonum1, open_lottonum2, open_lottonum3, open_lottonum4, open_lottonum5, open_lottonum6, open_lottonum7;
    private TextView choose_lottonum1, choose_lottonum2, choose_lottonum3, choose_lottonum4, choose_lottonum5, choose_lottonum6;
    private TextView[] array_choose = {choose_lottonum1, choose_lottonum2, choose_lottonum3, choose_lottonum4, choose_lottonum5, choose_lottonum6};
    private int count = 1;
    private int name_count = 0;
    private String ball_num = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lotto );

        open_lottonum1 = findViewById( R.id.open_lottonum1 );
        open_lottonum2 = findViewById( R.id.open_lottonum2 );
        open_lottonum3 = findViewById( R.id.open_lottonum3 );
        open_lottonum4 = findViewById( R.id.open_lottonum4 );
        open_lottonum5 = findViewById( R.id.open_lottonum5 );
        open_lottonum6 = findViewById( R.id.open_lottonum6 );
        open_lottonum7 = findViewById( R.id.open_lottonum7 );
        array_choose[0] = findViewById( R.id.choose_lottonum1 );
        array_choose[1] = findViewById( R.id.choose_lottonum2 );
        array_choose[2] = findViewById( R.id.choose_lottonum3 );
        array_choose[3] = findViewById( R.id.choose_lottonum4 );
        array_choose[4] = findViewById( R.id.choose_lottonum5 );
        array_choose[5] = findViewById( R.id.choose_lottonum6 );

    }

    public void lotty(View view) {/**大樂透按鈕*/
        HashSet<Integer> set = new HashSet<>();/**HashSet內容不重複特性*/
        while (set.size() < 7) {
            set.add( (int) (Math.random() * 49 + 1) );/**取49亂數*/
        }

        int i = 0;
        int[] lottery = new int[7];/**49選6+1，加上特別號共7個號碼*/
        for (Integer num : set) {
            lottery[i] = num;
            i++;
        }
        open_lottonum1.setText( "" + lottery[0] );
        open_lottonum2.setText( "" + lottery[1] );
        open_lottonum3.setText( "" + lottery[2] );
        open_lottonum4.setText( "" + lottery[3] );
        open_lottonum5.setText( "" + lottery[4] );
        open_lottonum6.setText( "" + lottery[5] );
        open_lottonum7.setText( "" + lottery[6] );

    }

    public void onClick_btn(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                ball_num = "01";
                break;
            case R.id.btn2:
                ball_num = "02";
                break;
            case R.id.btn3:
                ball_num = "03";
                break;
            case R.id.btn4:
                ball_num = "04";
                break;
            case R.id.btn5:
                ball_num = "05";
                break;
            case R.id.btn6:
                ball_num = "06";
                break;
            case R.id.btn7:
                ball_num = "07";
                break;
            case R.id.btn8:
                ball_num = "08";
                break;
            case R.id.btn9:
                ball_num = "09";
                break;
            case R.id.btn10:
                ball_num = "10";
                break;
            case R.id.btn11:
                ball_num = "11";
                break;
            case R.id.btn12:
                ball_num = "12";
                break;
            case R.id.btn13:
                ball_num = "13";
                break;
            case R.id.btn14:
                ball_num = "14";
                break;
            case R.id.btn15:
                ball_num = "15";
                break;
            case R.id.btn16:
                ball_num = "16";
                break;
            case R.id.btn17:
                ball_num = "17";
                break;
            case R.id.btn18:
                ball_num = "18";
                break;
            case R.id.btn19:
                ball_num = "19";
                break;
            case R.id.btn20:
                ball_num = "20";
                break;
            case R.id.btn21:
                ball_num = "21";
                break;
            case R.id.btn22:
                ball_num = "22";
                break;
            case R.id.btn23:
                ball_num = "23";
                break;
            case R.id.btn24:
                ball_num = "24";
                break;
            case R.id.btn25:
                ball_num = "25";
                break;
            case R.id.btn26:
                ball_num = "26";
                break;
            case R.id.btn27:
                ball_num = "27";
                break;
            case R.id.btn28:
                ball_num = "28";
                break;
            case R.id.btn29:
                ball_num = "29";
                break;
            case R.id.btn30:
                ball_num = "30";
                break;
            case R.id.btn31:
                ball_num = "31";
                break;
            case R.id.btn32:
                ball_num = "32";
                break;
            case R.id.btn33:
                ball_num = "33";
                break;
            case R.id.btn34:
                ball_num = "34";
                break;
            case R.id.btn35:
                ball_num = "35";
                break;
            case R.id.btn36:
                ball_num = "36";
                break;
            case R.id.btn37:
                ball_num = "37";
                break;
            case R.id.btn38:
                ball_num = "38";
                break;
            case R.id.btn39:
                ball_num = "39";
                break;
            case R.id.btn40:
                ball_num = "40";
                break;
            case R.id.btn41:
                ball_num = "41";
                break;
            case R.id.btn42:
                ball_num = "42";
                break;
            case R.id.btn43:
                ball_num = "43";
                break;
            case R.id.btn44:
                ball_num = "44";
                break;
            case R.id.btn45:
                ball_num = "45";
                break;
            case R.id.btn46:
                ball_num = "46";
                break;
            case R.id.btn47:
                ball_num = "47";
                break;
            case R.id.btn48:
                ball_num = "48";
                break;
            case R.id.btn49:
                ball_num = "49";
        }
        if (count <= 6) {/**當自選號小於6的時候*/
            count = count + 1;/**數字累加*/
            array_choose[name_count].setText( ball_num );
            name_count = name_count + 1;
        }else if (count < 6){
            Toast.makeText( this, "您還未選滿6個號碼", Toast.LENGTH_SHORT ).show();/**訊息提示完成，可以啟動了*/
        }
        else if (count > 6){
            Toast.makeText( this, "您已選擇完畢", Toast.LENGTH_SHORT ).show();/**訊息提示完成，可以啟動了*/
        }
    }

    /**
     * clear_button清除為0，預設0
     */
    public void clear_button(View view) {
        count = 0;
        array_choose[0].setText( "0" );
        array_choose[1].setText( "0" );
        array_choose[2].setText( "0" );
        array_choose[3].setText( "0" );
        array_choose[4].setText( "0" );
        array_choose[5].setText( "0" );
    }
}