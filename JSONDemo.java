import org.json.simple.JSONObject;

/**
 * Example Using JSONObject
 * @author ashish
 */
public class JSONDemo {
    public static void main(String[] args) {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("test",10);
        jsonObject.put("test1",20);
        jsonObject.put("test2",30);
        System.out.println(jsonObject);

    }
}
