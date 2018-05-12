import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] ints = {53, 66, 97, 48, 47, 72, 16, 86, 12, 59, 77, 51, 53, 97, 32, 3, 35, 51, 7, 98};

        ArrayList<IntContainer> intContainers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            intContainers.add(new IntContainer(100)); // creating 5 IntContainers
        }

        IntContainerService intContainerService = new IntContainerService(intContainers);

        for (int i=0; i<ints.length; i++) {

            intContainerService.putIntToContainer(ints[i]);

        }

        for (int i=0; i<intContainers.size(); i++) {

            System.out.println("Container: "+ i);

            System.out.println( "SUM: " + intContainers.get(i).getIntsWeight() );

            intContainers.get(i).printInts();

            System.out.println();

        }


    }

}
