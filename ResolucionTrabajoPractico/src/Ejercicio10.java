import java.util.Scanner;
/*
Ejercicio N° 10
Crear dos matrices de mxn y sumar sus valores, los resultados se deben almacenar en otra matriz.
Los valores y la longitud, serán insertados por el usuario. Mostrar las matrices originales y el
resultado.*/
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese fila");
		int m = sc.nextInt();
		System.out.println("Ingrese columna");
		int n = sc.nextInt();
		
		int [][] matriz = new int [m][n];
		int [][] matriz2 = new int [m][n];
		cargaMatriz(matriz,m,n);
		mostrarMatriz(matriz,m,n);
		cargaMatriz(matriz2,m,n);
		mostrarMatriz(matriz2,m,n);
		
		int [][] matriz3 = sumaMatrices(matriz,m,n,matriz2);
		mostrarMatriz(matriz3,m,n);
		
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
	
	public static int[][] sumaMatrices(int[][]matriz,int m,int n,int [][]matriz2)
	{
		int [][] matriz3 = new int [m][n];
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				matriz3[i][j]= matriz[i][j] + matriz2[i][j];
			}
		}
		return matriz3;
	}
}
