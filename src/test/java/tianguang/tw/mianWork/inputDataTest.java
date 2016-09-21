package tianguang.tw.mianWork;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by He on 2016/9/22.
 */
public class inputDataTest {
    @Test
    public void the_content_of_file_read_return_is_3_when_have_three_time_record (){
        //Given
        String path = this.getClass().getResource(".").getPath()+"//testData.txt";

        //when
        ReadDataFile readDataFile =  new ReadDataFile();
        int res = readDataFile.inputData(path);

        assertThat(res, is(3));
    }
    @Test
    public void the_content_of_file_read_return_is_4_when_have_four_time_record (){
        //Given
        String path = this.getClass().getResource(".").getPath()+"//testData1.txt";

        //when
        ReadDataFile readDataFile =  new ReadDataFile();
        int res = readDataFile.inputData(path);

        assertThat(res, is(4));
    }

}