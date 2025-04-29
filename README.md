# Java Data Structures Assignment

This project implements two data structures for my Algorithms and Data Structures course:

1. **Hash Table** with chaining
2. **Binary Search Tree** with iterator

## How to Use

### Hash Table (`MyHashTable.java`)
```java
// Create hash table
MyHashTable<String, Integer> table = new MyHashTable<>();

// Add elements
table.put("apple", 10);
table.put("banana", 20);

// Get values
System.out.println(table.get("apple")); // Prints 10

// See bucket distribution
table.printBucketSizes();
