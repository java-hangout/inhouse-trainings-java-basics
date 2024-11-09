package com.jh.iht.java.basics.collection1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

/**
 * Problem Statement:
 * The Collection interface provides basic methods to manipulate collections. 
 * This test checks if elements can be added, removed, and queried in the collection.
 * 
 * Input:
 * - Collection of items ["Apple", "Banana", "Cherry"]
 * 
 * Expected Output:
 * - "Collection size: 3", "Contains 'Banana': true"
 */
public class CCollectionInterfaceTest {

    @Test
    public void testCollectionMethods() {
        CollectionInterface collectionInterface = new CollectionInterface();
        Collection<String> items = collectionInterface.getItems();

        // Check the size of the collection
        Assertions.assertEquals(3, items.size());

        // Check if the collection contains a specific item
        Assertions.assertTrue(items.contains("Banana"));
    }
}