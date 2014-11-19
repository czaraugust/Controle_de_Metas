package principal; 

public class MetasSubject implements MetasObserver {
	String grupo, meta, data, criador;
	String porcentagem;



	public MetasSubject(String grupo, String meta, String data, String criador,  String porcentagem) {
		super();
		this.grupo = grupo;
		this.meta = meta;
		this.data = data;
		this.criador = criador;
		this.porcentagem = porcentagem;
		

	}
	
	public String getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(String porcentagem) {
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
