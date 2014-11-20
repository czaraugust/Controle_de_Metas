package principal;

public class GrupoMemento {
	protected Grupo estadoGrupo;
	
	public GrupoMemento(Grupo grupo){
<<<<<<< HEAD
		estadoGrupo = grupo;
=======
		this.estadoGrupo = grupo;
>>>>>>> origin/master
	
	}
	
	public Grupo getGrupoSalvo(){
		return estadoGrupo;
	}

}
