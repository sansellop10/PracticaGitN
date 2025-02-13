import java.util.Scanner;

public class PracticaGitN
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Cuantas filas quieres: ");
        int filas = in.nextInt();
        System.out.print("Cuantas columnas quieres: ");
        int columnas = in.nextInt();

        int[][] matriz = new int[columnas][filas];
        int indice = 0;
        int suma = 0;
        
        for(int i = 0; i < columnas; i++){
            for(int j = 0; j < filas; j++){
                indice++;
                matriz[i][j] = indice;
                suma += matriz[i][j];
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }

        double promedio = (double) suma / (columnas * filas);
        System.out.println("El promedio de todos los números es: " + promedio);
        in.close();
    }
}