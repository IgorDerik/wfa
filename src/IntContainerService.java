import java.util.ArrayList;

public class IntContainerService {

    private ArrayList<IntContainer> containers;

    public IntContainerService(ArrayList<IntContainer> containers) {
        this.containers = containers;
    }

    private IntContainer getRightContainer() {

        int currentFreeSpace = 0;
        IntContainer result = null;

        for (IntContainer container : containers) {
            if(container.getFreeSpace() > currentFreeSpace) {
                currentFreeSpace = container.getFreeSpace();
                result = container;
            }
        }

        return result;
    }

    public void putIntToContainer(int i) {

        getRightContainer().addInt(i);

    }

}
