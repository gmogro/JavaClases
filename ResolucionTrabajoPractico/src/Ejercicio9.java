import java.util.Scanner;

/*
 * Ejercicio N° 9
Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la
matriz.*/
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int [3][3];
		cargaMatriz(matriz,3,3);
		mostrarMatriz(matriz,3,3);
	}
	public static void cargaMatriz(int [][] matriz,int m ,int n) 
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				System.out.println("INGRESA UN NUMERO ");
				int num = sc.nextInt();
				matriz[i][j]= num;
			}
		}
	}
	
	public static void mostrarMatriz(int [][] matriz,int m ,int n) 
	{
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
}
