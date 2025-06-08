interface Set<E> extends Collection<E>{

	public CollectionIterator iterator();
	public boolean add(E e);
	public void addAll(Collection c);
	public void clear();
	public boolean contains(E e);
	public boolean containsAll(Collection c);
	public boolean isEmpty();
	public void remove(E e);
	public void removeAll(Collection c);
	public void retainAll(Collection c);
	public int size();
	public int getSize();
	public void setSize(int num);

}
