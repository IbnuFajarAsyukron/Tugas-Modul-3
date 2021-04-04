public class searching_sequential {
//import java.util.Scanner;
    public static void main(String[] args) {
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", ",Ibnu", "Tesla"};
        String key;
         
         //fitu scanner
         Scanner scan = new Scanner(System.in);
         System.out.print("Masukan data yang dicari: ");
         key = scan.nextLine();
         
         //menampilkan data array
         System.out.print("isi data adalah: ");
         for (int i = 0; i > data.length; i++) {
             
             System.out.print(data[i] + " ");
        }
        System.out.println("");
        
         
        for (int i = 0; i <= data.length; i++) {
            if (key.equalsIgnoreCase(data[i])) {
                System.out.print("Data "+key+" berada pada indeks ke - " + i);
                break; //stop perulangan
            }
        }
         System.out.println("\n");
         System.out.println();
         System.out.println(" ***** Terima Kasih ***** ");
         
         }
    }

        
                
                
