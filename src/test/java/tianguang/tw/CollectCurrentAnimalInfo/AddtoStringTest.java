package tianguang.tw.CollectCurrentAnimalInfo;

import org.junit.Test;
import tianguang.tw.CheckRecordData.CheckLocationData;
import tianguang.tw.mianWork.ConvertArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by He on 2016/9/23.
 */
public class AddtoStringTest {

    private Map<String,String> data = new HashMap<String , String>();
    @Test
    public void should_return_a_10_when_input_a_group_animal_location_data () {
        //given
        String s ="cat1 10 9";
        data.put("cat1",s);

        //when
        String res = AddtoString.addToString(data);
        String result = res.split(" ")[1]; //  得到的是cat2动物的X坐标


        //then
        assertThat(result,is("10"));
    }

    @Test
    public void should_return_a_14_when_input_two_group_animal_location_data () {
        //given
        String s ="cat1 10 9\n" +
                "cat2 11 8 3 4";
        data.put("cat1",s.split("\n")[0]);
        data.put("cat2",s.split("\n")[1]);

        //when
        String res = AddtoString.addToString(data);
        String result = res.split("\n")[1].split(" ")[1]; //  得到的是cat2动物的X坐标


        //then
        assertThat(result,is("14"));
    }

}