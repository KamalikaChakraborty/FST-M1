package activities;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Activity1 {
    static ArrayList<String> list;
    @BeforeAll
    static void setup() {
        list = new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }
    @Test
    @Order(1)
    void insertTest() {
        assertEquals(2, list.size(), "Wrong size");
        list.add("gamma");
        assertEquals(3, list.size(), "Wrong size");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("gamma", list.get(2), "Wrong element");
    }
    @Test
    @Order(2)
    void replaceTest() {
        assertEquals(3, list.size(), "Wrong size");
        list.set(1, "theta");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("theta", list.get(1), "Wrong element");
        assertEquals("gamma", list.get(2), "Wrong element");
    }

}
