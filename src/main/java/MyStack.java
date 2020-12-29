import java.util.EmptyStackException;

public class MyStack<T> {
    private static class MyStackNode<T> {
        private T data;
        private MyStackNode<T> next;

        public MyStackNode(T data) {
            this.data = data;
        }
    }
    private MyStackNode<T> top;

    public T pop() {
        if(top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        MyStackNode<T> newNode = new MyStackNode<T>(item);
        newNode.next = top;
        top = newNode;
    }

    public T peek() {
        if(top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
