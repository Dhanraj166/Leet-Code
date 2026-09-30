
public class BinaryToDecimal {
    public static void main(String[] args) {
        
        System.out.println(demo1());
        System.out.println(demo2());
    }

    public static int demo1(){
        int binary = 1010;
        int decimal = 0;
        int power = 1;

        while(binary>0){
            int digit = binary % 10;
            decimal = decimal + (power * digit);
            power = power * 2;
            decimal = decimal / 10;
        }

        return decimal;
    }

    public static int demo2() {
        int decimal = 14;
        int binary = 0;
        int place = 0;
        
        while (decimal>0) {
            int reminder = decimal % 2;
            binary = binary + (reminder * place);
            place = place * 10;
            decimal = decimal / 2;
        }

        return binary;
    }
}
