package principal;

import java.util.ArrayList;

public class GrupoCareTaker {


<<<<<<< HEAD
	protected ArrayList<GrupoMemento>  estados;

	public GrupoCareTaker() {

		estados = new ArrayList<GrupoMemento>();
	}
	public void adicionarMemento (GrupoMemento memento){
		estados.add(memento);
=======
	protected static ArrayList<GrupoMemento>  estados = new ArrayList<GrupoMemento>();

	public GrupoCareTaker() {

		//this.estados = new  ArrayList<GrupoMemento>();
	}
	public void adicionarMemento (GrupoMemento memento){
		estados.add(memento);
	
>>>>>>> origin/master

	}
	public GrupoMemento getUltimoEstado(){
		if (estados.size() <=0){
			return null;
		}
		else{
<<<<<<< HEAD
			GrupoMemento estadoSalvo = estados.get(estados.size() - 1);
			estados.remove(estados.size() - 1);
			return estadoSalvo;
=======
		
			GrupoMemento  estadoSalvo = estados.get(estados.size() -1);
			estados.remove(estados.size() - 1);
			return estadoSalvo;
			
>>>>>>> origin/master
		}
	}


}
