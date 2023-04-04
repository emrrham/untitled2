public class Main {

    static boolean isPalindrom(int number){
        int temp = number,reverseNumber = 0,lastNumber;
        while (temp != 0 ){
            lastNumber =  temp % 10;
            System.out.println("LastNumber" + lastNumber);
            reverseNumber = (reverseNumber*10) + lastNumber;
            System.out.println("new number" + reverseNumber);
            temp /=10;
        }


        return true;
    }

    public static void main(String[] args) {
        isPalindrom(247);


    }
}