
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){

        char[] chList = in.toCharArray();
        char temp = chList[0];

        for(int i = 1; i < chList.length; i++){
            chList[i - 1] = chList[i];
        }

        chList[chList.length - 1] = temp;

        String newString = new String(chList);
        newString = newString.concat("ay");

        return newString;
    }
}
