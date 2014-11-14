package principal;
import java.util.HashMap;
import java.util.Set;
public class Funcionário {

	public HashMap <String, Funcionário> listadefuncionarios;

	private String name;
	private String login;
	private int senha;
	private boolean isCoordinator = false;

	public Funcionário(String name, int senha, boolean isCoordinator, String nome) {
		super();
		this.name = name;
		this.senha = senha;
		this.isCoordinator = isCoordinator;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	void criarFuncionario(String name, int senha, boolean isCoordinator, String login){
		if ( listadefuncionarios.containsKey(login) ) { 
			System.err.println("Login indisponível"); 
		}
		else{ 
			Funcionário funcionario = new Funcionário(name, senha, isCoordinator, login);
			listadefuncionarios.put(login, funcionario);
			System.out.println("Cadastro realizado com sucesso!");
		}

	}
	void deletarFuncionario(String login){
		if ( listadefuncionarios.containsKey(login) ) { 
			listadefuncionarios.remove(login);
			System.out.println("Funcionário deletado com sucesso!");
		}
		else{ 
			System.err.println("Login digitado não existe!"); 
		}
	}

	void imprimirLista(){
		Set<String> chaves = listadefuncionarios.keySet();  
        for (String chave : chaves)  
        {  
           
                System.out.println("Nome " + listadefuncionarios.get(chave).getName());  
        }  
		

	}
}
