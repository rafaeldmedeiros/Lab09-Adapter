package adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/***
 * Adapta uma List para o Map
 * @author Rafael
 * @author Otavio
 * @param <T>
 */
public class ListMapAdapter<T> implements Map<Object, T>{

	private List<T> list;
	//LIST > MAP
	
	public ListMapAdapter() {
		this.list = new ArrayList<T>();
	}

	/***
	 * Limpa o Map
	 */
	@Override
	public void clear() {
		list.clear();
	}

	/***
	 * Informa se a Map contém uma chave.
	 * Operação não suportada pela classe.
	 */
	@Override
	public boolean containsKey(Object key) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Informa se a Map contém um valor.
	 */
	@Override
	public boolean containsValue(Object value) {
		return list.contains(value);
	}
	
	/***
	 * Compara este Map com outro objeto
	 */
	@Override
	public boolean equals(Object obj) {
		ListMapAdapter<T> lma = (ListMapAdapter<T>)obj;
		return list.equals(lma.list);
	}

	/***
	 * Retorna o valor associado a uma chave.
	 * Operação não suportada.
	 */
	@Override
	public T get(Object key) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Verifica se o Map está vazio.
	 */
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/***
	 * Adiciona uma chave e um valor associado.
	 */
	@Override
	public T put(Object key, T value) {
		list.add(value);
		return value;
	}

	/***
	 * Remove uma chave e o valor associado.
	 * Operação não suportada.
	 */
	@Override
	public T remove(Object key) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Verifica a quantidade de pares chave-valor
	 */
	@Override
	public int size() {
		return list.size();
	}
	
	/***
	 * Retorna a coleção de valores.
	 */
	@Override
	public Collection<T> values() {
		return list.subList(0, list.size());
	}
	
	/***
	 * Retorna um conjunto de objetos Entry que possuem chave e valor.
	 * Operação não suportada.
	 */
	@Override
	public Set<Entry<Object, T>> entrySet() {
		throw new UnsupportedOperationException();
	}

	/***
	 * Adiciona todos os valores de outra Map.
	 * Operação não suportada.
	 */
	@Override
	public void putAll(Map<? extends Object, ? extends T> m) {
		throw new UnsupportedOperationException();
	}

	/***
	 * Retorna um conjunto de chaves.
	 * Operação não suportada.
	 */
	@Override
	public Set<Object> keySet() {
		throw new UnsupportedOperationException();
	}
}