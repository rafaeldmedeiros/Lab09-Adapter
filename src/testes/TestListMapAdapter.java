package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import adapter.ListMapAdapter;

class TestListMapAdapter {
	
	Map<Object, String> mapAdapter;

	@BeforeEach
	void init(){
		mapAdapter = new ListMapAdapter<String>();
	}
	
	@AfterEach
	void clear() {
		mapAdapter.clear();
	}
	
	@Test
	void testClear() {
		mapAdapter.put(001, "Ivan");
		mapAdapter.clear();
		assertTrue(mapAdapter.isEmpty());
	}
	
	@Test
	void testContainsKey() {
		assertThrows(UnsupportedOperationException.class, ()->{
			mapAdapter.containsKey(001);
		});
	}

	@Test
	void testContainsValue() {
		mapAdapter.put(001, "Ivan");
		assertTrue(mapAdapter.containsValue("Ivan"));
	}
	
	@Test
	void testNotContainsValue() {
		mapAdapter.put(001, "Ivan");
		assertFalse(mapAdapter.containsValue("Maria"));
	}
	
	@Test
	void isEquals() {
		Map<Object, String> otherMap = new ListMapAdapter<String>();
		otherMap.put(001, "Ivan");
		mapAdapter.put(001, "Ivan");
		
		assertTrue(mapAdapter.equals(otherMap));
	}
	
	@Test
	void isNotEquals() {
		Map<Object, String> otherMap = new ListMapAdapter<String>();
		otherMap.put(001, "Maria");
		mapAdapter.put(001, "Ivan");
		
		assertFalse(mapAdapter.equals(otherMap));
	}
	
	@Test
	void testGet() {
		assertThrows(UnsupportedOperationException.class, ()->{
			mapAdapter.get(001);
		});
	}
	
	@Test
	void testIsEmpty() {
		assertTrue(mapAdapter.isEmpty());
	}
	
	@Test
	void testIsNotEmpty() {
		mapAdapter.put(001, "Ivan");
		assertFalse(mapAdapter.isEmpty());
	}
	
	@Test
	void testPut() {
		mapAdapter.put(001, "Ivan");
		assertTrue(mapAdapter.containsValue("Ivan"));
	}

	@Test
	void testRemove() {
		assertThrows(UnsupportedOperationException.class, ()->{
			mapAdapter.remove(001);
		});
	}
	
	@Test
	void testSize1() {
		int expected = 0;
		assertEquals(expected, mapAdapter.size());
	}
	
	@Test
	void testSize2() {
		int expected = 3;
		mapAdapter.put(001, "Ivan");
		mapAdapter.put(002, "Maria");
		mapAdapter.put(003, "José");
		assertEquals(expected, mapAdapter.size());
	}
	
	@Test
	void testValues() {
		mapAdapter.put(001, "Ivan");
		mapAdapter.put(002, "Maria");
		mapAdapter.put(003, "José");
		
		String[] expected = {"Ivan", "Maria", "José"};
		
		assertEquals(Arrays.toString(expected), mapAdapter.values().toString());
	}
}
