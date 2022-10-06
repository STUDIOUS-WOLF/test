package dsa;
public class Node {
    int data;
    Node left;
    Node right;
    Node( int data){
        this.data=data;
        left=null;
        right=null;
    }
    /*public void insert(Node node,int data){
        if(node.data<data){
            if(node.left != null){
                insert(node.left,data);
            }
        else{
            node.left=new Node(data);
        }
    }
    else{
        if(node.right!=null){
            insert(node.right,data);
        }
        else{
            node.right=new Node(data);
        }
    }*/
    }

