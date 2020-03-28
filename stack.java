package com.datastructure.stack;

import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(10);
        stack.push(30);

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        StackImpl nums = new StackImpl();
        nums.push(15);
        nums.push(8);
        nums.push(10);

        System.out.println(nums.pop());
        System.out.println(nums.peek());
    }
}

class StackImpl {
    int stack[] = new int[5];
    int top = 0;
    public void push(int data) {
        stack[top]=data;
        top++;
    }
    public int pop() {
        stack[top]=0;
        top--;
        return stack[top];
    }

    public int peek() {
        return stack[top-1];
    }
    public void show() {
        for(int n: stack) {
            System.out.println(n + " ");
        }
    }
}
