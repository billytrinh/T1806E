package weather;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String args[]) throws Exception{
        String url = "https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b6907d289e10d714a6e88b30761fae22";
        URL objUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection)objUrl.openConnection();
        System.out.println("Response code: "+conn.getResponseCode());

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        String response = new String();
        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null){
            response += inputLine;
        }
        //System.out.println(response);
        Object object = JSONValue.parse(response);
        JSONObject jsonObject = (JSONObject)object;
        String city_name = (String)jsonObject.get("name");
        //System.out.println("City: "+city_name);
        JSONObject mainObject = (JSONObject)jsonObject.get("main");
        Double temp = (Double)mainObject.get("temp");
        Double temp_min = (Double)mainObject.get("temp_min");
        Double temp_max = (Double)mainObject.get("temp_max");

        System.out.println(city_name+":"+temp);
        System.out.println("Temp min: "+temp_min+" --- max: "+temp_max);
    }

}
