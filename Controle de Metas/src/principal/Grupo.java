package principal;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
public  class Grupo implements GrupoProxyInterface{
	static public HashMap<String, Grupo>  listadegrupos = new HashMap<String, Grupo>();


	private String nome;
	private HashMap <String ,Funcionário> membros;
	private HashMap<String, Metas>  listademetas;
	GrupoCareTaker caretaker;


	public Grupo(String nome) {
		this.nome = nome;
		this.membros = new HashMap<String, Funcionário>();
		this.listademetas = new HashMap<>();
		caretaker = new GrupoCareTaker();


	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public HashMap<String, Funcionário> getArray() {
		return membros;
	}

	public HashMap<String, Metas> getListademetas() {
		return listademetas;
	}


	public void criarGrupo(String nome, Funcionário funcionario){	
		if (listadegrupos.containsKey(nome)){

		}
		else{
			Grupo grupo = new Grupo(nome);
			listadegrupos.put(nome, grupo);

			addMembro(funcionario, grupo);



		}

	}

	public void deletarGrupo(String nome){
		caretaker.adicionarMemento(new GrupoMemento(listadegrupos.get(nome)));
		listadegrupos.remove(nome); 
		System.out.println("Tamanho" +caretaker.estados.size());
		System.out.println("Nome" +caretaker.estados.get(caretaker.estados.size() -1).getGrupoSalvo().getNome());


	}

	public	void addMembro (Funcionário membro, Grupo grupo){


		listadegrupos.get(grupo.getNome()).getArray().put(membro.getNome(),membro );
	}

	public void removeMembro(Funcionário membro, String grupo){
		listadegrupos.get(grupo).getArray().remove(membro);
	}

	public	void addMeta(String grupo, String meta, String data, String criador){

		Metas metas = new Metas (grupo, meta, data, criador, "0");
		listadegrupos.get(grupo).getListademetas().put(meta, metas);

	}
	public  void excluiMetas (String meta, String grupo){

		listadegrupos.get(grupo).getListademetas().remove(meta);
	}
	public Grupo desfazer(){
		Grupo grupo;
		grupo = caretaker.getUltimoEstado().getGrupoSalvo();
		return grupo;
	}
	@Override
	public HashMap <String , Grupo> imprimirListaDeGrupos (Funcionário funcionario, int senha){

		Set<String> chaves = listadegrupos.keySet();
		HashMap<String , Grupo> auxiliar = new HashMap<>();

		for (String chave : chaves)  
		{  
			for (int i = 0; i< listadegrupos.get(chave).getArray().size(); i++){
				if (listadegrupos.get(chave).getArray().get(i).getLogin() == funcionario.getLogin());
				auxiliar.put(listadegrupos.get(chave).getNome(), listadegrupos.get(chave));

			}              
		}  

		return auxiliar;

	}
	void imprimirMetas( String grupo){

		Set<String> chaves = listadegrupos.get(grupo).getListademetas().keySet();

		for (String chave : chaves)  
		{ 
			System.out.println("Metas " + listademetas.get(chave).getMeta());
			System.out.println("Data " + listademetas.get(chave).getData());
			System.out.println("");
		}

	}

}
