package tianguang.tw.mianWork;

import tianguang.tw.CheckDataFormat.CheckDateFormat;
import tianguang.tw.CheckDataFormat.CheckLocationformat;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by He on 2016/9/22.
 */
public class CheckFormat {
    public static Map<Integer , ArrayList<String>> checkFormat(String history) {
        Map<Integer , ArrayList<String>> dataArray = ConvertArray.convertArray(history);
        for(int i = 0; i < dataArray.size(); i++){
            ArrayList<String> aTimeData = dataArray.get(i);
            if(aTimeData.get(0).split(" ").length != 1){
                return null;
            }
            if(!CheckDateFormat.checkDateForamt(aTimeData.get(1))){
                return null;
            }
            if(!CheckLocationformat.checkLocationFormat(aTimeData)){
                return null;
            }
        }
        return dataArray;
    }
}
