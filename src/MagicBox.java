import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MagicBox<T> {

    private final String nameBox;
    private final List<T> items;
    private final int maxItems;
    private final Random random = new Random();

    public MagicBox(String nameBox, int maxItems) {
        this.nameBox = nameBox;
        this.items = new ArrayList<>(maxItems);
        this.maxItems = maxItems;
    }

    public boolean add(T item) {
        if (items.size() < maxItems) {
            items.add(item);
            return true;
        } else {
            System.out.println("MagicBox \"" + getNameBox() + "\" заполнена!");
            return false;
        }
    }

    public T pick() {
        if (items.size() < maxItems) {
            throw new BoxNotFullException(getNameBox(), maxItems - items.size());
        }
        System.out.print("Случайный выбор: ");
        return items.get(random.nextInt(items.size()));
    }

    public List<T> getItems() {
        return items;
    }

    public Random getRandom() {
        return random;
    }

    public String getNameBox() {
        return nameBox;
    }

    @Override
    public String toString() {
        return "MagicBox \"" + getNameBox() + "\" -> " + items + "; MAX_SIZE = " + maxItems + ".";
    }
}
