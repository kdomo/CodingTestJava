/**
* 메모리: 18428 KB, 시간: 284 ms
* 2022.08.05
* by Alub
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
public static void main(String[] args){
    Date nowDate = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String strNowDate = simpleDateFormat.format(nowDate);
    System.out.println(strNowDate);
}
}