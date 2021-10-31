
import java.util.Scanner;


	class rumuslv {
 	final double pi = 3.14;
  	double luas;
  	int volume;
  
  //Method Luas Lingkaran
  void luasling (int r){
  	luas = (pi*r*r);
   System.out.println("Luas lingkaran Anda :" + luas);
  }
  
  
    //Method Volume Kubus
  void volumkub (int s){
  	volume = (s*s*s);
   System.out.println("volume kubus Anda :" + volume);
  }
  
}

public class teori4_soal1 {
	
	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		int jarilingkaran, sisikubus;
		
		//Proses Instansiasi Objeck luaslingkaran dan volumekubus 
		rumuslv luaslingkaran = new rumuslv();
		rumuslv volumekubus = new rumuslv();
		//Proses Instansiasi Objeck luaslingkaran dan volumekubus
		
		
	System.out.println("soal 1. Aplikasi class dan object mencari luas lingkaran, dan volume kubus yang ada proses penginputan");
	System.out.println();
		
		//Proses Input Nilai luaslingkaran dan volumekubus 
	System.out.print("Masukkan nilai jari-jari lingkaran : ");
		jarilingkaran = input.nextInt();
		luaslingkaran.luasling(jarilingkaran);	
	System.out.println();
	System.out.print("Masukkan nilai Sisi Volume Kubus  : ");
		sisikubus = input.nextInt();
		volumekubus.volumkub(sisikubus);
		
		
	}
		
}