package circulardoble;

public class nododoblecircular {
	public int dato;
	nododoblecircular siguiente,anterior;
	
	
	public nododoblecircular(int el){
		dato=el;
		siguiente=this;
		anterior=this;
}
}