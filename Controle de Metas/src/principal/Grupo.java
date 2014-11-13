package principal;
import java.util.HashMap;
import java.util.ArrayList;
public class Grupo {
	public HashMap<String, Grupo>  listadegrupos;
	private String nome;
	private ArrayList <Funcion�rio> array;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Funcion�rio> getArray() {
		return array;
	}

	public Grupo(String nome) {
		this.nome = nome;
		ArrayList <Funcion�rio> array = new ArrayList<>();

	}

	void criarGrupo(String nome, Funcion�rio funcionario){	
		if (listadegrupos.containsKey(nome)){
			System.err.println("Grupo j� existente! Digite outro nome!");	
		}
		else{
			Grupo grupo = new Grupo(nome);
			grupo.array.add(funcionario);
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
}