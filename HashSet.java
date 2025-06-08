import java.util.*;
import java.lang.Exception;
@SuppressWarnings("unchecked")
public class HashSet<E> implements Set<E>{

	private E[] hashSet;
	private int size=0;
	
	public HashSet(){
	
		setSize(1);
		
		E[] tempHashSet = (E[])new Object[2];
		
		hashSet = tempHashSet;
	
	}
	
	public int size(){	return getSize();}
	
	public void setSize(int num){	size = num;}
	
	public int getSize(){	return size;}
	
	public E getElement(int num){	return hashSet[num];} // private, not for user's use, num won't be greater than the size
	
	public CollectionIterator iterator(){
		
		return new CollectionIterator();
	
	}
		
	public boolean contains(E e){
	
		for(int i=0; i<size; i++){
		
			if(hashSet[i] == e)	return true;
		
		}
		
		return false;
	
	}
	
	public boolean add(E e){
	
		try{
		
			if(contains(e) == false){
	
				setSize(++size);
		
				hashSet[--size] = e;
			
			}else	throw new CollectionException("This collection already has the element specified");
		
		}catch(Exception message){	System.out.println(message);}
		
		return true;
	
	}
	
	public void clear(){
	
		try{
			if(size==0)	throw new CollectionException("This collection is already empty");
		
			else{
				size=0;
		
				E[] tempHashSet = (E[])new Object[1];
		
				hashSet = tempHashSet;
			}
		}catch(Exception message){	System.out.println(message);}
	
	}
	
	public boolean containsAll(Collection c){
	
		int flag=0;
	
		for(int i=0; i<c.getSize(); i++){
		
			for(int j=0; j<size; j++){
		
				if(hashSet[i] == c.getElement(j))	++flag;
				
			}
			
			if(flag != i)	return false;
		
		}
		
		return true;
	
	}
	
	public boolean isEmpty(){
	
		if(size == 0)	return true;
		else	return false;
	
	}
	
	public void remove(E e){
	
		int i=0, j=0;
	
		E[] tempHashSet = (E[]) new Object[size];
	
		for(; i<size;i++,j++){
		
			if(hashSet[i] != e)	tempHashSet[j] = hashSet[i];
			else{
				--j;
				--size;
			}
		
		}
		
		hashSet = tempHashSet;
		
		try{
			if(i == j)	throw new CollectionException("This collection doesn't have the element specified");
		}catch(Exception message){	System.out.println(message);}
	
	}
	
	public void removeAll(Collection c){
	
		int i=0, j, k, tempSize=0;
		
		E[] tempHashSet = (E[]) new Object[c.getSize()+size];
		
		for(; i<c.getSize(); i++){
		
			for(j=0, k=0; j<size; j++, k++){
			
				if(hashSet[j] == c.getElement(i))	--k;
				else{
					tempHashSet[k] = hashSet[j];
					++tempSize;
				}
			
			}
		
		}
		
		hashSet = tempHashSet;
		
		try{
			if(size == tempSize)	throw new CollectionException("This collection doesn't have any of the elements specified");
		}catch(Exception message){	System.out.println(message);}
		
		size = tempSize;
		
	}
	
	public void retainAll(Collection c){
	
		int i=0, j, k;
		
		E[] tempHashSet = (E[]) new Object[c.getSize()+size];
		
		for(; i<c.getSize(); i++){
		
			for(j=0, k=0; j<size; j++, k++){
			
				if(hashSet[j] != c.getElement(i))	--k;
				else	tempHashSet[k] = hashSet[j];
			
			}
		
		}
		
		try{
			if(c.getSize() == 0){
		
				clear();
			
				throw new CollectionException("The given collection is empty. The collection is emptied out.");
		
			}
		}catch(Exception message){	System.out.println(message);}
		
		hashSet = tempHashSet;
		
		size = c.getSize();
	
	}
	
	public void addAll(Collection c){
	
		int i,j;
		
		E[] tempHashSet = (E[]) new Object[c.getSize()+size];
		
		for(i=0; i<size; i++)	tempHashSet[i] = hashSet[i];
		
		size += c.getSize();
		hashSet = tempHashSet;
		
		for(i=size, j=0; j<c.getSize(); i++, j++){
			
			if(contains((E)c.getElement(j)) == true)	--i;
			else{
				tempHashSet[i] = (E) c.getElement(j);
			}
		
		}
		
		try{
			if(c.getSize() == 0){
		
				clear();
			
				throw new CollectionException("The given collection is empty. The collection stays the same.");
		
			}
		}catch(Exception message){	System.out.println(message);}
	
	}

}
