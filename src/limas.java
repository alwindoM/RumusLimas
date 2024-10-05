import java.util.Scanner;
import java.text.DecimalFormat;

package rumuslimas;

public class limas
{
    public static void main(String[]args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("masukkan Tinggi, alas, sisi");
        double tinggi        = myObj.nextDouble();
        double alas          = myObj.nextDouble();
        double sisi          = myObj.nextDouble();
        double luas1;
        double volume1;
        double luas2;
        double volume2;

        DecimalFormat df = new DecimalFormat("###.0000");

        luas1 = (1.0/2.0*alas*tinggi)+ (3*(4*(1.0/2.0*alas*tinggi)));
        volume1 = (1.0/3.0*(1.0/2.0*alas*tinggi));

        luas2=(sisi*sisi)+(4*(1.0/2.0*alas*tinggi));
        volume2= 1.0/3.0*(sisi*sisi)* tinggi;

        System.out.println("Luas permukaan limas segitiga adalah\t: "+df.format(luas1));
        System.out.println("Volume limas segiitiga adalah\t: "+df.format(volume1));
        System.out.println("Luas permukaan limas segiempat adalah: "+df.format(luas2));
        System.out.println("Volume limas segiempat adalah \t: "+df.format(volume2));
    }
}