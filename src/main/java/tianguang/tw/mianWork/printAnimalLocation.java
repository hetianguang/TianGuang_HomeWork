package tianguang.tw.mianWork;

/**
 * Created by He on 2016/9/22.
 */
public class printAnimalLocation {
    public static void main(String[] args){
        /*
        * Case 1：When there is a problem with the input data format, the output effect:：Invalid format
        * */
        String historyData = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 \n" +     //here format error
                "cat2 2 3\n" +
                "dcfa0c7a-5855-4ed2-bc8c-4accae8bd155\n" +
                "2016/09/02 22:31:02\n" +
                "cat1 12 8 3 4";
        String res = GetSnapShot.getSnapShot(historyData,"dcfa0c7a-5855-4ed2-bc8c-4accae8bd155");
        System.out.println("When there is a problem with the input data format, the output effect:");
        System.out.println(res);
         /*
        * Case 2：When the input data conflicts：the output : Conflict found at dcfa0c7a-5855-4ed2-bc8c-4accae8bd155
        * */
        String historyData1 = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 -1\n" +
                "cat2 2 3\n" +
                "dcfa0c7a-5855-4ed2-bc8c-4accae8bd155\n" +
                "2016/09/02 22:31:02\n" +
                "cat1 11 8 3 4";    // here the data conflict;
        String res1 = GetSnapShot.getSnapShot(historyData1,"dcfa0c7a-5855-4ed2-bc8c-4accae8bd155");
        System.out.println("When the input data conflicts：the output:");
        System.out.println(res1);

         /*
        * Case 3：All is OK ,the result is the id :dcfa0c7a-5855-4ed2-bc8c-4accae8bd155
        * */
        String historyData2 = "e4e87cb2-8e9a-4749-abb6-26c59344dfee\n" +
                "2016/09/02 22:30:46\n" +
                "cat1 10 9\n" +
                "351055db-33e6-4f9b-bfe1-16f1ac446ac1\n" +
                "2016/09/02 22:30:52\n" +
                "cat1 10 9 2 -1\n" +
                "cat2 2 3\n" +
                "dcfa0c7a-5855-4ed2-bc8c-4accae8bd155\n" +
                "2016/09/02 22:31:02\n" +
                "cat1 12 8 3 4";
        String res2 = GetSnapShot.getSnapShot(historyData2,"dcfa0c7a-5855-4ed2-bc8c-4accae8bd155");
        System.out.println("Current moment,the animals location :");
        System.out.println(res2);
    }
}
