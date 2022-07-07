package triquenguyen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class tempJSON {

    public double getTemp(String url) throws ParseException {
        double temp = 0;

        StringBuilder builder = new StringBuilder();

        try {
            URL readURL = new URL(url);
            BufferedReader br = new BufferedReader(new InputStreamReader(readURL.openStream()));

            String str = "";
            while (null != (str = br.readLine())) {
                builder.append(str + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        JSONParser jsonParser = new JSONParser();

        Object obj = jsonParser.parse(builder.toString());
        JSONObject jsonObject = (JSONObject)obj;
        JSONObject main = (JSONObject)jsonObject.get("main");

        double tempK = (double) main.get("temp");
        temp = (double) ((tempK - 273.15) * 9/5 + 32);

        return temp;
    }
}
