import java.util.ArrayList;
//nomor 3
public class get {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("N");
        nama.add("I");
        nama.add("S");
        nama.add("A");
       
        System.out.println(nama.get(0));
        System.out.println(nama.get(2));
        System.out.println(nama.get(6));
        System.out.println(nama.get(-3));

    }
}
