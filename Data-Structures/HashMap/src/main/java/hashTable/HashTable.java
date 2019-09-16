/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

public class HashTable {

    public HashNode[] map;

    public HashTable(int size) {
        map = new HashNode[size];
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
    public void add(String key, String value) {

        // set a var (int) of the hash(key)
        int hashKey = hash(key);

//        System.out.println("Key -> hashed : " + key + " " + hashKey);
        try{
            if(this.contains(key)) {
                System.out.println("No duplicate keys!");
                throw new IllegalArgumentException();
            }
        }
        catch (Exception e) {
            System.err.println("No duplicate keys!\n" + e);
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
            while(temp != null && temp.key != key) {
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
            while(temp != null && temp.key != key) {
                temp = temp.next;
            }
            return (temp == null ? false : true);
        }
        return false;
    }

}