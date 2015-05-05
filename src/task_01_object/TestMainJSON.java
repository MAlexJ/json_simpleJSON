package task_01_object;

import org.json.simple.JSONObject;

public class TestMainJSON {


    public static void main(String[] args) {

        JSONObject resultJson = new JSONObject();

        resultJson.put("name","foo");
        resultJson.put("num",new Integer(100));
        resultJson.put("is_vip",new Boolean(true));
        resultJson.put("nickname",null);
        System.out.print(resultJson.toString());


    }




}
