/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

import java.util.ArrayList;

public class HashTable {

    public HashNode[] map;

    public HashTable(int size) {
        map = new HashNode[size];
    }

    public ArrayList<String[]> left_join(HashTable ht) {
        ArrayList<String[]> toRet = new ArrayList<String[]>();
        for(int i = 0; i < this.map.length; i++) {
            String[] rowString = new String[3];
            if (this.map[i] != null) {
                rowString[0] = this.map[i].key;
                rowString[1] = this.map[i].value;
                rowString[2] = null;
                if(ht.contains(this.map[i].key)) {
                    rowString[2] = ht.get(this.map[i].key);
                }
                toRet.add(rowString);
            }
        }
        return toRet;
    }

    // hash()
    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for( int i = 0; i<letters.length; i++) {
            hashValue += letters[i];
        }

        hashValue = (hashValue * 599) % map.length;
        return hashValue;
    }

    // add()
    public void add(String key, String value) throws IllegalArgumentException {

        // set a var (int) of the hash(key)
        int hashKey = hash(key);

            if(this.contains(key)) {
                System.out.println("No duplicate keys!");
                throw new IllegalArgumentException();
            }

        // If map[hashvalue] is a thing ... do the linked list thing
        // Otherwise, just add the node.
        if( this.map[hashKey] == null ) {
            map[hashKey] = new HashNode(key, value);
        }
        else {
            HashNode temp = map[hashKey];
            map[hashKey] = new HashNode(key, value);
            map[hashKey].setNext(temp);
        }

    }

    // get()
    public String get(String key) {
        // hash the key (should give me the same thing)
        // if the hash table has that key, send back the value from the node.
        int  hashKey = hash(key);
        if(this.map[hashKey] != null ) {
            // Iterate through any chained items.
            HashNode temp = this.map[hashKey];
            while(temp != null && !temp.key.equals(key)) {
                temp = temp.next;
            }
            return (temp == null ? null : temp.value);
        }

        return null;
    }

    // contains()
    public boolean contains(String key) {
        int  hashKey = hash(key);
        if(this.map[hashKey] != null ) {
            // Iterate through any chained items.
            HashNode temp = this.map[hashKey];
            while(temp != null && !temp.key.equals(key)) {
                temp = temp.next;
            }
            return (temp == null ? false : true);
        }
        return false;
    }

}