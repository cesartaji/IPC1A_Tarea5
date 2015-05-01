import javax.swing.JOptionPane;


public class listadoble {
	private nododoble inicio, fin;
	public listadoble(){
		inicio=fin=null;
	}
	
	public boolean vacia(){
		return inicio==null;
		
	}
	
	public void agregarfinal(int el){
		if(!vacia()){
			fin=new nododoble(el, null, fin);
			fin.anterior.siguiente = fin;
		} else {
			inicio=fin=new nododoble(el);
		}
	}
	
	public void agregarinicio(int el){
		if(!vacia()){	
			inicio=new nododoble(el, inicio, null);
			inicio.siguiente.anterior = inicio;
		} else {
			inicio=fin=new nododoble(el);
		}
	}
	
	public void mostrariniciofin(){
		if(!vacia()){
			String datos = " -- ";
			nododoble auxiliar=inicio;
			while(auxiliar!=null){
				datos = datos +"[" + auxiliar.dato + "] --";
				auxiliar=auxiliar.siguiente;
				
			}
			JOptionPane.showMessageDialog(null, datos, "Mostrando lista de inicio  a fin",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void mostrarfininicio(){
		if(!vacia()){
			String datos = " -- ";
			nododoble auxiliar=fin;
			while(auxiliar!=null){
				datos = datos +"[" + auxiliar.dato + "] --";
				auxiliar=auxiliar.anterior;
				
			}
			JOptionPane.showMessageDialog(null, datos, "Mostrando lista de inicio  a fin",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
