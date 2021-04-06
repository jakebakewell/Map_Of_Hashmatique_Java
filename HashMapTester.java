import java.util.HashMap;
import java.util.Set;

public class HashMapTester {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Love Song", "Lovey Dovey Lyrics");
        trackList.put("Sad Song", "Sad Lyrics");
        trackList.put("EDM Song", "OIHDOIAIJOWDIJWOIWJ");
        trackList.put("Sad Love Song", "Sad Lovey Dovey Lyrics");
        String song = trackList.get("EDM Song");
        System.out.println(song);
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}
