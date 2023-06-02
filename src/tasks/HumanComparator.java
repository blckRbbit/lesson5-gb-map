package tasks;

import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
//        return Integer.compare(o1.age, o2.age);
        if (o1.age > o2.age) return 1;
        else if (o1.age < o2.age) return -1;
        else return 0;
    }
}
