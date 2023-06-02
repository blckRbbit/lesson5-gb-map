import tasks.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        SomeoneChild one = new SomeoneChild();
//        SomeoneChild2 two = new SomeoneChild2();
//
//        List<Someone> someones = new ArrayList<>();
//        someones.add(one);
//        someones.add(two);
//
//        for (Someone s : someones) {
//            s.some();
//        }
        Human h1 = new Human("Vasya", 32);
        Human h2 = new Human("Vasya", 38);
        Human h3 = new Human("Vasya", 12);

        List<Human> humans = new ArrayList<>();
        humans.add(h2);
        humans.add(h1);
        humans.add(h3);

        Comparator<Human> humanComparator = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return Integer.compare(o1.age, o2.age);
            }
        };

        // Comparator<Human> humanComparator = (o1, o2) -> Integer.compare(o1.age, o2.age);
        //  Collections.sort(humans, Comparator.comparingInt(o -> o.age));
        Collections.sort(humans, humanComparator);


        System.out.println(humans);
    }


    public void foo() {
        // для дз
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
//        Map.Entry<String, ArrayList<String>> - для компаратора
        Set<Map.Entry<String, ArrayList<String>>> entries = phoneBook.entrySet();
//        ArrayList list = new ArrayList<>();
//        list.addAll(entries);
//        Collections.sort(list, PBComparator);

    }

}
