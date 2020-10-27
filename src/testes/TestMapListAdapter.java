package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import adapter.MapListAdapter;

class TestMapListAdapter {
	
	List<String> listAdapter;

	@BeforeEach
	void init() {
		listAdapter = new MapListAdapter<String>();
	}
	
	@AfterEach
	void clear() {
		listAdapter.clear();
	}

	@Test
	void testAdd() {
		listAdapter.add("Ivan");
		assertTrue(listAdapter.contains("Ivan"));
	}
	
	@Test
	void testClear() {
		listAdapter.add("Ivan");
		listAdapter.clear();
		assertTrue(listAdapter.isEmpty());
	}
	
	@Test
	void testContains() {
		listAdapter.add("Ivan");
		assertTrue(listAdapter.contains("Ivan"));
	}
	
	@Test
	void testNotContains() {
		listAdapter.add("Ivan");
		assertFalse(listAdapter.contains("Maria"));
	}
	
	@Test
	void isEquals() {
		List<String> otherList = new MapListAdapter<String>();
		otherList.add("Ivan");
		listAdapter.add("Ivan");
		
		assertTrue(listAdapter.equals(otherList));
	}
	
	@Test
	void isNotEquals() {
		List<String> otherList = new MapListAdapter<String>();
		otherList.add("Maria");
		listAdapter.add("Ivan");
		
		assertFalse(listAdapter.equals(otherList));
	}
	
	@Test
	void testGet() {
		assertThrows(UnsupportedOperationException.class, ()->{
			listAdapter.get(0);
		});
	}
	
	@Test
	void testIsEmpty() {
		assertTrue(listAdapter.isEmpty());
	}
	
	@Test
	void testIsNotEmpty() {
		listAdapter.add("Ivan");
		assertFalse(listAdapter.isEmpty());
	}
	
	@Test
	void testIterator() {
		listAdapter.add("Ivan");
		listAdapter.add("Maria");
		listAdapter.add("José");
		
		String[] nomes = {"Ivan", "Maria", "José"};
		
		Iterator<String> iterator = listAdapter.iterator();
		
		int cont = 0;
		while(iterator.hasNext()) {
			assertEquals(iterator.next(), nomes[cont]);
			cont++;
		}
	}
	
	@Test
	void testRemove() {
		listAdapter.add("Ivan");
		
		assertTrue(listAdapter.remove("Ivan"));
	}
	
	@Test
	void testNotRemove() {
		listAdapter.add("Ivan");
		
		assertFalse(listAdapter.remove("Maria"));
	}
	
	@Test
	void testSize1() {
		int expected = 0;
		assertEquals(expected, listAdapter.size());
	}
	
	@Test
	void testSize2() {
		int expected = 3;
		listAdapter.add("Ivan");
		listAdapter.add("Maria");
		listAdapter.add("José");
		assertEquals(expected, listAdapter.size());
	}
	
	@Test
	void testToArray() {
		listAdapter.add("Ivan");
		listAdapter.add("Maria");
		listAdapter.add("José");
		
		String[] nomes = {"Ivan", "Maria", "José"};
		
		assertTrue(Arrays.equals(listAdapter.toArray(), nomes));
	}
}