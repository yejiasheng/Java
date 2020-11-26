//凯撒加密，位数n可以自行选择
package Caser_Cipher;
import java.util.*;
public class main {
    public static void main(String[] args) {
        System.out.println("please input the statement：");
        Scanner a=new Scanner(System.in);
        String s=a.nextLine();
        System.out.println("Encrypt the statement,please input 0;Decrypt the statement,please input 1:");
        Scanner b=new Scanner(System.in);
        int i=a.nextInt();
        System.out.println("Please input the digits:");
        Scanner c=new Scanner(System.in);
        int j=a.nextInt();
        if(i==0) {
            Encryption ecp = new Encryption(s,j);
            ecp.getEcp();
            }
        else if(i==1){
            Decryption ecp = new Decryption(s,j);
            ecp.getDep();
        }
        else System.out.println("Error!!!");
        }
    }

