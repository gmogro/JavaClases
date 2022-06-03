import java.util.ArrayList;;
public class clsVector {
	private ArrayList vector;
	private int tama�o;
	
	public clsVector(){
		ArrayList vector=new ArrayList();
		setTama�o(0);
	}
	public clsVector(int tama�o){
		ArrayList vector=new ArrayList(tama�o);
		setTama�o(tama�o);
	}
	public int getTama�o(){
		return this.tama�o;
	}
	public void setTama�o(int tama�o){
		this.tama�o=tama�o;
	}
	public int getSumaVector(){
			return sumaVector(getTama�o());
	}
	public int sumaVector(int tama�o){
		if(getTama�o()==-1)
				return 0;
		else if((int)vector.get(getTama�o())%2!=0)
					return (int)vector.get(getTama�o())+sumaVector(getTama�o()-1);
			 else return sumaVector(getTama�o()-1);
	}
	
	public void ordenaVector(){
		int aux,menor;
		for(int i=0;i<getTama�o();i++){
			aux=(int)vector.get(i);
			menor=posdelmenor(i);
			vector.add(this.vector.get(menor));
			vector.add(aux);
	}		
 }
	public int posdelmenor(int desde){
		if(desde==getTama�o()-1){return desde;}
		else{int men=posdelmenor(desde+1);
		     if((int)this.vector.get(desde)<(int)this.vector.get(men))return desde;
		     else return men;
		}
	}
	
}//fin clase
