
# Insertion Sort Dry Run (Java)

This is a detailed dry run of the **Insertion Sort** algorithm implemented in Java using an array: `{2, 5, 3, 1, 4}`.

---

## Key Steps to Remember:
1. **Insertion Sort** works by taking one element at a time and inserting it into its correct position in the already sorted portion of the array.
2. The outer loop (`i`) selects the element to insert, while the inner loop (`j`) compares and shifts elements as necessary.

---

## Initial Array:
```
{2, 5, 3, 1, 4}
```

---

## Dry Run Table:
| **Iteration** | **i (Outer Loop)** | **j (Inner Loop)** | **Array Before Swap**   | **Action/Swap**    | **Array After Swap**    |
|---------------|--------------------|--------------------|-------------------------|--------------------|-------------------------|
| Initial       | -                  | -                  | {2, 5, 3, 1, 4}         | -                  | {2, 5, 3, 1, 4}         |
| 1st           | 0                  | 1                  | {2, 5, 3, 1, 4}         | No swap (5 > 2)     | {2, 5, 3, 1, 4}         |
| 2nd           | 1                  | 2                  | {2, 5, 3, 1, 4}         | Swap (3 < 5)        | {2, 3, 5, 1, 4}         |
|               |                    | 1                  | {2, 3, 5, 1, 4}         | No swap (3 > 2)     | {2, 3, 5, 1, 4}         |
| 3rd           | 2                  | 3                  | {2, 3, 5, 1, 4}         | Swap (1 < 5)        | {2, 3, 1, 5, 4}         |
|               |                    | 2                  | {2, 3, 1, 5, 4}         | Swap (1 < 3)        | {2, 1, 3, 5, 4}         |
|               |                    | 1                  | {2, 1, 3, 5, 4}         | Swap (1 < 2)        | {1, 2, 3, 5, 4}         |
| 4th           | 3                  | 4                  | {1, 2, 3, 5, 4}         | Swap (4 < 5)        | {1, 2, 3, 4, 5}         |
|               |                    | 3                  | {1, 2, 3, 4, 5}         | No swap (4 > 3)     | {1, 2, 3, 4, 5}         |

---

## Final Sorted Array:
```
{1, 2, 3, 4, 5}
```

---

### Key Insights:
- Insertion sort is efficient for **small arrays** or **partially sorted arrays**.
- Each element is compared to the elements in the sorted portion (left side) and shifted to the correct position.

---

This table gives a clear view of how the algorithm progresses step by step, making it easier to understand.
