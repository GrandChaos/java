package ru.sbrf.jc.demo;

public class LList<T> {
    Node<T>root = null;

    public void add(T item){
        Node<T> tempNode = new Node<>(item);
        Node<T> lastNode = findLast();

        if (lastNode!= null){
            lastNode.setNext(tempNode);
        }
        else {
            root = tempNode;
        }
    }

    private Node<T> findLast(){
        if (root == null){
            return null;
        }
        else {
           Node<T>current = root;
           while (current.getNext() != null){
               current = current.getNext();
           }
           return current;
        }
    }

    public T get(int id) throws LListException{
        if (id < 0) throw new LListException("Index Cannot Be Less Than 0");
        else if (root == null) throw new LListException("List Is Empty");
        else {
            Node<T> current = root;
            int curId = 0;
            while (curId < id) {
                if (current.getNext() == null) throw new LListException("Index " + id + " Out Of Range " + size());
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
            Node<T>current = root;
            int size = 1;
            while (current.getNext() != null){
                current = current.getNext();
                size++;
            }
            return size;
        }
    }
}

class LListException extends RuntimeException {

    public LListException(String message){
        super(message);
    }
}

class Node<T> {
    private T data;
    private Node<T> next = null;

    public Node(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public Node<T> getNext(){
        return next;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }
}
