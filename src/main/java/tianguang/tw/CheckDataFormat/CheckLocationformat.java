package tianguang.tw.CheckDataFormat;

import java.util.ArrayList;

/**
 * Created by He on 2016/9/22.
 */
public class CheckLocationformat {

    public static boolean checkLocationFormat(ArrayList<String> aTimeData) {
        for(int i = 2; i< aTimeData.size(); i++){
            if(aTimeData.get(i).split(" ").length == 3 || aTimeData.get(i).split(" ").length == 5){
                return true;
            }
            return false;
        }
        return false;
    }
}
