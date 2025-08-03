import java.util.*;
// import java.lang.*;

public class TryJavaCollectionIterator{
    public static void main(String[] args){
        List<Integer> lis = new ArrayList<>();
        lis.add(10);
        lis.add(20);
        lis.add(30);
        lis.add(40);

        System.out.println("Printing from ArrayList");

        Iterator<Integer> it = lis.iterator();
        while(it.hasNext()){
            int val = it.next();
            System.out.println(val);
        }

        List<Integer> linkedlis = new LinkedList<>();
        linkedlis.add(10);
        linkedlis.add(20);
        linkedlis.add(30);
        linkedlis.add(40);

        System.out.println("Printing from LinkedList");

        Iterator<Integer> it1 = linkedlis.iterator();
        while(it1.hasNext()){
            int val = it1.next();
            System.out.println(val);
        }

        List<Integer> vectorlis = new Vector<>();
        vectorlis.add(10);
        vectorlis.add(20);
        vectorlis.add(30);
        vectorlis.add(40);

        System.out.println("Printing from vectorlist");

        Iterator<Integer> it2 = vectorlis.iterator();
        while(it2.hasNext()){
            int val = it2.next();
            System.out.println(val);
        }

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);

        System.out.println("Printing from TreeSet");

        Iterator<Integer> it3 = treeSet.iterator();
        while(it3.hasNext()){
            int val = it3.next();
            System.out.println(val);
        }

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);

        System.out.println("Printing from HashSet");

        Iterator<Integer> it4 = hashSet.iterator();
        while(it4.hasNext()){
            int val = it4.next();
            System.out.println(val);
        }

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(40);

        System.out.println("Printing from PriorityQueue");

        Iterator<Integer> it5 = priorityQueue.iterator();
        while(it5.hasNext()){
            int val = it5.next();
            System.out.println(val);
        }
    }
}