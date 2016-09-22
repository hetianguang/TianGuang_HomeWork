package tianguang.tw.CollectCurrentAnimalInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by He on 2016/9/22.
 */
public class CollectAnimalLocation {
    public static String collectAnimalLocation(Map<Integer , ArrayList<String>> dataArray, String id) {

        int i = 0;
        String animalName = null;
        Map<String , String> data = new HashMap<String , String>();
        while(i < dataArray.size()){
            for(int j = 2; j < dataArray.get(i).size(); j++){
                animalName = dataArray.get(i).get(j).split(" ")[0];
                data.put(animalName,dataArray.get(i).get(j));
            }
            if(dataArray.get(i).get(0).equals(id)){
                break;
            }
            i++;
        }
        return AddtoString.addToString(data);

    }

}
