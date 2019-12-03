public class main {

    public static void main(String[] args) {
        
    }

    public static void second (){
        int i = 1;
        boolean bul = true;
        char ch = '3';
        short sh = 2;
        long l = 3;
        double d = 3.0f;
        float fl = 23423;
        String s = "df";
    }

    public static float thrid (float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean fouth(int a, int b){
        return 10 <= a + b && a + b <= 20;
    }

    public static void fifth(int a){
        System.out.println(a < 0 ? "-" : "+");
    }

    public static boolean sixth(int i){
        return i < 0;
    }

    public static void seventh(String name){
        System.out.printf("Hey, %s!", name);
    }

    public static boolean eighth(int year){
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }
}
