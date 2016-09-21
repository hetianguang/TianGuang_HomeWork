package tianguang.tw.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by He on 2016/9/21.
 */
public class HistoryData {
    private int totalAnimal;
    public static Map<String , ATimeData> commodityInfomap = new HashMap<String , ATimeData>();

    public int getTotalAnimal() {
        return totalAnimal;
    }

    public void setTotalAnimal(int totalAnimal) {
        this.totalAnimal = totalAnimal;
    }
}
