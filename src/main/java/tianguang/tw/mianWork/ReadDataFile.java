package tianguang.tw.mianWork;

import tianguang.tw.entity.ATimeData;
import tianguang.tw.entity.HistoryData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by He on 2016/9/21.
 */
public class ReadDataFile {
    public int  inputData(String filePath){
        FileReader reader = null;
        BufferedReader br = null;
        String tempString = null;
        try {
            reader = new FileReader(filePath);
            br = new BufferedReader(reader);
            ArrayList<String> array = null;
            Map<String , ArrayList<String>> data = new HashMap<String , ArrayList<String>>();
            while ((tempString = br.readLine()) != null ) {
                String[] s = tempString.split(" ");
                if (s.length == 1) {
                    if (array != null) {
                        data.put(array.get(0), array);
                    }
                    array = new ArrayList<String>();
                }
                array.add(tempString);
            }
            if(array != null){
                data.put(array.get(0), array);
            }
           // System.out.println(this.getClass().getResource(".").getPath());
            reader.close();
            return data.size();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
