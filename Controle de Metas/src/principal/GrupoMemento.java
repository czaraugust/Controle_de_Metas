package principal;

public class GrupoMemento {
	protected Grupo estadoGrupo;
	
	public GrupoMemento(Grupo grupo){
		this.estadoGrupo = grupo;
	
	}
	
	public Grupo getGrupoSalvo(){
		return estadoGrupo;
	}

}
