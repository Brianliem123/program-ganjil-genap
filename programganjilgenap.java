public class programganjilgenap{
    public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);
        int b = 2;
        int mod = nilai % b;

        System.out.println(nilai +" % " + b + "=" + mod);
        String hasil = nilai % 2 == 0 ? "Nilai genap" : "Nilai ganjil";
        System.out.println(hasil);
    
    }
}