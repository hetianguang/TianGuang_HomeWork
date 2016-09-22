package tianguang.tw.mianWork;

import tianguang.tw.CheckRecordData.CheckLocationData;
import tianguang.tw.CollectCurrentAnimalInfo.CollectAnimalLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by He on 2016/9/22.
 */
public class GetSnapShot {
    public  static String getSnapShot(String historyData, String id){
        Map<Integer , ArrayList<String>> dataArray = CheckFormat.checkFormat(historyData);
        if(dataArray == null){
            return "Invalid format";
        }
        if(!CheckLocationData.checLocationData(dataArray).equals("ok")){
            return CheckLocationData.checLocationData(dataArray);
        }
        return CollectAnimalLocation.collectAnimalLocation(dataArray,id);
    }


}
