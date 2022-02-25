import java.util.ArrayList;
//nomor 6
public class add {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("N");
        nama.add("I");
        nama.add("S");
        nama.add("A");
       
        nama.add(0,"e");
        System.out.println(nama);
        nama.add(2,"f");
        System.out.println(nama);
        nama.add(3,"g");
        System.out.println(nama);
        nama.add(4,"h");  
        System.out.println(nama);
        nama.add(6,"h");
        System.out.println(nama);
        nama.add(-3,"h");
        System.out.println(nama);
        
    }
}
