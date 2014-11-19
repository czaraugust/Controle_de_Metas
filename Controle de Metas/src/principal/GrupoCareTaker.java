package principal;

import java.util.ArrayList;

public class GrupoCareTaker {


	protected static ArrayList<GrupoMemento>  estados = new ArrayList<GrupoMemento>();

	public GrupoCareTaker() {

		//this.estados = new  ArrayList<GrupoMemento>();
	}
	public void adicionarMemento (GrupoMemento memento){
		estados.add(memento);
	

	}
	public GrupoMemento getUltimoEstado(){
		if (estados.size() <=0){
			return null;
		}
		else{
		
			GrupoMemento  estadoSalvo = estados.get(estados.size() -1);
			estados.remove(estados.size() - 1);
			return estadoSalvo;
			
		}
	}


}
