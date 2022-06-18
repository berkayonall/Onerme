import java.util.Scanner;

public class Onerme {
    public static void main(String[] args) {

        int sicaklik ;
        Scanner input = new Scanner(System.in);

        System.out.println("Hava Bugün Kaç Derece :");
        sicaklik = input.nextInt();

        if (sicaklik < 5 ){
            System.out.println("Kayak yapmaya gitmelisin");
        } else if (6>=sicaklik || sicaklik<=15){
            System.out.println("Sinemaya gidilir bak bu havada");
        }
        else if (sicaklik>=16 && sicaklik<=30){
            System.out.println("Çık gez aga bu havada napcan evde");
        }
        else if (sicaklik>=31){
            System.out.println("Evde otur bu havada çıkılmaz!!!");
        }


    }
}
