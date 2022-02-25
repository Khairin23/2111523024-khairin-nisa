import java.util.ArrayList;
// nomor 5
public class remove {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("N");
        nama.add("I");
        nama.add("S");
        nama.add("A");
       
        System.out.println("ArrayList sebelum remove:");
        for(String var: nama){
             System.out.println(var);
        }

        //nama.remove(0);
        nama.remove(3);
        nama.remove(2);
        System.out.println("ArrayList setelah remove:");
           for(String var2: nama){
                 System.out.println(var2);
    
           }
    }
}
