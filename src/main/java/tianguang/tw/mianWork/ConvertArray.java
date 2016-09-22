package tianguang.tw.mianWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by He on 2016/9/21.
 */
public class ConvertArray {
    public static Map<Integer , ArrayList<String>> convertArray(String historyData) {
        String[] s = historyData.split("\n");
        ArrayList<String> array = null;
        int timeSeq = 0;
        Map<Integer , ArrayList<String>> data = new HashMap<Integer , ArrayList<String>>();
        String temp = null;
        for(int i = 0; i < s.length; i++){
            if(s[i].split(" ").length == 1){
                if(array != null){
                    data.put(timeSeq,array);
                    timeSeq++;
                }
                array = new ArrayList<String>();
            }
            array.add(s[i]);
        }
        data.put(timeSeq,array);
        return data;
    }
}
