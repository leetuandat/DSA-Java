package DsaMat3514.BT7_SimpleBST;

public interface SimpleBTreeInterface<Key extends Comparable<Key>> extends Iterable<Key> {
    public void insert(Key k);
    public Key search(Key k);
    public int size();
    public boolean isEmpty();
}
