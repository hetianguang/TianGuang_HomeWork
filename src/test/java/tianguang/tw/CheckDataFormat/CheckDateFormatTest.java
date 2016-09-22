package tianguang.tw.CheckDataFormat;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by He on 2016/9/22.
 */
public class CheckDateFormatTest {

    @Test
    public void should_return_false_when_the_date_format_is_false (){
        //given
        String date = "2016/09/02 22:30";

        //when
       boolean res = CheckDateFormat.checkDateForamt(date);

        //then
        assertThat(res,is(false));
    }

    @Test
    public void should_return_false_when_the_date_format_also_is_false (){
        //given
        String date = "2016/09 22:30:46";

        //when
        boolean res = CheckDateFormat.checkDateForamt(date);

        //then
        assertThat(res,is(false));
    }

    @Test
    public void should_return_true_when_the_date_format_is_true (){
        //given
        String date = "2016/09/02 22:30:46";

        //when
        boolean res = CheckDateFormat.checkDateForamt(date);

        //then
        assertThat(res,is(true));
    }

}