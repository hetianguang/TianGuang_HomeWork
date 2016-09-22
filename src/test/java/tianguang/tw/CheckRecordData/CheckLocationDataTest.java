package tianguang.tw.CheckRecordData;

import org.junit.Test;
import tianguang.tw.mianWork.ConvertArray;

import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by He on 2016/9/22.
 */
public class CheckLocationDataTest {

    @Test
    public void should_return_false_when_input_historyData_is_false () {
        //given
        String historyData = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 -1\n" +
                "cat2 2 3\n" +
                "dcfa0c7a-5855-4ed2-bc8c-4accae8bd155\n" +
                "2016/09/02 22:31:02\n" +
                "cat1 11 8 3 4";

        //when
        Map<Integer , ArrayList<String>> dataArray = ConvertArray.convertArray(historyData);
        String res =  CheckLocationData.checLocationData(dataArray);

        //then
        assertThat(res,is("Conflict found at dcfa0c7a-5855-4ed2-bc8c-4accae8bd155"));
    }

    @Test
    public void should_return_false_when_input_historyData_also_is_false () {
        //given
        String historyData = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 1\n" +
                "cat2 2 3\n" +
                "dcfa0c7a-5855-4ed2-bc8c-4accae8bd155\n" +
                "2016/09/02 22:31:02\n" +
                "cat1 11 8 3 4";

        //when
        Map<Integer , ArrayList<String>> dataArray = ConvertArray.convertArray(historyData);
        String res =  CheckLocationData.checLocationData(dataArray);

        //then
        assertThat(res,is("Conflict found at dcfa0c7a-5855-4ed2-bc8c-4accae8bd155"));
    }

    @Test
    public void should_return_true_when_input_historyData_is_ok () {
        //given
        String historyData = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 -1\n" +
                "cat2 2 3\n" +
                "dcfa0c7a-5855-4ed2-bc8c-4accae8bd155\n" +
                "2016/09/02 22:31:02\n" +
                "cat1 12 8 3 4";

        //when
        Map<Integer , ArrayList<String>> dataArray = ConvertArray.convertArray(historyData);
        String res =  CheckLocationData.checLocationData(dataArray);

        //then
        assertThat(res,is("ok"));
    }
}