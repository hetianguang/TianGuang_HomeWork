package tianguang.tw.mianWork;

/**
 * Created by He on 2016/9/22.
 */
public class printAnimalLocation {
    public static void main(String[] args){
        /*
        * 情况一：当输入的数据格式有问题时会输出：Invalid format
        * */
        String historyData = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 \n" +     //注意 这里故意少输入了一个数据
                "cat2 2 3\n" +
                "dcfa0c7a-5855-4ed2-bc8c-4accae8bd155\n" +
                "2016/09/02 22:31:02\n" +
                "cat1 12 8 3 4";
        String res = GetSnapShot.getSnapShot(historyData,"dcfa0c7a-5855-4ed2-bc8c-4accae8bd155");
        System.out.println("当输入数据格式有问题是，输出效果：");
        System.out.println(res);
         /*
        * 情况二：当输入的数据有问题时会输出：如题目上的例子，将输出Conflict found at dcfa0c7a-5855-4ed2-bc8c-4accae8bd155
        * */
        String historyData1 = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 -1\n" +     //注意 这里故意少输入了一个数据
                "cat2 2 3\n" +
                "dcfa0c7a-5855-4ed2-bc8c-4accae8bd155\n" +
                "2016/09/02 22:31:02\n" +
                "cat1 11 8 3 4";
        String res1 = GetSnapShot.getSnapShot(historyData1,"dcfa0c7a-5855-4ed2-bc8c-4accae8bd155");
        System.out.println("当输入数据有问题是，输出效果：");
        System.out.println(res1);

         /*
        * 情况三：一切正常，当id dcfa0c7a-5855-4ed2-bc8c-4accae8bd155，输出对应时刻的动物坐标快照
        * */
        String historyData2 = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 -1\n" +     //注意 这里故意少输入了一个数据
                "cat2 2 3\n" +
                "dcfa0c7a-5855-4ed2-bc8c-4accae8bd155\n" +
                "2016/09/02 22:31:02\n" +
                "cat1 12 8 3 4";
        String res2 = GetSnapShot.getSnapShot(historyData2,"dcfa0c7a-5855-4ed2-bc8c-4accae8bd155");
        System.out.println("一切正常id dcfa0c7a-5855-4ed2-bc8c-4accae8bd155的时刻动物快照为：");
        System.out.println(res2);
    }
}
