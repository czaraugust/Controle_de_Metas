package principal;

public class GrupoMemento {
	protected Grupo estadoGrupo;
	
	public GrupoMemento(Grupo grupo){
		estadoGrupo = grupo;
	
	}
	
	public Grupo getGrupoSalvo(){
		return estadoGrupo;
	}

}
