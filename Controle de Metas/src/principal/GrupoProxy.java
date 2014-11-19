package principal;

import java.util.HashMap;

public class GrupoProxy implements GrupoProxyInterface{
	private Grupo grupo;
	
	@Override
	public HashMap<String, Grupo> imprimirListaDeGrupos (Funcionário funcionario, int senha) {
		if (funcionario.getSenha() == senha ){
			
			
			return grupo.imprimirListaDeGrupos(funcionario, senha);
		}
		else{
			return null;
		}
		
		
	}
}
