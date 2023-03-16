import java.util.Random;

public class Notebook {
    int cost;
    int ram;

    Random r = new Random();

    public Notebook() {
        this.cost = r.nextInt(3000,9999);
        this.ram = r.nextInt(2, 64);
    }

    public Notebook(int ram) {
        this.cost = r.nextInt(3000,9999);
        this.ram = ram;
    }

    public int getCost() {
        return cost;
    }

    public int getRam() {
        return ram;
    }
    
    @Override
    public String toString() {
        return "цена: " + cost + "  ram: " + ram;
    }
}