package adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMapAdapter<T> implements Map<Object, T>{

	private List<T> list;
	
	public ListMapAdapter() {
		this.list = new ArrayList<T>();
	}

	@Override
	public void clear() {
		list.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsValue(Object value) {
		return list.contains(value);
	}
	
	@Override
	public boolean equals(Object obj) {
		ListMapAdapter<T> lma = (ListMapAdapter<T>)obj;
		return list.equals(lma.list);
	}

	@Override
	public T get(Object key) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public T put(Object key, T value) {
		list.add(value);
		return value;
	}

	@Override
	public T remove(Object key) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int size() {
		return list.size();
	}
	
	@Override
	public Collection<T> values() {
		return list.subList(0, list.size());
	}
	
	@Override
	public Set<Entry<Object, T>> entrySet() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void putAll(Map<? extends Object, ? extends T> m) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<Object> keySet() {
		throw new UnsupportedOperationException();
	}
}