public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";


    public static String getFizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        int firstPart = number / 10;
        int secondPart = number % 10;

        String conclude = getStringNumberNotFizzBuzz(number, firstPart, secondPart);

        if (isFizz){
            conclude = FIZZ;
        }
        if (isBuzz) {
            conclude = BUZZ;
        }
        if (isBuzz && isFizz){
            conclude = FIZZ_BUZZ;
        }
        return conclude;
    }

    private static String getStringNumberNotFizzBuzz(int number, int firstPart, int secondPart) {
        if (number < 10) {
            return getStringBelowTen(number);
        } else if (number < 20) {
            return "muoi " + getStringBelowTen(secondPart);
        }
        return getStringBelowTen(firstPart) + " muoi " + getStringBelowTen(secondPart);
    }

    private static String getStringBelowTen(int number) {
        switch (number) {
            case 0:
                return "";
            case 1:
                return "mot";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bon";
            case 5:
                return  "nam";
            case 6:
                return  "sau";
            case 7:
                return  "bay";
            case 8:
                return  "tam";
            case 9:
                return  "chin";
        }
        return "muoi";
    }
}
