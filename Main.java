import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        thisComparator costComparator = new thisComparator();
        Comparator<Notebook> reductionComparable = (s1, s2) -> s2.cost - s1.cost;

        Comparator<Notebook> reductionComparable2 = (s1, s2) -> {
            if (s1.cost < s2.cost) {
                return 1;
            } else if (s1.cost == s2.cost) {
                return 0;
            } else {
                return -1;
            }
        };

        Comparator<Notebook> fullSortingComparator = (s1, s2) -> {
            if (s1.ram < s2.ram) {
                return 1;
            } else if (s1.ram == s2.ram) {
                if (s1.cost < s2.cost) {
                    return 1;
                } else if (s1.cost == s2.cost) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        };

        List<Notebook> list = new ArrayList<>(); // заполнение списка 
        for (int i = 0; i < 10; i++) {
            list.add(new Notebook());
            System.out.println(list.get(i));
        }

        System.out.println(list);


        System.out.println("\n");

        Collections.sort(list, costComparator); 
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\n");

        Collections.sort(list, reductionComparable);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\n");

        Collections.sort(list, fullSortingComparator);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}