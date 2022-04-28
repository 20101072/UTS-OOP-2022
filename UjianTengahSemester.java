
package ujiantengahsemester;

/**
 *
 * @author Cahya Kurnia 20101072
 */

import java.util.Scanner;

public class UjianTengahSemester {
    
    public String[] list;
  
      
    public String [] getList(){
        String[] returnList ={};
        if (this.list != null){
            if(this.list.length > 0){
               returnList =this.list;
            }
        } 
        return returnList;
    }
    
    public String addList (UjianTengahSemester list , String value){
        String array[] = new String [list.getList().length + 1];
        int i; 
        for (i = 0; i < list.getList().length; i++){
            array[i] = this.list[i];
        }
        array[i] = value;
        
        this.list = new String[array.length];
        for (i = 0; i < array.length; i++){
            this.list[i] = array[i];
        }
        return value;
        
    }
    static void aksi (UjianTengahSemester list){
        Scanner input = new Scanner (System.in);
        System.out.println("#### Daftar Pengunjung Kebun Binatang ####");
        System.out.println("1. Tampilkan Pengunjung");
        System.out.println("2. Isi Data Pengunjung");
        System.out.println("3. Keluar");
        System.out.println("##########################################");
        
        System.out.print("Pilihan menu :");
        System.out.print("");
        
        int menu  = input.nextInt ();
        
        if (menu == 1){
            if (list.getList().length > 0){
                for (int a = 0; a<list.getList().length;a++)
                    System.out.println(a+1 +"."+list.getList()[a]);
                    System.out.println("");
                    System.out.println (" Total Jumlah Pengunjung :"+list.getList().length+" pengunjung");
                    
            }else{
                    System.out.println("");
                    System.out.println("#### Daftar Pengunjung Kebun Binatang ####");
                    System.out.println("Belum ada data pengunjung");
                }          
               
       }else if (menu == 2){
            System.out.println("");
            System.out.println("Isi Data Pengunjung Kebun Binatang");
            System.out.print("Nama Pengunjung : ");
               Scanner sc = new Scanner(System.in);
               String nama = sc.nextLine();
               list.addList(list,nama);
               System.out.println("");
            System.out.println("Data telah ter record");
               
        }else{
            System.out.println("");
            System.out.println("Menu tidak ditemukan"); 
        }
        System.out.println("");
        System.out.print("Enter untuk melanjutkan...");      
    }
    
    public static void main(String[] args){
        UjianTengahSemester list = new UjianTengahSemester ();
        aksi (list);
        Scanner scanner = new Scanner (System.in);
        String readString = scanner.nextLine ();
        while (readString!=null){
            if (readString.isEmpty()){
                aksi (list);
            }
            
            if (scanner.hasNextLine()){
                readString = scanner.nextLine();
            }else {
                readString = null;
            }
        }
    }
}
        
        
        
        
   


