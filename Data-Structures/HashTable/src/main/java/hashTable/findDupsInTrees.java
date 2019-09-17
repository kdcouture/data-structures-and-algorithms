package hashTable;


import java.util.ArrayList;

public class findDupsInTrees {
    public findDupsInTrees() {};

    public static String findDuplicatesInTrees(BinaryTree<Integer> t1, BinaryTree<Integer> t2) {
        ArrayList<Integer> treeString1 = t1.inOrder();
        ArrayList<Integer> treeString2 = t2.inOrder();
        int maxSize;

        if (treeString1.size() < treeString2.size())
            maxSize = treeString2.size();
        else
            maxSize = treeString1.size();
        HashTable checkTable = new HashTable(maxSize);
        HashTable dupTable = new HashTable(maxSize);

        ArrayList<String> toRet = new ArrayList<>();

        for(int i = 0; i < treeString1.size(); i++) {
            try {
                checkTable.add(treeString1.get(i).toString(), "visited");
            }
            catch (Exception e) {
                continue;
            }
        }
        for(int j = 0; j < treeString2.size(); j++) {
            try {
                checkTable.add(treeString2.get(j).toString(), "visited");
            }
            catch (Exception ex) {
                try {
                    dupTable.add(treeString2.get(j).toString(), "duplicate");
                    toRet.add(treeString2.get(j).toString());
                }
                catch (Exception exx) {
                    continue;
                }
            }
        }
        return toRet.toString();
    }
}
