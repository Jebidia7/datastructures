package datastructures.specs;

/**
 * Created with IntelliJ IDEA.
 * User: Jebidia7
 * Date: 9/7/14
 * Time: 9:26 PM
 */
public interface HashTable<K,V> {

    public void displayTable();

    public int hash(K key);

    public int doubleHash(K key);

    public void insert(K key, V element);

    public V remove(K key);

    public V find(K key);
}
