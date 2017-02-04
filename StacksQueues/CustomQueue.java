package ctci.StacksQueues;

import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Created by sanjanabadam on 2/3/17.
 */
public class CustomQueue<T> {
    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;


    public T pop(){
        if(first == null){
            throw new NoSuchElementException();
        }
        T t = first.data;
        first = first.next;
        if(first == null){
            last = null;
        }
        return t;
    }

    public void push(T data){
        QueueNode<T> current = last;
        last = new QueueNode<>(data);
        //last.ele = ele;

        if (first == null) first = last;
        else current.next = last;

    }

    public T peek(){
        if(first == null){
            throw new NoSuchElementException();
        }
        return first.data;

    }

    public boolean isEmpty(){
         return first==null;
    }
}
