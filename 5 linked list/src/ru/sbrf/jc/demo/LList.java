package ru.sbrf.jc.demo;

public class LList {
    Node root = null;

    public void add(Object item){
        Node tempNode = new Node(item);
        Node lastNode = findLast();

        if (lastNode != null){
            lastNode.setNext(tempNode);
        }
        else {
            root = tempNode;
        }
    }

    private Node findLast(){
        if (root == null){
            return null;
        }
        else {
           Node current = root;
           while (current.getNext() != null){
               current = current.getNext();
           }
           return current;
        }
    }

    public Object get(int id){
        if (root == null){
            return null;
        }
        else {
            Node current = root;
            int curId = 0;
            while (curId < id) {
                if (current.getNext() == null) return null;
                current = current.getNext();
                curId++;
            }
            return current.getData();
        }
    }

    public int size(){
        if (root == null){
            return 0;
        }
        else {
            Node current = root;
            int size = 1;
            while (current.getNext() != null){
                current = current.getNext();
                size++;
            }
            return size;
        }
    }
}

class Node{
    private Object data;
    private Node next = null;

    public Node(Object data){
        this.data = data;
    }

    public Object getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
