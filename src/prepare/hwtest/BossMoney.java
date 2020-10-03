package prepare.hwtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class BossMoney {
    private static class Node {
        int id;
        int pId;        //pId指向上一个节点
        int count;
        Node preNode;

        public int getId() {
            return id;
        }

        public int getpId() {
            return pId;
        }

        public int getCount() {
            return count;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setpId(int pId) {
            this.pId = pId;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public Node(int id, int pId, int count) {
            this.id = id;
            this.pId = pId;
            this.count = count;
            preNode = null;
        }

        public Node(int id) {
            this.id = id;
            pId = id;
            count = 0;
            preNode = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "id=" + id +
                    ", pId=" + pId +
                    ", count=" + count +
                    ", preNode=" + preNode +
                    '}';
        }
    }

    static void createTree(ArrayList<Node> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i).pId == list.get(j).id) {
                    list.get(i).preNode = list.get(j);
                } else if (list.get(j).pId == list.get(i).id) {
                    list.get(j).preNode = list.get(i);
                } else continue;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Node> list = new ArrayList<>();
        list.add(new Node(1, 0, 300));
        list.add(new Node(2, 1, 200));
        list.add(new Node(3, 1, 300));
        list.add(new Node(4, 0, 300));
        list.add(new Node(5, 4, 500));
        TreeSet<Integer> set = new TreeSet<>();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Node node = (Node) iterator.next();
            set.add(node.pId);
        }
        list.add(new Node(set.first()));
        System.out.println(set.first());
        createTree(list);
        for (Node node : list) {
            if (node.preNode != null) {
                int count = (node.count / 100) * 15;
                node.preNode.count += count;
            }
        }
        for (Node node : list) {
            System.out.println(node.id + " " + node.count);
        }
        System.out.println(set.first() + " " + list.get(list.size() - 1).count);
    }
}
