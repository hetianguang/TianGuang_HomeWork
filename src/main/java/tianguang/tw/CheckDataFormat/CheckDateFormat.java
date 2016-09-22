package tianguang.tw.CheckDataFormat;

/**
 * Created by He on 2016/9/22.
 */
public class CheckDateFormat {
    public static boolean checkDateForamt(String s) {
        String[] date = s.split(" ");
        if(date.length != 2){
            return false;
        }

        if(date[0].split("/").length != 3){
            return false;
        }
        if(date[1].split(":").length != 3){
            return false;
        }
        return true;
    }
}
