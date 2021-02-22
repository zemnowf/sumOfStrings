public class Main {
    public static void main(String[] args) {
        SumOfStrings ourStrings = new SumOfStrings();
        ourStrings.firstString = "ACAB";
        ourStrings.secondString = "1312";
        System.out.println(ourStrings.sumStrings(ourStrings.firstString, ourStrings.secondString));
    }
}
