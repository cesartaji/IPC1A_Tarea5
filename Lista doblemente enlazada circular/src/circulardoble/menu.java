package circulardoble;

import javax.swing.JOptionPane;

public class menu {

	public static void main(String[] args) {
			listadoblecircular lista= new listadoblecircular();
			int opcion=0, elemento;
			do{
			
					try{
						opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar al inicio\n" + 
																					"2. Agregar al final\n" + 
																					"3. Mostrar lista de inicio a fin\n"+
																					"4. Mostrar lista de fin a inicio\n" +
																					"5. Salir\n" +
																					"Elegir opcion","Menú",JOptionPane.INFORMATION_MESSAGE));
						switch(opcion){
						case 1:
							elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese elemento", "Agregando",JOptionPane.INFORMATION_MESSAGE));
							lista.agregarinicio(elemento);
							break;
						case 2:
							elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese elemento", "Agregando",JOptionPane.INFORMATION_MESSAGE));
							lista.agregarfinal(elemento);
							break;
						case 3:
							if(!lista.vacia()){
								lista.mostrarfininicio();
								} else {
									JOptionPane.showInputDialog(null, "No hay nodos", "vacia",JOptionPane.INFORMATION_MESSAGE);
								}
							break;
						case 4:
							if(!lista.vacia()){
								lista.mostrariniciofin();
								} else {
									JOptionPane.showInputDialog(null, "No hay nodos", "vacia",JOptionPane.INFORMATION_MESSAGE);
								}
							break;
						case 5:
							JOptionPane.showMessageDialog(null, "Salida", "Fin", JOptionPane.INFORMATION_MESSAGE);
							break;
							default:
								JOptionPane.showMessageDialog(null, "Seleccione correctamente", "error", JOptionPane.INFORMATION_MESSAGE);
						
						}
					}	 catch(NumberFormatException n){
						JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
					}
					
				
			}while(opcion!=5);
			
		}


	}


