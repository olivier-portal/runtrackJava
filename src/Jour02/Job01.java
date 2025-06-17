package Jour02;

public class Job01 {
    static int  toto = 0;
    Job01() {
            toto = toto + 1;
        }
        public static void main(String[] tutu) {
            Job01 tl = new Job01();
            Job01 t2 = new Job01();
            System.out.println("Toto: " +  toto);
        }
}
