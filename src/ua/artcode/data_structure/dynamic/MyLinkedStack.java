package ua.artcode.data_structure.dynamic;

/**
 * Created by tos on 4/11/16.
 */
import ua.artcode.data_structure.common.MyStack;
import ua.artcode.utils.ds.NodeUtils;

public class MyLinkedStack implements MyStack {

    private Node top;

    @Override
    public void push(Object obj) {
        if (top == null) {
            top = new Node(obj, null);
        } else {
            Node newNode = new Node(obj, top);
            top = newNode;
        }

        // above code could be replaced by top = new Node(obj,top)
    }

    @Override
    public Object pop() {

        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }

        Object forRet = top.val;
        top = top.next;
        return forRet;
    }

    @Override
    public String toString() {
        return "MyLinkedStack{\n" +
                "top=" + NodeUtils.toStringR(top).replaceAll("->", "\n") +
                '}';
    }
}