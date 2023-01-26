package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleStackTest {

    @Test
    public void testCreateEmptyStack() { // Test case

        // When a freshly stack is created
        Stack stack = new SimpleStack();

        // Then… (oracle)
        assertTrue(stack.isEmpty(), "A new stack should be empty");
        assertEquals( 0, stack.getSize(), "A new stack has no element");
    }

    @Test
    public void testPush() throws EmptyStackException {

        // Given an empty stack and an item
        Stack stack = new SimpleStack();
        Item item = new SimpleItem();

        // When the item is pushed in the stack
        stack.push(item);

        // Then…
        assertFalse(stack.isEmpty(), "The stack must be not empty");
        assertEquals(1, stack.getSize(),"The stack constains 1 item");
        assertSame( item, stack.peek(),"The pushed item is on top of the stack");
    }

    @Test
    public void testPopOnEmptyStack()  {
        // Given an empty stack
        Stack stack = new SimpleStack();

        // When we "pop" the stack, should throws an EmptyStackException.
        //assertThrows(EmptyStackException.class, ()->stack.pop());
        assertThrows(EmptyStackException.class, stack::pop);
    }
}
