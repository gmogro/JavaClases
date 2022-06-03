import java.util.ArrayList;;
public class clsVector {
	private ArrayList vector;
	private int tamaño;
	
	public clsVector(){
		ArrayList vector=new ArrayList();
		setTamaño(0);
	}
	public clsVector(int tamaño){
		ArrayList vector=new ArrayList(tamaño);
		setTamaño(tamaño);
	}
	public int getTamaño(){
		return this.tamaño;
	}
	public void setTamaño(int tamaño){
		this.tamaño=tamaño;
	}
	public int getSumaVector(){
			return sumaVector(getTamaño());
	}
	public int sumaVector(int tamaño){
		if(getTamaño()==-1)
				return 0;
		else if((int)vector.get(getTamaño())%2!=0)
					return (int)vector.get(getTamaño())+sumaVector(getTamaño()-1);
			 else return sumaVector(getTamaño()-1);
	}
	
	public void ordenaVector(){
		int aux,menor;
		for(int i=0;i<getTamaño();i++){
			aux=(int)vector.get(i);
			menor=posdelmenor(i);
			vector.add(this.vector.get(menor));
			vector.add(aux);
	}		
 }
	public int posdelmenor(int desde){
		if(desde==getTamaño()-1){return desde;}
		else{int men=posdelmenor(desde+1);
		     if((int)this.vector.get(desde)<(int)this.vector.get(men))return desde;
		     else return men;
		}
	}
	
}//fin clase
