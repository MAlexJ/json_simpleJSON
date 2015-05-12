package task_03_parseJSON_Use_JSONParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by Alex on 05.05.2015.
 */
public class TestMainJSON {
    public static void main(String[] args) throws ParseException {
        JSONParser parser=new JSONParser();

        System.out.println("=======decode=======");

        // [0 , { "1": [5,{"6": 7 }] } ]
        String s="[0,{\"1\":[5,{\"6\":7}]}]";
        Object obj=parser.parse(s);
        JSONArray array=(JSONArray)obj;
        System.out.println("======the 2nd element of array======");
        System.out.println(array.get(1));
        System.out.println();

        JSONObject obj2=(JSONObject)array.get(1);
        System.out.println("======field \"1\"==========");
        System.out.println(obj2.get("1"));


        s="{}";
        obj=parser.parse(s);
        System.out.println(obj);

        s="[5,]";
        obj=parser.parse(s);
        System.out.println(obj);

        s="[5,,2]";
        obj=parser.parse(s);
        System.out.println(obj);
    }
}
