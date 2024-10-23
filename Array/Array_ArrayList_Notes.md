
# Arrays, ArrayLists, and Mutability in Java

## 1. Arrays

- **Definition**: Arrays are fixed-size data structures that can store multiple elements of the same type.
- **Syntax**: `int[] arr = new int[5];`  
  This creates an array `arr` that can hold 5 integers.
  
- **Characteristics**:
  - Arrays are **fixed in size** once created.
  - They can hold **primitive types** (like `int`, `double`) or **objects**.
  - Elements in an array are accessed using **indices** (starting from 0).

- **Example**:
  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  System.out.println(numbers[0]); // Output: 1
  ```

## 2. ArrayLists

- **Definition**: `ArrayList` is a resizable array from the Java Collections framework. Unlike arrays, it can grow and shrink dynamically.
- **Syntax**: `ArrayList<Integer> list = new ArrayList<>();`
  
- **Characteristics**:
  - Can **dynamically resize** when elements are added or removed.
  - Only stores **objects** (e.g., `Integer`, `String`), not primitive types. However, autoboxing converts primitives to objects automatically.
  - **Accessed using indices** like arrays.

- **Example**:
  ```java
  ArrayList<String> names = new ArrayList<>();
  names.add("Alice");
  names.add("Bob");
  System.out.println(names.get(0)); // Output: Alice
  ```

## 3. Multidimensional Arrays

- **Definition**: Arrays of arrays (e.g., a 2D array is an array where each element is another array).
  
- **Syntax**: `int[][] matrix = new int[3][3];`

- **Characteristics**:
  - Useful for representing matrices or grids.
  - Accessed using **two indices**: `matrix[row][column]`.

- **Example**:
  ```java
  int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
  };
  System.out.println(matrix[0][0]); // Output: 1
  ```

## 4. Multidimensional ArrayLists

- **Definition**: `ArrayList` where each element is another `ArrayList` (a dynamic 2D array).
- **Syntax**: `ArrayList<ArrayList<Integer>> list = new ArrayList<>();`

- **Characteristics**:
  - Each row can have a different number of columns, unlike a 2D array where each row must have the same length.
  
- **Example**:
  ```java
  ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
  for (int i = 0; i < 3; i++) {
      matrix.add(new ArrayList<>());
  }
  ```

## 5. Mutability in Arrays

- **Mutability** means that the **objects inside an array** can be modified (changed) even though the array size is fixed.

- **Example**:
  ```java
  class Person {
      String name;
      Person(String name) { this.name = name; }
  }

  Person[] people = { new Person("Alice"), new Person("Bob") };
  people[0].name = "Alicia"; // Modifies the name of the first Person object
  ```

## 6. Finding Maximum in an Array (O(n) Time Complexity)

- **Linear Search** is the best way to find the maximum value in an array in **O(n)** time complexity, where `n` is the number of elements.
  
- **Steps**:
  1. Start with the first element and assume it’s the maximum.
  2. Loop through the array, and compare each element to the current maximum.
  3. Update the maximum if a larger element is found.
  
- **Example**:
  ```java
  int[] arr = {5, 1, 9, 2, 8, 3};
  int max = arr[0];
  for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
          max = arr[i];
      }
  }
  System.out.println("Maximum value: " + max); // Output: 9
  ```

### Conclusion
- Arrays have fixed sizes but can hold both primitive and object types.
- ArrayLists are resizable and only store objects.
- Objects in arrays and ArrayLists can be **mutable** (i.e., they can be changed after creation).
- To find the maximum in an array, the most efficient method is a linear search, which runs in O(n) time.

