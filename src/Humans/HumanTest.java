package Humans;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    @Test
    public void generateIdTest() {
        Set<Long> ids = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            ids.add(Human.generateId());
        }

        assertEquals(ids.size(), 1000);
    }
}
