package tianguang.tw.mianWork;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by He on 2016/9/22.
 */
public class ConvertArrayTest {

    @Test
    public void should_get_a_time_animal_locaton_in_ATimeData_when_input_a_data () {
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
        Map<Integer , ArrayList<String>> res = ConvertArray.convertArray(historyData);

        //then
        assertThat(res.size(), is(3));
    }

}