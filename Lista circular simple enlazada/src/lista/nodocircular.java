package lista;

public class nodocircular {
	int dato;
	nodocircular siguiente;
	
	public nodocircular(int d){
		dato = d;
		siguiente= this;
	}
	}

