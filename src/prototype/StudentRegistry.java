package prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry { // --> Ideally, should be singleton
    private Map<String, Student> map = new HashMap<>();

    public void register(String key, Student prototype) {
        map.put(key, prototype);
    }

    public Student get(String key) {
        return map.get(key);
    }

    // TODO: Add a remove method
}
