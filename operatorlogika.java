public class operatorlogika{
    public static void main(String[] args) {
        //AND

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        //OR

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        //NOT

        System.out.println(!true);
        boolean hujan = true;
        System.out.println(!hujan);
        // kombinasi dengan operator perbandingan
        System.out.println(!hujan && true || 10 > 15);
        int nilai = 100;
        System.out.println(nilai >= 80 && nilai <= 100);
    }
}
