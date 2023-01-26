package org.example;

/**
 * Interface describing behaviour of a stack
 */
public interface Stack {

    /**
     * Tests if this stack is empty
     */
    boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     */
    int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    Item pop() throws EmptyStackException;

}
