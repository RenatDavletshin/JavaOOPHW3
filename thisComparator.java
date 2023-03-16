import java.util.Comparator;

public class thisComparator implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        if (o1.cost > o2.cost) {
            return 1;
        } else if (o1.cost == o2.cost) {
            return 0;
        } else {
            return -1;
        }
    }

}