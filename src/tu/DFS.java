package tu;

import java.util.HashMap;
import java.util.Map;

public class DFS {
    public static Map createBfs() {
        Map<String, String[]> map = new HashMap<>();
        map.put("Me", new String[]{"Bob", "Clarire", "Alice"});
        map.put("Clarire", new String[]{"Thom", "Jonny", "Me"});
        map.put("Thom", new String[]{"Clarire"});
        map.put("Jonny", new String[]{"Clarire"});
        map.put("Alice", new String[]{"Peggy", "Me"});
        map.put("Peggy", new String[]{"Alice", "Bod"});
        map.put("Bod", new String[]{"Anuj", "Peggy", "Me"});
        map.put("Anuj", new String[]{"Bob"});
        return map;
    }


    public static void dfs(boolean[] isVisited, String key){

    }

    static class Node{
        String id;
        Node pre;
    }
}
