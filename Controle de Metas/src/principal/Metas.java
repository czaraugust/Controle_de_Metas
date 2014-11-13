package principal;
import java.util.ArrayList;
//import java.util.HashMap; 

public class Metas {
	String grupo, meta, data, criador;
	int porcentagem;
	private ArrayList <String> comentarios;
	
	
	public Metas(String grupo, String meta, String data, String criador,  int porcentagem) {
		super();
		this.grupo = grupo;
		this.meta = meta;
		this.data = data;
		this.criador = criador;
		this.porcentagem = porcentagem;
		comentarios = new ArrayList<>();
		
	}
	public ArrayList<String> getComentarios() {
		return comentarios;
	}
	public void setComentarios(ArrayList<String> comentarios) {
		this.comentarios = comentarios;
	}
	public int getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}
	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	

}
