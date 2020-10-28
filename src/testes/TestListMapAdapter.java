package testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import adapter.ListMapAdapter;

public class TestListMapAdapter {
	
	Map<Object, String> mapAdapter;

	@Before
	public void init(){
		mapAdapter = new ListMapAdapter<String>();
	}
	
	@Test
	public void testClear() {
		mapAdapter.put(1, "Rafael");
		mapAdapter.clear();
		assertTrue(mapAdapter.isEmpty());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testContainsKey() {
		mapAdapter.containsKey(1);
		fail();
	}

	@Test
	public void testContainsValue() {
		mapAdapter.put(100, "Otavio");
		assertTrue(mapAdapter.containsValue("Otavio"));
		assertFalse(mapAdapter.containsValue("Rafael"));
	}
	
	@Test
	public void testEquals() {
		Map<Object, String> other = new ListMapAdapter<String>();
		other.put(7, "Otavio");
		mapAdapter.put(7, "Otavio");
		
		assertTrue(mapAdapter.equals(other));
	}
	
	@Test
	public void testNotEquals() {
		Map<Object, String> other = new ListMapAdapter<String>();
		other.put(1, "Rafael");
		mapAdapter.put(9, "Otavio");
		
		assertFalse(mapAdapter.equals(other));
	}
	
	@Test
	public void testIsEmpty() {
		assertTrue(mapAdapter.isEmpty());
	}
	
	@Test
	public void testIsNotEmpty() {
		mapAdapter.put(9, "Otavio");
		assertFalse(mapAdapter.isEmpty());
	}
	
	@Test
	public void testPut() {
		mapAdapter.put(14, "Otavio");
		assertTrue(mapAdapter.containsValue("Otavio"));
	}

	@Test
	public void testSizeVazio() {
		assertEquals(0, mapAdapter.size());
	}
	
	@Test
	public void testSize() {
		mapAdapter.put(0, "José");
		mapAdapter.put(0, "João");
		mapAdapter.put(0, "Maria");
		mapAdapter.put(0, "Rafael");
		mapAdapter.put(0, "Otávio");
		assertEquals(5, mapAdapter.size());
	}
	
	@Test
	public void testValues() {
		mapAdapter.put(1, "Otavio");
		mapAdapter.put(1, "Maria");
		mapAdapter.put(1, "José");
		mapAdapter.put(1, "João");
		mapAdapter.put(1, "Rafael");
		
		
		String[] expected = {"Otavio", "Maria", "José", "João", "Rafael"};
		
		assertEquals(Arrays.toString(expected), mapAdapter.values().toString());
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testGet() {
		mapAdapter.get(1);
		fail();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testRemove() {
		mapAdapter.remove(0);
		fail();
	}
}
