
package hashTable;

public class repeatedWord {

    public static String repeatedWordCheck(String input) {
        HashTable wordTable;
        wordTable = new HashTable(input.length());
        String[] inArr = input.replaceAll("[.!?\\\\-]", "").split(" ");

        for (int i = 0; i < inArr.length; i++) {
            String word = inArr[i].toLowerCase();
            try{
                wordTable.add(word, word);
            }
            catch (Exception e) {
                return word;
            }

        }
        return "";
    }
}