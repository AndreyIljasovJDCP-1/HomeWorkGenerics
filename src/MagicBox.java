import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {

    private final String nameBox;
    private final T[] items;
    Random random = new Random();

    public MagicBox(String nameBox, int maxItems) {
        this.nameBox = nameBox;
        this.items = (T[]) new Object[maxItems];

    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("MagicBox \"" + getNameBox() + "\" заполнена!");
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new BoxNotFullException(getNameBox(), items.length - i);
            }
        }
        return items[random.nextInt(items.length)];
    }

    public String getNameBox() {
        return nameBox;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
