**Queue Operations**

**Overview**  
This folder contains Java implementations of **Linear Queue** and **Circular Queue**.  
These programs are developed for **academic lab practice** to understand queue behavior and its variations.  
Queue follows the **First In First Out (FIFO)** principle.

**Queue Types Implemented**

1. **Linear Queue**
   - Elements are inserted at the rear and removed from the front.
   - Once the rear reaches the end of the array, freed space cannot be reused.
   - This causes **memory wastage**.

   **Operations**
   - **Enqueue**: Inserts an element at the rear.
   - **Dequeue**: Removes an element from the front.
   - **Display**: Displays all elements.

2. **Circular Queue**
   - The last position is connected back to the first position.
   - Efficiently reuses available space after dequeue operations.
   - Solves the memory wastage problem of linear queue.

   **Operations**
   - **Enqueue**: Inserts an element using circular logic.
   - **Dequeue**: Removes an element using circular logic.
   - **Display**: Displays all elements.

**Files Included**
- **LinearQueue.java**
- **CirQueue.java**
- **Test.java**

**Purpose**
- To understand FIFO-based queue operations  
- To study the limitation of linear queue  
- To learn how circular queue improves memory utilization  
- To practice queue implementation using arrays in Java
