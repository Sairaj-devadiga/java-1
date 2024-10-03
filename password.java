import java.util.Random;
public class password{
    public static void main(String[] args){
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String all=upper+lower+num;
        String s1="";
        Random rand1=new Random();
        int r1=rand1.nextInt(26);
        
        s1=s1+upper.substring(r1,r1+2)+lower.substring(r1,r1+4)+num.substring(r1%10,(r1%10)+2);
        System.out.println(s1);
    }
 }       