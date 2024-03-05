import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {

	public static void main(String[] args) {
	
		int elemanSayisi ;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Eleman sayısını giriniz : ");
		
		elemanSayisi = scanner.nextInt();
		
		int[] dizi = new int[elemanSayisi];   
	    
		for (int i=0 ; i<elemanSayisi ; i++) {
			
			System.out.print(i+1+". elemanı giriniz : ");
			
			dizi[i]=scanner.nextInt();	
		}
		
		Arrays.sort(dizi);
		
		System.out.print("Sıralama : ");
		
		for (int j : dizi) {
			System.out.print(j+" ");
		}
	}
}
	

