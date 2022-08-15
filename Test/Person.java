package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import java.util.LinkedList;
import java.util.Queue;

public class Person extends Thread {
    public void run() {
        System.out.println("어쩔티비");
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hi");
        arr.add("hello");
        arr.set(0, "what'sup");
        arr.forEach(n -> {
            System.out.println(n);
        });
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("1", "hi");
        hm.put("2", "hello");

        HashSet<String> hs = new HashSet<String>();
        hs.add("hi");
        hs.add("hello");

    }
}