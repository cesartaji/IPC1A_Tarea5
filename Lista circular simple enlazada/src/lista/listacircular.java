package lista;

import javax.swing.JOptionPane;

public class listacircular {

		nodocircular ultimo;		
		public listacircular(){
			ultimo=null;
			
		}
			
		public boolean vacia(){
			return ultimo==null;
		}
		
		public listacircular insertar(int elemento){
			nodocircular nuevo = new nodocircular(elemento);
			if(ultimo!=null){
				nuevo.siguiente=ultimo.siguiente;
				ultimo.siguiente=nuevo;
		}
				ultimo= nuevo;
				return this;
		
		}
		
		public void mostrar(){
			nodocircular auxilar= ultimo.siguiente;
			String cadena="";
			do{
				cadena = cadena + "[" + auxilar.dato + "] -- ";
				auxilar = auxilar.siguiente;
			}while(auxilar!=ultimo.siguiente);
					JOptionPane.showMessageDialog(null, cadena, "Mostrando la lista circular", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
}

		
	


