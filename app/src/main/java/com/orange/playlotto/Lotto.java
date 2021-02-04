package com.orange.playlotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

import java.util.HashSet;


public class Lotto extends AppCompatActivity {
    private TextView open_lottonum1, open_lottonum2, open_lottonum3, open_lottonum4, open_lottonum5, open_lottonum6, open_lottonum7;
    private TextView choose_lottonum1, choose_lottonum2, choose_lottonum3, choose_lottonum4, choose_lottonum5, choose_lottonum6;
    private TextView[] array_choose = {choose_lottonum1, choose_lottonum2, choose_lottonum3, choose_lottonum4, choose_lottonum5, choose_lottonum6};
    private int count = 1, count_add = 0;//count_add 儲存自選號碼中獎用
    private int name_count = 0;
    private String ball_num = "0";
    private ShowToast showToast = new ShowToast();
    private Context context;
    private int tempNum;//交換數字暫存用
    private int[] choose_lottery = new int[6];
    private int choose_num = 0;//儲存自選號碼用

    /**
     * 自選6個號碼+1特別號碼的儲存空間
     */


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

    public void lotty(View view) {/**大樂透開獎按鈕*/
        HashSet<Integer> set = new HashSet<>();/**使用HashSet內容不重複特性*/
        while (set.size() < 7) {
            set.add( (int) (Math.random() * 49 + 1) );/**大樂透取49亂數*/
        }

        int i = 0;
        int[] lottery = new int[7];/**49選6+1，加上特別號共7個號碼*/
        for (Integer num : set) {
            lottery[i] = num;
            i++;
        }

        for (int k = 0; k < 6; k++)/**Bubble_Sort排序*/
            for (int j = k + 1; j < 7; j++)
                // 改變下式中的大、小於符號可變更排列順序,目前使用< 由小到大排列>
                if (lottery[k] > lottery[j]) {
                    tempNum = lottery[k];
                    lottery[k] = lottery[j];
                    lottery[j] = tempNum;
                }

        open_lottonum1.setText( "" + lottery[0] );
        open_lottonum2.setText( "" + lottery[1] );
        open_lottonum3.setText( "" + lottery[2] );
        open_lottonum4.setText( "" + lottery[3] );
        open_lottonum5.setText( "" + lottery[4] );
        open_lottonum6.setText( "" + lottery[5] );
        open_lottonum7.setText( "" + lottery[6] );
        for (int open = 0; open < 7; open++) {/**比對中獎號碼*/
            for (int choose = 0; choose < 6; choose++) {/**自選號碼*/
                if (lottery[open] == choose_lottery[choose]) {/**自選號碼=開獎號碼的時候*/
                    count_add = count_add + 1;/**有對中號碼+1*/
                }
            }
        }
        switch (count_add) {
            case 0:
                showToast.showToastOne( Lotto.this, "1個號碼都沒有中，殘念" );
                break;
            case 1:
                showToast.showToastOne( Lotto.this, "只中1個號碼，您沒中獎" );
                break;
            case 2:
                showToast.showToastOne( Lotto.this, "只中2個號碼，您沒中獎" );
                break;
            case 3:
                if (count_add == 3) {
                    showToast.showToastOne( Lotto.this, "您中3個號碼，普獎400元" );
                } else {
                    showToast.showToastOne( Lotto.this, "您中3個號碼+特別號，柒獎400元" );
                }
                break;
            case 4:
                if (count_add == 4) {
                    showToast.showToastOne( Lotto.this, "您中4個號碼，伍獎2000元" );
                } else {
                    showToast.showToastOne( Lotto.this, "您中3個號碼+特別號，陸獎1000元" );
                }
                break;
            case 5:
                if (count_add == 5) {
                    showToast.showToastOne( Lotto.this, "您中5個號碼，您中參獎" );
                } else {
                    showToast.showToastOne( Lotto.this, "您中4個號碼+特別號，您中肆獎" );
                }
                break;
            case 6:
                if (count_add == 6) {
                    showToast.showToastOne( Lotto.this, "恭喜您中6個號碼，您中頭獎了" );
                } else {
                    showToast.showToastOne( Lotto.this, "您中5個號碼+特別號，您中貳獎" );
                }
                break;
        }
        count_add=0;
    }

