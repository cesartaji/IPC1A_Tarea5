package circulardoble;
import javax.swing.JOptionPane;



public class listadoblecircular {

	nododoblecircular ultimo, primero;		
	public listadoblecircular(){
		primero=ultimo=null;
	}
	
	public boolean vacia(){
		return primero==null;
	}
	
	public listadoblecircular agregarfinal(int elemento){
		nododoblecircular nuevo = new nododoblecircular(elemento);
		if(ultimo!=null){
			nuevo.siguiente=ultimo.siguiente;
			ultimo.siguiente=nuevo;
	}
			ultimo= nuevo;
			return this;
	
	}
	
	public listadoblecircular agregarinicio(int elemento){
		nododoblecircular nuevo = new nododoblecircular(elemento);
		if(primero!=null){
			nuevo.siguiente=primero.siguiente;
			primero.siguiente=nuevo;
	}
			primero= nuevo;
			return this;
	
	}
	
	public void mostrariniciofin(){
		nododoblecircular auxilar= primero.siguiente;
		String cadena="";
		do{
			cadena = cadena + "[" + auxilar.dato + "] -- ";
			auxilar = auxilar.siguiente;
		}while(auxilar!=primero.siguiente);
				JOptionPane.showMessageDialog(null, cadena, "Mostrando la lista doble circular", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarfininicio(){
		nododoblecircular auxilar= primero.anterior;
		String cadena="";
		do{
			cadena = cadena + "[" + auxilar.dato + "] -- ";
			auxilar = auxilar.siguiente;
		}while(auxilar!=primero.anterior);
				JOptionPane.showMessageDialog(null, cadena, "Mostrando la lista doble circular", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
