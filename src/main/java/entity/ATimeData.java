package entity;

import java.util.ArrayList;

/**
 * Created by He on 2016/9/21.
 */
public class ATimeData {
    private String timeId;
    private String time;
    private ArrayList<String> location = new ArrayList<String>();

    public String getTimeId() {
        return timeId;
    }

    public void setTimeId(String timeId) {
        this.timeId = timeId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<String> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public String getPreTimeId() {
        return preTimeId;
    }

    public void setPreTimeId(String preTimeId) {
        this.preTimeId = preTimeId;
    }

    private String preTimeId;
}
