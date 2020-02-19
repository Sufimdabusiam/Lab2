package Aiub.Lab2;

public class P8Array2D {
    public static void main(String[]args){
        
        char [][] a=new char[3][4];
        a[0][0]='1';
        a[0][1]='2';
        a[0][2]='3';
        a[0][3]='A';
        a[1][0]='1';
        a[1][1]='2';
        a[1][2]='B';
        a[1][3]='C';
        a[2][0]='1';
        a[2][1]='A';
        a[2][2]='B';
        a[2][3]='C';
        int n=3;
        for(int i=0;i<3;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            n--;
            System.out.println();
        }
        n=3;
        for(int i=0;i<3;i++)
        {
            for(int j=n;j<4;j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            n--;
            System.out.println();
        }
    }
    
}
