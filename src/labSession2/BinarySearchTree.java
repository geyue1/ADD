package labSession2;

/**
 * @author yge
 * @create 20221016 18:01:28
 * @description
 */

public class BinarySearchTree {
    public static BSTNode search(BSTNode node,int key){

        if(node.getKey()==key) return node;

        if(node.getKey()>key){
            return search(node.getLeftChild(),key);
        }else{
            return search(node.getRightChild(),key);
        }
    }

    public static BSTNode search(BSTNode node,int key,boolean flag){
        while(node!=null && node.getKey()!=key){
            if(node.getKey()>key){
                node = node.getLeftChild();
            }else{
                node = node.getRightChild();
            }
        }
        return node;
    }

    public static void insert(BSTNode node,int key){
        BSTNode newNode = new BSTNode(key,null,null);
        BSTNode selectedNode = null;
        while(node!=null){
            selectedNode = node;
            if(node.getKey()>key){
                node = node.getLeftChild();
            }else{
                node = node.getRightChild();
            }
        }

        if(selectedNode.getKey()>key){
            selectedNode.setLeftChild(newNode);
        }else{
            selectedNode.setRightChild(newNode);
        }
    }

    public static void delete(BSTNode node,int key){

    }
}

class BSTNode{
    private int key;
    private BSTNode leftChild;
    private BSTNode rightChild;

    public BSTNode(int key, BSTNode leftChild, BSTNode rightChild) {
        this.key = key;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public BSTNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BSTNode leftChild) {
        this.leftChild = leftChild;
    }

    public BSTNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BSTNode rightChild) {
        this.rightChild = rightChild;
    }
}
