package Caser_Cipher;

public class Decryption {
    String s;
    int a;
    public Decryption(String s,int a){
        this.s=s;
        this.a=a;
    }
    public void getDep(){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if ((int) c >= (65+a) && (int) c <= 90) c -= a;
            else if ((int) c >= (97+a) && (int) c <= 122) c -= a;
            else if ((int) c >= 65 && (int) c <= (64+a)) c += (26-a);
            else if ((int) c >= 97 && (int) c <= (96+a)) c += (26-a);
            else if ((int) c == 32 ) c += 0;
            System.out.print((char) c );
        }
    }
}
