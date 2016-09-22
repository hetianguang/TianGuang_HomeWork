package tianguang.tw.CheckRecordData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * Created by He on 2016/9/22.
 */
public class CheckLocationData {
    public static  String checLocationData(Map<Integer , ArrayList<String>> dataArray){
        int i = 0;
        String animalName = null;
        Map<String , String> data = new HashMap<String , String>();
        while(i < dataArray.size()){
            for(int j = 2; j < dataArray.get(i).size(); j++){
                animalName = dataArray.get(i).get(j).split(" ")[0];
                if(!data.containsKey(animalName)){
                    data.put(animalName,dataArray.get(i).get(j));
                }else if(isOK(data.get(animalName),dataArray.get(i).get(j))){
                    data.put(animalName,dataArray.get(i).get(j));
                }else{
                    return "Conflict found at "+dataArray.get(i).get(0);
                }
            }
            i++;
        }
        return "ok";
    }

    private static boolean isOK(String s, String s1) {
        String[] preTimeLocation = s.split(" ");
        if(preTimeLocation.length == 3){
            return true;
        }
        String[] currentTimeLocation = s1.split(" ");
        Integer tempA = Integer.parseInt(preTimeLocation[1])+Integer.parseInt(preTimeLocation[3]);
        Integer tempB = Integer.parseInt(preTimeLocation[2])+Integer.parseInt(preTimeLocation[4]);
        if(currentTimeLocation[1].equals(tempA.toString()) && currentTimeLocation[2].equals(tempB.toString())){
            return true;
        }
        return false;
    }
}
