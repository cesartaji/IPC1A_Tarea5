package lista;


import javax.swing.JOptionPane;

public class menu {
	public static void main(String[] args) {
		listacircular lista= new listacircular();
		int opcion=0, elemento;
		do{
		
				try{
					opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar nodo\n" + 
																				"2. Mostrar lista circular\n"+
																				"3. Salir\n" +
																				"Elegir opcion","Menú",JOptionPane.INFORMATION_MESSAGE));
					switch(opcion){
					case 1:
						elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese elemento", "Agregando",JOptionPane.INFORMATION_MESSAGE));
						lista.insertar(elemento);
						break;
					case 2:
						if(!lista.vacia()){
							lista.mostrar();
						} else {
							JOptionPane.showMessageDialog(null, "Sin nodos", "LIsta vacia", JOptionPane.INFORMATION_MESSAGE);
						}
					case 3:
						JOptionPane.showMessageDialog(null, "Salida", "Fin", JOptionPane.INFORMATION_MESSAGE);
						break;
						default:
							JOptionPane.showMessageDialog(null, "Seleccione correctamente", "error", JOptionPane.INFORMATION_MESSAGE);
					
					}
				}	 catch(NumberFormatException n){
					JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
				}
				
			
		}while(opcion!=3);
		
	}
}
