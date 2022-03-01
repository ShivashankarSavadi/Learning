package CollectionsPack;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListDemo {
    public static void arrayListDemo() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(null);
        System.out.println("List:" + list);
        list.remove(3);
        list.remove(3);
        System.out.println("List:" + list);
        list.set(2,4);
        System.out.println("List:" + list);
        list.add(6);
        list.add(0,9);
        System.out.println("List:" + list);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println("List1:" + list1);
        list.removeAll(list1);
        System.out.println("List:" + list);
        list.addAll(list1);
        System.out.println("List:" + list);

        List<Integer> list3 = list.subList(2,4);
        System.out.println("List3:" + list3);
        list3.set(0,100);
        System.out.println("List:" + list);
        System.out.println("List3:" + list3);
        list3.add(101);
        System.out.println("List:" + list);
        System.out.println("List3:" + list3);
        //list.remove(2);
        //System.out.println("List:" + list);
        //System.out.println("List3:" + list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(4);
        list4.add(1);
        System.out.println("List4:" + list4);
        System.out.println("list4 contains (1) " + list4.contains(1));
        System.out.println("list4.indexOf(1) " + list4.indexOf(1));
        System.out.println("list4.lastIndexOd(1) " + list4.lastIndexOf(1));

        for (Integer i: list) {
            System.out.println(" i = " + i);
            //if(i==100) {
              //  list.set
           // }
        }
        System.out.println("iterator----------");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
            if(i == 9) {
                it.remove();
                it.forEachRemaining(Filter::add);
            }
        }
        System.out.println("list : " + list);
        System.out.println("ForEach--------");
        list.forEach(System.out::println);
        list.forEach(Filter::filter);
        list.forEach(new Filter());


    }

    public static void main(String[] args) {
        arrayListDemo();
    }

}

class Filter  implements Consumer {
    static void filter (Integer i) {
        if (i==1) System.out.println(i);
    }

    static void add (Integer i) {
        System.out.println(i + 7);
    }

    @Override
    public void accept(Object o) {
        if ((Integer) o == 1) System.out.println(o);
    }
}