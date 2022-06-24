package com.ly.d1_collection_data;

import java.util.LinkedList;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月29日 10:34
 */
public class Test {
    public static void main(String[] args) {
//        目标 了解栈和队列  属于单列
//        栈 先进后出
        LinkedList<String> stack = new LinkedList<>();
        stack.addFirst("第一颗字段");
        stack.addFirst("第二颗字段");
        stack.addFirst("第三颗字段");
        stack.addFirst("第四颗字段");
        System.out.println(stack);
//        出栈
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);


// 队列   排队 先进先出
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);
//        出队列
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());

    }
}
