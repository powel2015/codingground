import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class cloud{
    public FileInputStream fis;
    public cloud(){
        
    }
    public void corner(){
        try{
            fis=new FileInputStream("gjhgi.txt");
        }catch(IOException fnot){
            fnot.printStackTrace();
        }
    }
     public static void main(String []args){
        System.out.println("Hello World");
     }
}
