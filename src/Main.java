import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Queue - FIFO : First In First Out
        //Deque - LIFO(FILO) : Last In First Out, FIFO
        //Stack - LIFO : Last In First Out


//        Queue<String> queue = new LinkedList<>();
//        queue.add("Bishkek");
//        queue.add("KaraKol");
//        queue.add("Batken");
//        queue.add("Naryn");
//        queue.add("Talas");

//        queue.offer("Osh"); //maalymat koshot (add  suaktuu ele ishteit)
//        System.out.println(queue.element());  //en birinchi elementti kaitarat (null bolso Exception yrgytat)
//        System.out.println(queue.peek()); //birinchi elementti kaitarat (null kaitatat);
//        System.out.println(queue.poll());//birinchi elementti kaytaryp any kaira ochyryp salat (null kaitarat)
//        System.out.println(queue.remove());//birinchi elementti kaytarat any kaira ochyryp salat (Exception kaitarat)
//        System.out.println(queue);


        // constructoruna comparetor bersek bolot
//        Queue<String> queue = new PriorityQueue<>();
//        queue.add("Bishkek");
//        queue.add("Naryn");
//        queue.add("Talas");
//        queue.add("Alai");
//        queue.add("Osh");
//        System.out.println(queue);


//        --------------------------------------------------------------------------------------------------------------

//        Stack<String> stack = new Stack<>();
//        stack.add("Kuban");
//        stack.add("Janysh");
//        stack.add("Asan");

//        System.out.println(stack);
//        stack.pop();//akyrky kirgen birinshi chygat
//        System.out.println(stack.peek());
//        System.out.println(stack.empty());
//        stack.push("Kuban");
//        System.out.println(stack);


        Deque<String> deque = new ArrayDeque<>();
    }
}