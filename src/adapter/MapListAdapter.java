package adapter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/***
 * Classe que adapta uma Map para Lista
 * @author Rafael
 * @author Otavio
 * @param <T>
 */
public class MapListAdapter<T> implements List<T>{
	
	private Map<Integer, T> map;
	private int id = 0;
	
	public MapListAdapter() {
		map = new HashMap<Integer, T>();
	}

	/***
	 * Adiciona um elemento.
	 */
	@Override
	public boolean add(T element) {
		map.put(id++, element);
		return true;
	}
	
	/***
	 * Limpa a lista.
	 */
	@Override
	public void clear() {
		map.clear();
	}

	/***
	 * Verifica se a lista contém um objeto.
	 */
	@Override
	public boolean contains(Object element) {
		return map.containsValue(element);
	}

	/***
	 * Retorna a quantidade de elementos na lista.
	 */
	@Override
	public int size() {
		return map.size();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public T get(int index) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Verifica se a lista está vazia
	 */
	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	/***
	 * Retorna um iterator para a lista.
	 */
	@Override
	public Iterator<T> iterator() {
		return map.values().iterator();
	}
	
	/***
	 * Remove um elemento.
	 */
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

	/***
	 * Retorna um array de elementos que representa essa lista.
	 */
	@Override
	public Object[] toArray() {
		return map.values().toArray();
	}

	/***
	 * Compara a lista a outro objeto.
	 */
	@Override
	public boolean equals(Object obj) {
		MapListAdapter<T> mla = (MapListAdapter<T>)obj;
		return map.equals(mla.map);
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public void add(int index, T element) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public boolean addAll(Collection<? extends T> c) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public ListIterator<T> listIterator() {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public ListIterator<T> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public T set(int index, T element) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Operação não suportada.
	 */
	@Override
	public T remove(int index) {
		throw new UnsupportedOperationException();
	}
}