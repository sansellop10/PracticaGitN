import java.util.Scanner;
public class PracticaGitN
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[10][10];
        int indice=0;
        for(int i = 0; i<10;i++){
            for(int j = 0; j<10; j++){
                indice ++;
                matriz[i][j] = indice;
                System.out. print(" "+matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

