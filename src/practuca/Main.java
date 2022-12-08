package practuca;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Queue<String> names = new LinkedList<>();
//        names.offer("Kuban");
//        names.offer("Asan");
//        names.offer("Janush");
//        names.offer("Yson");
//        names.offer("Adil");
//        names.offer("Linda");
//
//        System.out.println(names.poll());
//        System.out.println(names.poll());


//        Map<Integer,String> student = new HashMap<>();
//        student.put(33,"Kuban");
//        student.put(72,"Linda");
//        student.put(27,"Asan");
//        student.put(30,"Yson");
//        student.put(54,"Hanzada");
//
//        for (Integer integer : student.keySet()) {
//            System.out.println(integer + " " + student.get(integer));
//        }


        Map<Integer,String> student = new TreeMap<>();
        student.put(33,"Kuban");
        student.put(72,"Linda");
        student.put(27,"Asan");
        student.put(30,"Yson");
        student.put(54,"Hanzada");

        Iterator<Map.Entry<Integer, String>> mapiterator =  student.entrySet().iterator();
        while (mapiterator.hasNext()){
            Map.Entry<Integer,String> entry = mapiterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
