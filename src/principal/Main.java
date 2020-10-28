package principal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import adapter.ListMapAdapter;
import adapter.MapListAdapter;

public class Main {
	
	public static void main(String[] args) {
		
		// Opera��es com Map usando ListMapAdapter
		Map<Object, String> mapAdapter = new ListMapAdapter<String>();
		Map<Object, String> mapAdapter2 = new ListMapAdapter<String>();
		mapAdapter.put(1, "Rafael");
		mapAdapter2.put(1, "Rafael");
		
		System.out.println("Map com o adapter: "+mapAdapter.getClass().getName());
		System.out.println("Map 2 com o adapter: "+mapAdapter2.getClass().getName());
		System.out.println("\tMaps iguais? "+(mapAdapter.equals(mapAdapter2)?"Sim":"N�o"));
		
		System.out.println("\nNome adicionado: "+mapAdapter.put(002, "Otavio"));
		System.out.println("\tCont�m o nome Otavio? "+(mapAdapter.containsValue("Otavio")?"Sim":"N�o"));
		System.out.println("\tTamanho do Map: "+mapAdapter.size());
		
		System.out.println("\nValores contidos: "+mapAdapter.values());
		
		System.out.println("\nLimpando Map:");
		mapAdapter.clear();
		System.out.println("\tMap vazia? "+(mapAdapter.isEmpty()?"Sim":"N�o"));
		
		System.out.println("\n\n");
		
		// Opera��es com List usando MapListAdapter
		List<String> listAdapter = new MapListAdapter<String>();
		List<String> listAdapter2 = new MapListAdapter<String>();
		listAdapter.add("Rafael");
		listAdapter.add("Jos�");
		listAdapter2.add("Rafael");
		listAdapter2.add("Jos�");
		
		System.out.println("List 1 com o adapter: "+listAdapter.getClass().getName());
		System.out.println("List 2 com o adapter: "+listAdapter2.getClass().getName());
		System.out.println("\tListas iguais? "+(listAdapter.equals(listAdapter)?"Sim":"N�o"));
		
		System.out.println("\nAdicionando o nome Otavio:");
		listAdapter.add("Otavio");
		System.out.println("\tCont�m o nome Otavio? "+(listAdapter.contains("Otavio")?"Sim":"N�o"));
		System.out.println("\tCont�m o nome Rafael? "+(listAdapter.contains("Rafael")?"Sim":"N�o"));
		System.out.println("\tTamanho da List: "+listAdapter.size());
		
		System.out.println("\nRemovendo Jos�: "+(listAdapter.remove("Jos�")?"Removido.":"Falha"));
		System.out.println("\tCont�m o nome Jos�? "+(listAdapter.contains("Jos�")?"Sim":"N�o"));
		System.out.println("\tTamanho da List: "+listAdapter.size());
		
		System.out.println("\nRepresenta��o em Array: "+Arrays.toString(listAdapter.toArray()));
		
		System.out.println("\nIterando sobre a List:");
		Iterator<String> it = listAdapter.iterator();
		while(it.hasNext()) {
			System.out.println("\tNome: "+it.next());
		}
		
		System.out.println("\nLimpando List:");
		listAdapter.clear();
		System.out.println("\tList vazia? "+(listAdapter.isEmpty()?"Sim":"N�o"));		
	}
}
