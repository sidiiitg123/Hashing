package com.company;

import java.util.HashMap;
import java.util.Map;

public class CopyList {

    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }

    public RandomListNode copyRandomList(RandomListNode head) {

        if (head == null) {
            return null;
        }
        RandomListNode p = new RandomListNode(0);
        RandomListNode temp = head, q = p;
        Map<RandomListNode, RandomListNode> mymap = new HashMap<>();
        while (temp != null) {
            RandomListNode newnode = new RandomListNode(temp.label);
            mymap.put(temp, newnode);
            q.next = newnode;
            q = q.next;
            temp = temp.next;
        }
        q = p;
        temp = head;
        while (temp != null) {

            q.next.random = mymap.get(temp.random);
            q = q.next;
            temp = temp.next;

        }
        return p.next;
    }
}
