package volume_luas_bola;

public class formula {
    public float jari;
    public float phi;
    public float hasil;
    
    public float rumusvol(){
        float volume;
        volume = jari*jari*jari;
        hasil = volume;
        return volume;
    }
    
    public float rumusluas(){
        float luas;
        luas = jari*jari; 
        hasil = luas;
        return luas;
   }
}
