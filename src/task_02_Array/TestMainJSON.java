package task_02_Array;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class TestMainJSON {
    public static void main(String[] args) {

        JSONArray ar = new JSONArray();
        JSONObject obj = new JSONObject();
        JSONObject resultJson = new JSONObject();


        ar.add("first");
        ar.add(new Integer(100));
        ar.add(new Double(100));

        obj.put("one", "two");
        obj.put("three", "four");
        obj.put("three1", 11);

        resultJson.put("paramsArray", ar);
        resultJson.put("paramsObj", obj);
        resultJson.put("paramsStr", "some string");

        System.out.println(ar.toString());
        System.out.println(obj.toString());
        System.out.println(resultJson.toString());

    }

}
