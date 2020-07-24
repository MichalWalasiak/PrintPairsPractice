package Algorythms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PrintPairsTest {
    private PrintPairs printPairs;
    private Integer[] integers;
    private Map<Integer, Integer> pairs;


    @BeforeEach
    void initializeData() {
        printPairs = new PrintPairs();
        integers = new Integer[]{1, 2, 10, 7, 5, 3, 6, 6, 13, 0};
        pairs = new HashMap<>();
    }

    @Test
    @DisplayName("should assign value to key equals to number of occurrence key in array")
    void findPairs_returnsMap_withProperKeyValue() {
        // when
        printPairs.findPairs(integers, 13, pairs);

        // than
        assertEquals(pairs.get(6), 2);
        assertEquals(pairs.get(1), 1);
    }

    @Test
    @DisplayName("should return map with size equals to the distinct numbers given in array")
    void findPairs_returnsMap_withProperSize() {
        // when
        printPairs.findPairs(integers, 13, pairs);

        // than
        assertEquals(pairs.size(), 9);
    }

    @AfterEach
    void cleanUp() {
        pairs.clear();
    }
}
