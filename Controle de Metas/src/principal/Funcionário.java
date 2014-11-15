package principal;
import java.util.HashMap;
import java.util.Set;

public class Funcionário {

	static public HashMap <String, Funcionário> listadefuncionarios = new HashMap<String, Funcionário>();
	private String nome;
	private String login;
	private int senha;
	private boolean isCoordinator = false;

	public Funcionário(String nome, int senha, boolean isCoordinator, String login ){
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

	public String criarFuncionario(Funcionário funcionario){
		String texto = null;
		if ( listadefuncionarios.containsKey(funcionario.getLogin()) ) { 
			texto = "Usuário indisponível"; 
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
			texto = "Funcionário deletado com sucesso!";
		}
		else{ 
			texto = "Login digitado não existe!"; 
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
