package Arrays;
/*
Array: int[] arr = {10, 20, 30, 40};

Contiguous Memory Representation:

+-------+-------+-------+-------+
|  10   |  20   |  30   |  40   |
+-------+-------+-------+-------+
  ↑       ↑       ↑       ↑
addr    addr+4  addr+8  addr+12  (Assuming 4 bytes per int)

Explanation:
- Arrays in Java are stored in contiguous memory locations.
- The base address points to the first element.
- Each subsequent element is placed next to the previous one.
- Useful for indexing: arr[i] = base_address + (i * size_of_element)

Advantages:
- (i)  Random Access
- (ii) Cache Friendliness

Types of Arrays

1). Fixed Sized Arrays

        int [] arr = new int[100];    ---> In Java Array is Heap Allocated
        int [] arr = new int [n];
        int arr [] = {10,20,30,40};

2). Dynamic Sized Arrays
        Java : ArrayList
        * Resize themselves automatically.

        ArrayList Working (Internal Implementation):

    Initial State (default capacity = 10):

    ArrayList<Integer> list = new ArrayList<>();

    Underlying structure:
    +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
    |     |     |     |     |     |     |     |     |     |     |
    +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+
    Index: 0     1     2     3     4     5     6     7     8     9

    - Internally backed by a dynamic array: Object[] elementData
    - Elements are added sequentially in the array.

    When capacity is full:
    - A new array of **larger capacity** is created.
    - Default growth: newCapacity = oldCapacity + (oldCapacity / 2)
      e.g., 10 → 15 → 22 → ...

    Copy Process:
    1. New array is created.
    2. Old elements are copied into the new array.
    3. The reference is updated to the new array.

    Visualization of Resize:

    Old array (size = 10):
    [1, 2, 3, ..., 10]

    New array (size = 15):
    [1, 2, 3, ..., 10, null, null, null, null, null]

    Time Complexity:
    - add(): O(1) amortized
    - add(index, element): O(n)
    - get(index): O(1)
    - remove(index): O(n) (due to shifting)

*/
public class intro {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
