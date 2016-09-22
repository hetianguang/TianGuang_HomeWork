package tianguang.tw.CheckDataFormat;

import org.junit.Test;
import tianguang.tw.mianWork.ConvertArray;

import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by He on 2016/9/22.
 */
public class CheckLocationformatTest {

    @Test
    public void should_return_false_when_the_location_record_format_is_false (){
        //given
        String data = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9 0";

        //when
        Map<Integer , ArrayList<String>> dataArray = ConvertArray.convertArray(data);
        boolean res = CheckLocationformat.checkLocationFormat(dataArray.get(0));

        //then
        assertThat(res,is(false));
    }

    @Test
    public void should_return_false_when_the_location_record_format_also_is_false (){
        //given
        String data = "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 -1 3\n" +
                "cat2 2 3";

        //when
        Map<Integer , ArrayList<String>> dataArray = ConvertArray.convertArray(data);
        boolean res = CheckLocationformat.checkLocationFormat(dataArray.get(0));

        //then
        assertThat(res,is(false));
    }

    public void should_return_true_when_the_location_record_format_is_true (){
        //given
        String data = "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 -1\n" +
                "cat2 2 3";

        //when
        Map<Integer , ArrayList<String>> dataArray = ConvertArray.convertArray(data);
        boolean res = CheckLocationformat.checkLocationFormat(dataArray.get(0));

        //then
        assertThat(res,is(true));
    }
}