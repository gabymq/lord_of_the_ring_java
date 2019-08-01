// public class arreglo
// {
	 
// 	public static void main(String[] args)
// 	{
// 		System.out.println("\n Arreglos de Arreglos\n");
// 		int [][] tabla = new int [4][4];
// 		int x= 5;
// 		int cuad= 2*2;
// 		int cubo= 2*2*2;
// 		for(int a=0;a<4;a++)
// 		{
// 			for (int b=0;b<4;b++) 
// 			{
// 				if(a==0 && b==0)
// 				{
// 					tabla[0][0]= x;
// 				}
// 				else if (a==0 &&  b==1)
// 				{
// 					tabla[0][1]=(x*2)+1;	
// 				}
// 				else if (a==0 && b==2)
// 				{
// 					tabla[0][2]=(x*(cuad))+2;
// 				}
// 				else if (a==0 && b==3)
// 				{
// 					tabla[0][3]= (x*(cubo)+3);	
// 				}
// 				else if (a==1 && b==0)
// 				{
// 					tabla[1][0]=x+1;	
// 				}
// 				else if (a==1 && b==1) 
// 				{
// 					tabla[1][1]=x*2;
// 				}
// 				else if (a==1 && b==2) 
// 				{
// 					tabla[1][2]= (x*(cuad))+1;
// 				}
// 				else if (a==1 && b==3) 
// 				{
// 					tabla[1][3]= (x*(cubo)+2);
// 				}
// 				else if (a==2 && b==0) 
// 				{
// 					tabla[2][0]= x+2;
// 				}
// 				else if (a==2 && b==1) 
// 				{
// 					tabla[2][1]=tabla[0][1];
// 				}
// 				else if (a==2 && b==2) 
// 				{
// 					tabla[2][2]= x*cuad;
// 				}
// 				else if (a==2 && b==3) 
// 				{
// 					tabla[2][3]=(x*cubo)+1;
// 				}
// 				else if (a==3 && b==0) 
// 				{
// 					tabla[3][0]= x+3;
// 				}
// 				else if (a==3 && b==1) 
// 				{
// 					tabla[3][1]= (x*2)+2;
// 				}
// 				else if (a==3 && b==2) 
// 				{
// 					tabla[3][2]=(x*cuad)+1;
// 				}
// 				else if (a==3 && b==3) 
// 				{
// 					tabla[3][3]= x*cubo;
// 				}
// 				else
// 				{
// 					System.out.println("No Existe en la memoria");
// 				}
// 				System.out.println("En poosicion " + a + " y " + b +" esta guardada el valor " +tabla[a][b]);

// 			}
// 		}
// 				System.out.println("***************************************************");
// 				System.out.println(" "+tabla[0][0]+" "+tabla[0][1]+" "+tabla[0][2]+" " +tabla[0][3]);
// 				System.out.println(" "+tabla[1][0]+" "+tabla[1][1]+" "+tabla[1][2]+" " +tabla[1][3]);
// 				System.out.println(" "+tabla[2][0]+" "+tabla[2][1]+" "+tabla[2][2]+" " +tabla[2][3]);
// 				System.out.println(" "+tabla[3][0]+" "+tabla[3][1]+" "+tabla[3][2]+" " +tabla[3][3]);
// 	}
// }