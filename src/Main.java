public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>("Для строк", 5);
        MagicBox<Integer> integerMagicBox = new MagicBox<>("Для чисел", 5);

        stringMagicBox.add("One");
        stringMagicBox.add("Two");
        stringMagicBox.add("Three");
        stringMagicBox.add("Four");
        System.out.println(stringMagicBox.add("Five"));
        System.out.println(stringMagicBox.add("Six"));
        System.out.println(stringMagicBox);
        System.out.println(stringMagicBox.pick());
        
        integerMagicBox.add(200);
        integerMagicBox.add(500);
        System.out.println(integerMagicBox.pick());

    }
}