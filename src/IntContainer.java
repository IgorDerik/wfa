import java.util.ArrayList;

public class IntContainer {

    private int maxSize;

    private ArrayList<Integer> integers = new ArrayList<>();

    public IntContainer(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getFreeSpace() {
        return maxSize-integers.size();
    }

    public void printInts() {
        for (int i : integers) {
            System.out.println(i);
        }
    }

    public void addInt(int i) {
        integers.add(i);
    }

}