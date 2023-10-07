package Pb_116_PopulatingNextRightPointersInEachNode;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Queue<MyPair> nodes = new LinkedList<>();
        int k = 0;
        nodes.add(new MyPair(root, k));
        ArrayList <MyPair> pairList = new ArrayList<>();

        while (!nodes.isEmpty()) {

            MyPair pair = nodes.remove();
            pairList.add(pair);

            if (pair.node.left != null) {
                nodes.add(new MyPair(pair.node.left, pair.level + 1));
            }

            if (pair.node.right != null) {
                nodes.add(new MyPair(pair.node.right, pair.level + 1));
            }

        }
        for (int i = 0; i < pairList.size() - 1; i++){
            System.out.println(pairList.get(i).node.val + " " + pairList.get(i).level);
            if (pairList.get(i).level == pairList.get(i+1).level){
                pairList.get(i).node.next = pairList.get(i+1).node;
            }
        }

        return root;
    }
}
class MyPair {
    public Node node;
    public int level;
    public MyPair (Node node , int level){
        this.node = node;
        this.level = level;
    }
}
Console
