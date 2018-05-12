import java.util.ArrayList;

public class IntContainer {

    private int maxWeight;

    private ArrayList<Integer> integers = new ArrayList<>();

    public IntContainer(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getIntsWeight() {

        int result = 0;

        for (int i : integers) {
            result = result + i;
        }

        return result;
    }

    public int getFreeSpace() {

        return maxWeight-getIntsWeight();

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