    public void onClick_btn(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                ball_num = "1";
                choose_num = 1;
                break;
            case R.id.btn2:
                ball_num = "2";
                choose_num = 2;
                break;
            case R.id.btn3:
                ball_num = "3";
                choose_num = 3;
                break;
            case R.id.btn4:
                ball_num = "4";
                choose_num = 4;
                break;
            case R.id.btn5:
                ball_num = "5";
                choose_num = 5;
                break;
            case R.id.btn6:
                ball_num = "6";
                choose_num = 6;
                break;
            case R.id.btn7:
                ball_num = "7";
                choose_num = 7;
                break;
            case R.id.btn8:
                ball_num = "8";
                choose_num = 8;
                break;
            case R.id.btn9:
                ball_num = "9";
                choose_num = 9;
                break;
            case R.id.btn10:
                ball_num = "10";
                choose_num = 10;
                break;
            case R.id.btn11:
                ball_num = "11";
                choose_num = 11;
                break;
            case R.id.btn12:
                ball_num = "12";
                choose_num = 12;
                break;
            case R.id.btn13:
                ball_num = "13";
                choose_num = 13;
                break;
            case R.id.btn14:
                ball_num = "14";
                choose_num = 14;
                break;
            case R.id.btn15:
                ball_num = "15";
                choose_num = 15;
                break;
            case R.id.btn16:
                ball_num = "16";
                choose_num = 16;
                break;
            case R.id.btn17:
                ball_num = "17";
                choose_num = 17;
                break;
            case R.id.btn18:
                ball_num = "18";
                choose_num = 18;
                break;
            case R.id.btn19:
                ball_num = "19";
                choose_num = 19;
                break;
            case R.id.btn20:
                ball_num = "20";
                choose_num = 20;
                break;
            case R.id.btn21:
                ball_num = "21";
                choose_num = 21;
                break;
            case R.id.btn22:
                ball_num = "22";
                choose_num = 22;
                break;
            case R.id.btn23:
                ball_num = "23";
                choose_num = 23;
                break;
            case R.id.btn24:
                ball_num = "24";
                choose_num = 24;
                break;
            case R.id.btn25:
                ball_num = "25";
                choose_num = 25;
                break;
            case R.id.btn26:
                ball_num = "26";
                choose_num = 26;
                break;
            case R.id.btn27:
                ball_num = "27";
                choose_num = 27;
                break;
            case R.id.btn28:
                ball_num = "28";
                choose_num = 28;
                break;
            case R.id.btn29:
                ball_num = "29";
                choose_num = 29;
                break;
            case R.id.btn30:
                ball_num = "30";
                choose_num = 30;
                break;
            case R.id.btn31:
                ball_num = "31";
                choose_num = 31;
                break;
            case R.id.btn32:
                ball_num = "32";
                choose_num = 32;
                break;
            case R.id.btn33:
                ball_num = "33";
                choose_num = 33;
                break;
            case R.id.btn34:
                ball_num = "34";
                choose_num = 34;
                break;
            case R.id.btn35:
                ball_num = "35";
                choose_num = 35;
                break;
            case R.id.btn36:
                ball_num = "36";
                choose_num = 36;
                break;
            case R.id.btn37:
                ball_num = "37";
                choose_num = 37;
                break;
            case R.id.btn38:
                ball_num = "38";
                choose_num = 38;
                break;
            case R.id.btn39:
                ball_num = "39";
                choose_num = 39;
                break;
            case R.id.btn40:
                ball_num = "40";
                choose_num = 40;
                break;
            case R.id.btn41:
                ball_num = "41";
                choose_num = 41;
                break;
            case R.id.btn42:
                ball_num = "42";
                choose_num = 42;
                break;
            case R.id.btn43:
                ball_num = "43";
                choose_num = 43;
                break;
            case R.id.btn44:
                ball_num = "44";
                choose_num = 44;
                break;
            case R.id.btn45:
                ball_num = "45";
                choose_num = 45;
                break;
            case R.id.btn46:
                ball_num = "46";
                choose_num = 46;
                break;
            case R.id.btn47:
                ball_num = "47";
                choose_num = 47;
                break;
            case R.id.btn48:
                ball_num = "48";
                choose_num = 48;
                break;
            case R.id.btn49:
                ball_num = "49";
                choose_num = 49;
                break;
        }

        if (count <= 6) {/**當自選號小於6的時候*/
            if (ball_num.equals( array_choose[0].getText() ) || ball_num.equals( array_choose[1].getText() ) || ball_num.equals( array_choose[2].getText() )
                    || ball_num.equals( array_choose[3].getText() ) || ball_num.equals( array_choose[4].getText() ) || ball_num.equals( array_choose[5].getText() )) {
                showToast.showToastOne( Lotto.this, "您選擇號碼重複" );
            } else {
                count = count + 1;/**號碼數累加*/
                choose_lottery[name_count] = choose_num;/**自選號碼存入陣列*/
                array_choose[name_count].setText( ball_num );
                name_count++;

            }
        } else if (count > 6) {
            showToast.showToastOne( Lotto.this, "您已選擇完畢" );
        }
    }

    /**
     * clear_button清除，預設為0
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
        choose_lottery [0]=0;
        choose_lottery [1]=0;
        choose_lottery [2]=0;
        choose_lottery [3]=0;
        choose_lottery [4]=0;
        choose_lottery [5]=0;

    }
}