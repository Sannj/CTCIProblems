package ctci.StacksQueues;


import java.util.EmptyStackException;

/**
 * Created by sanjanabadam on 2/3/17.
 */
public class CustomStack<T> {
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop(){
        if(top==null){
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T data){
        if(top==null){
            throw new EmptyStackException();
        }
        StackNode<T> tempNode = new StackNode<T>(data);
        tempNode.next = top;
        top = tempNode;
    }

    public T peek(){
        if(top==null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty(){
        if(top==null){
            return true;
        }
        else
            return false;
    }

}
