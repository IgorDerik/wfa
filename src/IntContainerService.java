import java.util.ArrayList;

public class IntContainerService {

    private ArrayList<IntContainer> containers;

    public IntContainerService(ArrayList<IntContainer> containers) {
        this.containers = containers;
    }

    private IntContainer getRightContainer() {

        int currentFreeSpace = containers.get(0).getFreeSpace();
        IntContainer result = containers.get(0);


        for (int i = 1; i < containers.size(); i++) {

            if ( containers.get(i).getFreeSpace() > currentFreeSpace ) {

                currentFreeSpace = containers.get(i).getFreeSpace();
                result = containers.get(i);

            }

        }

        /*
        for (IntContainer container : containers) {
            if(container.getFreeSpace() > currentFreeSpace) {
                currentFreeSpace = container.getFreeSpace();
                result = container;
            }
        }
        */

        return result;
    }

    public void putIntToContainer(int i) {

        getRightContainer().addInt(i);

    }

}
