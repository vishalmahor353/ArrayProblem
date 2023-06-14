package LiveProject;;
import org.json.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
public class JsonProject {
//    public static void classify ();

    public static void main(String[] args){

        JSONParser jsonp = new JSONParser();
        try (FileReader reader = new FileReader("Task-1.json")){

//            Object obj = jsonp.parse(reader);
//            reader.read()
//            org.json.JSONArray dataList = (org.json.JSONArray) obj;

            org.json.JSONArray dataList=new org.json.JSONArray("[\n" +
                    "  {\n" +
                    "    \"BlockType\": \"QUERY\",\n" +
                    "    \"Id\": \"696a2f5d-ce39-4cb7-b92f-b99bb1c3a09c\",\n" +
                    "    \"Relationships\": [\n" +
                    "      {\n" +
                    "        \"Type\": \"ANSWER\",\n" +
                    "        \"Ids\": [\n" +
                    "          \"cf476e0a-af8a-4794-b395-c4408189a56b\"\n" +
                    "        ]\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"Page\": 1,\n" +
                    "    \"Query\": {\n" +
                    "      \"Text\": \"What is name?\",\n" +
                    "      \"Alias\": \"name\"\n" +
                    "    }\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"BlockType\": \"QUERY_RESULT\",\n" +
                    "    \"Confidence\": 95,\n" +
                    "    \"Text\": \"FRANK STEPHEN\",\n" +
                    "    \"Geometry\": {\n" +
                    "      \"BoundingBox\": {\n" +
                    "        \"Width\": 0.2542884051799774,\n" +
                    "        \"Height\": 0.026875000447034836,\n" +
                    "        \"Left\": 0.3782786428928375,\n" +
                    "        \"Top\": 0.47550275921821594\n" +
                    "      },\n" +
                    "      \"Polygon\": [\n" +
                    "        {\n" +
                    "          \"X\": 0.3782786428928375,\n" +
                    "          \"Y\": 0.48398569226264954\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"X\": 0.6314184665679932,\n" +
                    "          \"Y\": 0.47550275921821594\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"X\": 0.6325670480728149,\n" +
                    "          \"Y\": 0.4940132796764374\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"X\": 0.379377543926239,\n" +
                    "          \"Y\": 0.5023777484893799\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    \"Id\": \"cf476e0a-af8a-4794-b395-c4408189a56b\",\n" +
                    "    \"Page\": 1\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"BlockType\": \"QUERY\",\n" +
                    "    \"Id\": \"59fb3079-5e7c-47fb-9a87-761237b92ebb\",\n" +
                    "    \"Relationships\": [\n" +
                    "      {\n" +
                    "        \"Type\": \"ANSWER\",\n" +
                    "        \"Ids\": [\n" +
                    "          \"8347c2f5-8659-441e-a817-66336b3cb937\"\n" +
                    "        ]\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"Page\": 1,\n" +
                    "    \"Query\": {\n" +
                    "      \"Text\": \"What is DOB?\",\n" +
                    "      \"Alias\": \"dateOfBirth\"\n" +
                    "    }\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"BlockType\": \"QUERY_RESULT\",\n" +
                    "    \"Confidence\": 99,\n" +
                    "    \"Text\": \"03/25/1965\",\n" +
                    "    \"Geometry\": {\n" +
                    "      \"BoundingBox\": {\n" +
                    "        \"Width\": 0.1717364341020584,\n" +
                    "        \"Height\": 0.026476509869098663,\n" +
                    "        \"Left\": 0.39854878187179565,\n" +
                    "        \"Top\": 0.5437572598457336\n" +
                    "      },\n" +
                    "      \"Polygon\": [\n" +
                    "        {\n" +
                    "          \"X\": 0.39854878187179565,\n" +
                    "          \"Y\": 0.5491799116134644\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"X\": 0.5689859390258789,\n" +
                    "          \"Y\": 0.5437572598457336\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"X\": 0.5702852010726929,\n" +
                    "          \"Y\": 0.5649024248123169\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"X\": 0.3998098373413086,\n" +
                    "          \"Y\": 0.5702337622642517\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    \"Id\": \"8347c2f5-8659-441e-a817-66336b3cb937\",\n" +
                    "    \"Page\": 1\n" +
                    "  }\n" +
                    "]");

            org.json.JSONArray resultList = new org.json.JSONArray();
            for(int i = 0; i<dataList.length();i++) {
                JSONObject jsonObject = dataList.getJSONObject(i);
                if (jsonObject.has("Query")) {
                    JSONObject result = jsonObject.getJSONObject("Query");
                    if (jsonObject.has("Relationships") && jsonObject.getJSONArray("Relationships").length() > 0) {
                        JSONObject relationshipObject = jsonObject.getJSONArray("Relationships").getJSONObject(0);
                        if (relationshipObject.has("Ids") && relationshipObject.getJSONArray("Ids").length() > 0) {
                            result.put("answerKey", relationshipObject.getJSONArray("Ids").get(0));
                            for (int j = 0; j<dataList.length();j++){
                                JSONObject answerObj = dataList.getJSONObject(j);
                                if (answerObj.getString("Id").equals(result.getString("answerKey"))){
                                    result.put("answer",answerObj.getString("Text"));
                                    resultList.put(result);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(resultList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
