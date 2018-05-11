public class Container {

    private int size;

    private int[] ints = new int[size];

    public Container(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
