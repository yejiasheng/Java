package Caser_Cipher;

public class Encryption {
    String s;
    int a;
    public Encryption(String s,int a){
        this.s=s;
        this.a=a;
    }
    public void getEcp(){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if ((int) c >= (91-a) && (int) c <= 90) c -= (26-a);
            else if ((int) c >= (123-a) && (int) c <= 122) c -= (26-a);
            else if ((int) c >= 65 && (int) c <= (90-a)) c += a;
            else if ((int) c >= 97 && (int) c <= (122-a)) c += a;
            else if ((int) c == 32 ) c += 0;
            System.out.print((char) c );
        }
    }
}
