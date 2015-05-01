
public class nododoble {
	public int dato;
	nododoble siguiente,anterior;
	
	public nododoble(int el){
		this(el, null, null);
	}
	
	public nododoble(int el, nododoble s, nododoble a){
		dato=el;
		siguiente=s;
		anterior=a;
	}
	
}
