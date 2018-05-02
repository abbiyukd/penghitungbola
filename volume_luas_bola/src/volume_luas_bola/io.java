package volume_luas_bola;
import java.util.Scanner;

public class io {
    float volume;
    float luas;
    float phi;
    float jari;
    formula ope;
    
    public io(){
        ope = new formula();
        inputData();
    }
    public void inputData(){
        Scanner scan = new Scanner (System.in);
        System.out.print ("Masukan Nilai Jari-jari : ");
        jari = scan.nextInt();
        ope.jari = this.jari;
    }
    
    public void io(){
        volume = (float) 3.14*4/3*ope.rumusvol();
        luas =(float) 3.14*4*ope.rumusluas();
    }
    public void hasilvolume(){
        System.out.println("Volume Bola = "+volume);
    } 
    public void hasilluaspermukaan(){
        System.out.println("Luas Permukaan Bola = "+luas);
    }
}
