package tu;

import sun.text.bidi.BidiLine;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class BFS {
    //构建一个图
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

    public static Node searchTarget(String start, String target, Map<String, String[]> map) {
        Node node = new Node(start, null);
        Queue<Node> queue = new LinkedBlockingDeque<>();
        //用于存放已遍历过的节点
        List<String> hasSearchedlist = new ArrayList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            //队头元素出队，接下来将队头节点所有的边入队
            node = queue.poll();
            //已遍历该节点，跳出此次循环
            if (hasSearchedlist.contains(node.id)) {
                continue;
            }
            //已到目标点
            if (target.contains(node.id)) {
                return node;
            }
            System.out.println("处理节点"+node.id);
            hasSearchedlist.add(node.id);

            //将此节点所有边信息入队
            if (map.get(node.id) != null && map.get(node.id).length > 0) {
                for (String child : map.get(node.id))
                    queue.offer(new Node(child,node));
            }
            for (Node node1 : queue)
                System.out.println(node1.id+" "+node1.pre.id);
            System.out.println(queue.isEmpty());
        }
        return null;
    }
    static void printSearPath(Node target) {
        if (target != null) {
            System.out.print("找到了目标节点:" + target.id + "\n");

            List<Node> searchPath = new ArrayList<Node>();
            searchPath.add(target);
            Node node = target.pre;
            while(node!=null) {
                searchPath.add(node);
                node = node.pre;
            }
            String path = "";
            for(int i=searchPath.size()-1;i>=0;i--) {
                path += searchPath.get(i).id;
                if(i!=0) {
                    path += "-->";
                }
            }
            System.out.print("步数最短："+path);
        } else {
            System.out.print("未找到了目标节点");
        }
    }

    //图节点信息，用于记录遍历后的节点
    static class Node {
        String id;
        Node pre;

        Node(String id, Node pre) {
            this.id = id;
            this.pre = pre;
        }
    }

    public static void main(String[] args) {
        Map<String, String[]> map = createBfs();
        for (Map.Entry<String, String[]> entry : map.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
        Node target = searchTarget("Me","Anuj",map);
        System.out.println(target);
        printSearPath(target);
    }
}
