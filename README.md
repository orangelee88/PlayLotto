# PlayLotto
![image](https://github.com/orangelee88/PlayLotto/blob/master/Play_Lotto.gif)
## Usage
If you want to test the lotto game, you can use the app here.

## By
Developer: OrangeLee

Technical support: [NevioHuang](https://github.com/Ramphastos)


Designer: OrangeLee

## Lotto random of code
 ```Android
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
```
## Tost does not display duplicate code
```Android
public static void showToastOne(Context context,String content){
        if (toast == null){
            toast = Toast.makeText(context,content + "",Toast.LENGTH_SHORT);
        }else {
            toast.setText(content + "");
        }
        toast.show();
    }
```
