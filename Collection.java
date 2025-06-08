public interface Collection<E>{

	CollectionIterator iterator();
	boolean add(E e);
	void addAll(Collection c);
	void clear();
	boolean contains(E e);
	boolean containsAll(Collection c);
	boolean isEmpty();
	void remove(E e);
	void removeAll(Collection c);
	void retainAll(Collection c);
	int size();
	int getSize();
	void setSize(int num);
	E getElement(int num);

}
