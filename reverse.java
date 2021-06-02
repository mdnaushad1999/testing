import java.util.Scanner;
class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String n=sc.next();

        String rev = "";
        for(int i = n.length()-1;i >= 0;i--){
            rev = rev + n.charAt(i);
        }

        System.out.println(rev);
    }
}