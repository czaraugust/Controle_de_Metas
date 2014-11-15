package principal;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
public  class Grupo implements GrupoInterface{
	static public HashMap<String, Grupo>  listadegrupos = new HashMap<String, Grupo>();


	private String nome;
	private ArrayList <Funcionário> membros;
	private HashMap<String, Metas>  listademetas;


	public Grupo(String nome) {
		this.nome = nome;
		this.membros = new ArrayList<>();
		this.listademetas = new HashMap<>();

	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public ArrayList<Funcionário> getArray() {
		return membros;
	}

	public HashMap<String, Metas> getListademetas() {
		return listademetas;
	}
	void criarGrupo(String nome, Funcionário funcionario){	
		if (listadegrupos.containsKey(nome)){
			System.err.println("Grupo já existente! Digite outro nome!");	
		}
		else{
			Grupo grupo = new Grupo(nome);
			grupo.membros.add(funcionario);
			listadegrupos.put(nome, grupo);

			System.out.println("Grupo criado com sucesso!");
		}

	}

	void deletarGrupo(String nome){
		if (listadegrupos.containsKey(nome)){
			listadegrupos.remove(nome);
			System.out.println("Grupo removido com sucesso!");
		}
		else{		
			System.err.println("Grupo informado não existe!");

		}
	}

	void addMembro (Funcionário membro, Grupo grupo){
		listadegrupos.get(grupo.getNome()).getArray().add(membro);
	}

	void removeMembro(Funcionário membro, Grupo grupo){
		listadegrupos.get(grupo.getNome()).getArray().remove(membro);
	}

	void addMeta(String grupo, String meta, String data, String criador){

		Metas metas = new Metas (grupo, meta, data, criador, 0);
		listadegrupos.get(grupo).getListademetas().put(meta, metas);

	}
	void excluiMetas (String meta, String grupo){

		listadegrupos.get(grupo).getListademetas().remove(meta);
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
