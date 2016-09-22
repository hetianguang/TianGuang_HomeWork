package tianguang.tw.mianWork;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;


/**
 * Created by He on 2016/9/22.
 */
public class CheckFormatTest {

    @Test
    public void should_return_false_when_the_record_format_is_false () {
        //given
        boolean result = false;
        String history = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:41\n" +
                "cat1 10 9 7";

        //when
        Map<Integer , ArrayList<String>> res = CheckFormat.checkFormat(history);
        if(res != null)
            result = true;

        //then
        assertThat(result,is(false));

    }

    @Test
    public void should_return_false_when_the_record_format_also_is_false () {
        //given
        boolean result = false;
        String history = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30\n" +
                "cat1 10 9";

        //when
        Map<Integer , ArrayList<String>> res = CheckFormat.checkFormat(history);
        if(res != null)
            result = true;

        //then
        assertThat(result,is(false));

    }

    @Test
    public void should_return_true_when_the_record_format_is_ok () {
        //given
        boolean result = false;
        String history = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9";

        //when
        Map<Integer , ArrayList<String>> res = CheckFormat.checkFormat(history);
        if(res != null){
            result = true;
        }


        //then
        assertThat(result,is(true));

    }

}