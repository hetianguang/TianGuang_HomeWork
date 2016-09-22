package tianguang.tw.CollectCurrentAnimalInfo;

import java.util.Map;

/**
 * Created by He on 2016/9/23.
 */
public class AddtoString {
    public static String addToString(Map<String, String> data) {
        String animal = "cat1";
        String animalLocation = null;
        String result = "";
        Integer s = 1;
        while((animalLocation=data.get(animal)) != null){
            String[] temp = animalLocation.split(" ");
            if(temp.length == 3){
                result += animalLocation+"\n";
            }
            else{
                Integer X = Integer.parseInt(temp[1])+Integer.parseInt(temp[3]);
                Integer Y = Integer.parseInt(temp[2])+Integer.parseInt(temp[4]);
                String location = temp[0]+" " + X.toString()+" " + Y.toString();
                result += location+"\n";
            }
            s++;
            animal = "cat"+ s.toString();
        }
        return result;
    }
}
