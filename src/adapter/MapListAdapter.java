package adapter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class MapListAdapter<T> implements List<T>{
	
	private Map<Integer, T> map;
	private int id = 0;
	
	public MapListAdapter() {
		map = new HashMap<Integer, T>();
	}

	@Override
	public boolean add(T element) {
		map.put(id++, element);
		return true;
	}
	
	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public boolean contains(Object element) {
		return map.containsValue(element);
	}

	@Override
	public boolean equals(Object obj) {
		MapListAdapter<T> mla = (MapListAdapter<T>)obj;
		return map.equals(mla.map);
	}

	@Override
	public T get(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public Iterator<T> iterator() {
		return map.values().iterator();
	}
	
	@Override
	public boolean remove(Object element) {
		for(Integer key : map.keySet()) {
			T obj = map.get(key);
			if(element.equals(obj)) {
				map.remove(key, element);
				return true;
			}
		}
		return false;
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public Object[] toArray() {
		return map.values().toArray();
	}

	@Override
	public void add(int index, T element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<T> listIterator() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public ListIterator<T> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public T set(int index, T element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public T remove(int index) {
		throw new UnsupportedOperationException();
	}
}