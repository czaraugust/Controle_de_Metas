package principal;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
public class Grupo {
	public HashMap<String, Grupo>  listadegrupos;


	private String nome;
	private ArrayList <Funcion�rio> membros;
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


	public ArrayList<Funcion�rio> getArray() {
		return membros;
	}

	public HashMap<String, Metas> getListademetas() {
		return listademetas;
	}
	void criarGrupo(String nome, Funcion�rio funcionario){	
		if (listadegrupos.containsKey(nome)){
			System.err.println("Grupo j� existente! Digite outro nome!");	
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
			System.err.println("Grupo informado n�o existe!");

		}
	}

	void addMembro (Funcion�rio membro, Grupo grupo){
		listadegrupos.get(grupo.getNome()).getArray().add(membro);
	}

	void removeMembro(Funcion�rio membro, Grupo grupo){
		listadegrupos.get(grupo.getNome()).getArray().remove(membro);
	}

	void addMeta(String grupo, String meta, String data, String criador){

		Metas metas = new Metas (grupo, meta, data, criador, 0);
		listadegrupos.get(grupo).getListademetas().put(meta, metas);

	}
	void excluiMetas (String meta, String grupo){

		listadegrupos.get(grupo).getListademetas().remove(meta);
	}
	
	void imprimirListaDeGrupos (Funcion�rio funcionario){
		Set<String> chaves = listadegrupos.keySet();  
		
        for (String chave : chaves)  
        {  
        		for (int i = 0; i< listadegrupos.get(chave).getArray().size(); i++){
        			if (listadegrupos.get(chave).getArray().get(i).getLogin() == funcionario.getLogin());
        			
        			System.out.println("Grupo " + listadegrupos.get(chave).getNome());
        		}              
        }  
				
	}
	void imprimirMetas( String grupo){
		
		Set<String> chaves = listadegrupos.get(grupo).getListademetas().keySet();
		
        for (String chave : chaves)  
        { 
        	System.out.println("Metas " + listademetas.get(chave).getMeta());
        
        }
		
	}
	
}
