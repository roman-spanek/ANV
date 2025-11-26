package cleancode.ReinventingTheWheel;

import java.util.HashMap;
import java.util.Map;

public class CustomJsonParser {

    public Map<String, String> parse(String json) {
        Map<String, String> result = new HashMap<>();
        json = json.replace("{", "").replace("}", "");
        String[] pairs = json.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            result.put(keyValue[0].trim(), keyValue[1].trim());
        }
        return result;
    }
}