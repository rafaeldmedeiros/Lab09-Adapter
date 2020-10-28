package testes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import adapter.MapListAdapter;

public class TestMapListAdapter {
	
	List<String> listAdapter;

	@Before
	public void init() {
		listAdapter = new MapListAdapter<String>();
	}

	@Test
	public void testContains() {
		listAdapter.add("Rafael");
		assertTrue(listAdapter.contains("Rafael"));
		assertFalse(listAdapter.contains("Ot�vio"));
	}
	
	@Test
	public void testClear() {
		listAdapter.add("Rafael");
		listAdapter.clear();
		assertTrue(listAdapter.isEmpty());
	}
	
	@Test
	public void testEquals() {
		List<String> other = new MapListAdapter<String>();
		other.add("Rafael");
		listAdapter.add("Rafael");
		
		assertTrue(listAdapter.equals(other));
	}
	
	@Test
	public void testNotEquals() {
		List<String> other = new MapListAdapter<String>();
		other.add("Ot�vio");
		listAdapter.add("Rafael");
		
		assertFalse(listAdapter.equals(other));
	}
	
	@Test
	public void testIsEmpty() {
		assertTrue(listAdapter.isEmpty());
	}
	
	@Test
	public void testIsNotEmpty() {
		listAdapter.add("Rafael");
		assertFalse(listAdapter.isEmpty());
	}
	
	@Test
	public void testIterator() {
		listAdapter.add("Rafael");
		listAdapter.add("Maria");
		listAdapter.add("Jos�");
		listAdapter.add("Jo�o");
		listAdapter.add("Ot�vio");
		
		String[] nomes = {"Rafael", "Maria", "Jos�", "Jo�o", "Ot�vio"};
		
		Iterator<String> iterator = listAdapter.iterator();
		
		int count = 0;
		while(iterator.hasNext()) {
			assertEquals(iterator.next(), nomes[count]);
			count++;
		}
	}
	
	@Test
	public void testRemove() {
		listAdapter.add("Rafael");
		assertTrue(listAdapter.remove("Rafael"));
	}
	
	@Test
	public void testNotRemove() {
		listAdapter.add("Rafael");
		assertFalse(listAdapter.remove("Ot�vio"));
	}
	
	@Test
	public void testSizeVazio() {
		assertEquals(0, listAdapter.size());
	}
	
	@Test
	public void testSize() {
		listAdapter.add("Rafael");
		listAdapter.add("Maria");
		listAdapter.add("Jos�");
		listAdapter.add("Jo�o");
		listAdapter.add("Ot�vio");
		assertEquals(5, listAdapter.size());
	}
	
	@Test
	public void testToArray() {
		listAdapter.add("Rafael");
		listAdapter.add("Maria");
		listAdapter.add("Jos�");
		listAdapter.add("Jo�o");
		listAdapter.add("Ot�vio");
		
		String[] nomes = {"Rafael", "Maria", "Jos�", "Jo�o", "Ot�vio"};
		
		assertTrue(Arrays.equals(listAdapter.toArray(), nomes));
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testGet() {
		listAdapter.get(9999);
		fail();
	}
}