import java.io.*;
public class InputKeyboard {
    public static String inputString(){
        int karakter; String str = ""; boolean selesai = false;
        while (!selesai){
            try{
                karakter = System.in.read();
                if (karakter < karakter ="") selesai = true;
                else if ((char)karakter !='\r')str = str + (char)karakter;
            }
            catch(java.io.IOException e){
                System.out.println("Ada kesalahan");
                selesai = true;
            }
        }
        return str;
    }
    
}
