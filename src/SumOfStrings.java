
public class SumOfStrings {
    public String firstString;
    public String secondString;

    public String getFirstString() {
        return firstString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    public String getSecondString() {
        return secondString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    public char[] sumStrings(String firstString, String secondString) {
        char[] firstArray = firstString.toCharArray();
        char[] secondArray = secondString.toCharArray();
        char[] result = new char[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, result, 0, firstArray.length);
        System.arraycopy(secondArray, 0, result,firstArray.length, secondArray.length);
        return result;
    }


}
