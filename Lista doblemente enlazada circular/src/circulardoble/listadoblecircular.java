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
	
	public listadoblecircular agregarfinal(int ele){
		nododoblecircular nuevo = new nododoblecircular(ele);
		if(ultimo!=null){
			nuevo.anterior=ultimo.anterior;
			ultimo.anterior=nuevo;
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
		nododoblecircular auxilar= ultimo.siguiente;
		String cadena="";
		do{
			cadena = cadena + "[" + auxilar.dato + "] -- ";
			auxilar = auxilar.siguiente;
		}while(auxilar!=ultimo.siguiente);
				JOptionPane.showMessageDialog(null, cadena, "Mostrando la lista doble circular", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
