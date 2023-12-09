import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class Exchange_rate {
    public static void show_rate(String input, String output, double count){
        try {
            URL url = new URL("https://v6.exchangerate-api.com/v6/Your-Token/latest/"+input);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;

            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();
            JSONObject jsonObject = new JSONObject(response.toString());
            double outputValue = jsonObject.getJSONObject("conversion_rates").getDouble(output);
            System.out.println(count +" "+ input + " = " + Math.round(outputValue*count * 100.0) / 100.0 + " " + output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
