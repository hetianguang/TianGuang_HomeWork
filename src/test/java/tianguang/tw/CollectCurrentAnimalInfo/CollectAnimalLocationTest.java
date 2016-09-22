package tianguang.tw.CollectCurrentAnimalInfo;

import org.junit.Test;
import tianguang.tw.mianWork.CheckFormat;

import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by He on 2016/9/22.
 */
public class CollectAnimalLocationTest {

    @Test
    public void should_return_1_when_want_to_get_id_is_e4e87cb2_8e9a_4749_abb6_26c59344dfee () {
        //given
        String history = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 -1\n" +
                "cat2 2 3";

        //when
        Map<Integer , ArrayList<String>> data = CheckFormat.checkFormat(history);
        String res = CollectAnimalLocation.collectAnimalLocation(data,"e4e87cb2-8e9a-4749-abb6-26c59344dfee");

        //then
        assertThat(res.split("\n").length,is(1));

    }

    @Test
    public void should_return_2_when_want_to_get_id_is_351055db_33e6_4f9b_bfe1_16f1ac446ac1 () {
        //given
        String history = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 -1\n" +
                "cat2 2 3";

        //when
        Map<Integer , ArrayList<String>> data = CheckFormat.checkFormat(history);
        String res = CollectAnimalLocation.collectAnimalLocation(data,"351055db-33e6-4f9b-bfe1-16f1ac446ac1");

        //then
        assertThat(res.split("\n").length,is(2));

    }

}