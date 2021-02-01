package com.orange.playlotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

import java.util.HashSet;


public class PowerColor extends AppCompatActivity {
    private TextView open_powernum1, open_powernum2, open_powernum3, open_powernum4, open_powernum5, open_powernum6, open_powernum7;
    private TextView choose_powernum1, choose_powernum2, choose_powernum3, choose_powernum4, choose_powernum5, choose_powernum6, choose_powernum7;
    private TextView[] array_choose = {choose_powernum1, choose_powernum2, choose_powernum3, choose_powernum4, choose_powernum5, choose_powernum6, choose_powernum7};
    private int count = 1;
    private int name_count = 0;
    private String ball_num = "0";
    private ShowToast showToast = new ShowToast();
    private  Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_power_color );

        open_powernum1 = findViewById( R.id.open_powernum1 );
        open_powernum2 = findViewById( R.id.open_powernum2 );
        open_powernum3 = findViewById( R.id.open_powernum3 );
        open_powernum4 = findViewById( R.id.open_powernum4 );
        open_powernum5 = findViewById( R.id.open_powernum5 );
        open_powernum6 = findViewById( R.id.open_powernum6 );
        open_powernum7 = findViewById( R.id.open_powernum7 );
        array_choose[0] = findViewById( R.id.choose_powernum1 );
        array_choose[1] = findViewById( R.id.choose_powernum2 );
        array_choose[2] = findViewById( R.id.choose_powernum3 );
        array_choose[3] = findViewById( R.id.choose_powernum4 );
        array_choose[4] = findViewById( R.id.choose_powernum5 );
        array_choose[5] = findViewById( R.id.choose_powernum6 );
        array_choose[6] = findViewById( R.id.choose_powernum7 );

    }

    public void power_color(View view) {/**威力彩按鈕*/
        HashSet<Integer> set = new HashSet<>();/**HashSet內容不重複特性*/
        while (set.size() < 7) {
            set.add( (int) (Math.random() * 39 + 1) );/**取1~38亂數*/
        }

        int i = 0;
        int[] power_color = new int[7];
        for (Integer num : set) {
            power_color[i] = num;
            i++;
        }
        int power_color_end = (int) (Math.random() * 8 + 1);/**特別號8選1*/
        open_powernum1.setText( "" + power_color[0] );
        open_powernum2.setText( "" + power_color[1] );
        open_powernum3.setText( "" + power_color[2] );
        open_powernum4.setText( "" + power_color[3] );
        open_powernum5.setText( "" + power_color[4] );
        open_powernum6.setText( "" + power_color[5] );
        open_powernum7.setText( "" +  power_color_end );

    }

    public void onClick_btn(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                ball_num = "1";
                break;
            case R.id.btn2:
                ball_num = "2";
                break;
            case R.id.btn3:
                ball_num = "3";
                break;
            case R.id.btn4:
                ball_num = "4";
                break;
            case R.id.btn5:
                ball_num = "5";
                break;
            case R.id.btn6:
                ball_num = "6";
                break;
            case R.id.btn7:
                ball_num = "7";
                break;
            case R.id.btn8:
                ball_num = "8";
                break;
            case R.id.btn9:
                ball_num = "9";
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

        }
        if (count <= 7) {/**當自選號小於7個的時候*/
            if (ball_num.equals( array_choose[0].getText() ) || ball_num.equals( array_choose[1].getText() ) || ball_num.equals( array_choose[2].getText() )
                    || ball_num.equals( array_choose[3].getText() ) || ball_num.equals( array_choose[4].getText() ) || ball_num.equals( array_choose[5].getText() )) {
                showToast.showToastOne(PowerColor.this, "您選擇號碼重複" );
            } else {
                count = count + 1;/**數字累加*/
                array_choose[name_count].setText( ball_num );
                name_count++;
            }
        } else if (count > 7) {
            showToast.showToastOne(PowerColor.this, "您已選擇完畢" );/**訊息提示完成，可以啟動了*/
        }
    }
    /**
     * clear_button清除為0，預設所有值為0
     */
    public void clear_button(View view) {
        count = 1;
        name_count = 0;
        array_choose[0].setText( "0" );
        array_choose[1].setText( "0" );
        array_choose[2].setText( "0" );
        array_choose[3].setText( "0" );
        array_choose[4].setText( "0" );
        array_choose[5].setText( "0" );
        array_choose[6].setText( "0" );
    }
}