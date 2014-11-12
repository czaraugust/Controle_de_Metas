package principal;
import java.util.ArrayList;
import java.util.HashMap;

public class Funcion�rio {
	
	public HashMap <String, Funcion�rio> listadefuncionarios;
	//ArrayList<Funcion�rio> listadefuncionarios= new ArrayList<Funcion�rio>();
		
		String name;
		String login;
		int senha;
		boolean isCoordinator = false;
		
		public Funcion�rio(String name, int senha, boolean isCoordinator, String nome) {
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
			Funcion�rio funcionario = new Funcion�rio(name, senha, isCoordinator, login);
			listadefuncionarios.put(login, funcionario);
				
		}
		
		
	
	
}
