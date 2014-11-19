/*package principal;

import java.util.ArrayList;

public class GrupoSubject {
	protected static ArrayList <DadosObserver> observers = new ArrayList<DadosObserver>();
	protected Grupo dados;
	public DadosSubject() {
        observers = new ArrayListDadosObserver>();
    }
 
    public void attach(DadosObserver observer) {
        observers.add(observer);
    }
 
    public void detach(int indice) {
        observers.remove(indice);
    }
    public void setState(Grupo dados) {
        this.dados = dados;
        notifyObservers();
    }
     
    private void notifyObservers() {
        for (DadosObserver observer : observers) {
            observer.update();
        }
    }
     
    public Grupos getState() {
        return dados;
    }

}*/
