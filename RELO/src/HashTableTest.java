public class HashTableTest {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        // Add 10000 elements
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(i, "Name" + i);
            table.put(key, "Value" + i);
        }

        // Print bucket sizes
        table.printBucketSizes();
    }
}