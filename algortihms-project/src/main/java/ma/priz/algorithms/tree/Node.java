package ma.priz.algorithms.tree;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class Node {

    private int value;
    private Node left;
    private Node right;

    public Node find(int val){

        Queue<Node> queue =new ArrayDeque<>();
        queue.add(this);
        Node currentNode = null;

        while(!queue.isEmpty()){
            currentNode = queue.poll();
            if(currentNode.value == val){
                return currentNode;
            }
            if(queue.isEmpty()){
                break;
            }

            if(Objects.nonNull(currentNode.left)){
                queue.add(currentNode.left);
            }
            if(Objects.nonNull(currentNode.right)){
                queue.add(currentNode.right);
            }

        }
        return currentNode;
    }

}
