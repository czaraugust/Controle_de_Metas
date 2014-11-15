package principal;
import java.util.HashMap;
import java.util.Set;

public class Funcion�rio {

	static public HashMap <String, Funcion�rio> listadefuncionarios = new HashMap<String, Funcion�rio>();
	private String nome;
	private String login;
	private int senha;
	private boolean isCoordinator = false;

	public Funcion�rio(String nome, int senha, boolean isCoordinator, String login ){
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.isCoordinator = isCoordinator;

	}
	public String getNome() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public boolean isCoordinator() {
		return isCoordinator;
	}
	public void setCoordinator(boolean isCoordinator) {
		this.isCoordinator = isCoordinator;
	}

	public String criarFuncionario(Funcion�rio funcionario){
		String texto = null;
		if ( listadefuncionarios.containsKey(funcionario.getLogin()) ) { 
			texto = "Usu�rio indispon�vel"; 
		}
		else{ 
			listadefuncionarios.put(funcionario.getLogin(), funcionario);
			texto ="Cadastro realizado com sucesso!";
		}
		return texto;

	}
	public String deletarFuncionario(String login){
		String texto = null;
		if ( listadefuncionarios.containsKey(login) ) { 
			listadefuncionarios.remove(login);
			texto = "Funcion�rio deletado com sucesso!";
		}
		else{ 
			texto = "Login digitado n�o existe!"; 
		}
		return texto;
	}

	void imprimirLista(){
		Set<String> chaves = listadefuncionarios.keySet();  
		for (String chave : chaves)  
		{  

			System.out.println("Nome " + listadefuncionarios.get(chave).getNome());  
		}  


	}
}
