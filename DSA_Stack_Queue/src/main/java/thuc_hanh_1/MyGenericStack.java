package thuc_hanh_1;

import java.util.EmptyStackException;
import java.util.LinkedList;

import static sun.util.locale.LocaleUtils.isEmpty;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }


    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }
}


