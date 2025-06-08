import java.util.*;
import java.lang.Exception;
@SuppressWarnings("unchecked")
public class LinkedList<E> implements List<E>,Queue<E>{

	private E[] linkedList;
	private int size=0;
	
	public LinkedList(){
	
		setSize(1);
		
		E[] tempLinkedList = (E[])new Object[2];
		
		linkedList = tempLinkedList;
	
	}
	
	public E getElement(int num){	return linkedList[num];} // private, not for user's use, num won't be greater than the size
	
	public CollectionIterator iterator(){
		
		return new CollectionIterator();
	
	}
	
	public boolean add(E e){
	
		setSize(++size);
		
		linkedList[--size] = e;
		
		return true;
	
	}
	
	public void addAll(Collection c){
	
		int i,j;
		
		E[] tempLinkedList = (E[]) new Object[c.getSize()+size];
		
		for(i=0; i<size; i++)	tempLinkedList[i] = linkedList[i];
		
		size += c.getSize();
		linkedList = tempLinkedList;
		
		for(i=size, j=0; j<c.getSize(); i++, j++){
			
				tempLinkedList[i] = (E)c.getElement(j);
		
		}
		
		try{
			if(c.getSize() == 0){
		
				clear();
			
				throw new CollectionException("The given collection is empty. The collection stays the same.");
		
			}
		}catch(Exception message){	System.out.println(message);}
	
	}
	
	public void clear(){
	
		try{
			if(size==0)	throw new CollectionException("This collection is already empty");
			else{
	
				size=0;
		
				E[] tempLinkedList = (E[])new Object[1];
		
				linkedList = tempLinkedList;
			}
		}catch(Exception message){	System.out.println(message);}
	
	}
	
	public boolean contains(E e){
	
		for(int i=0; i<size; i++){
		
			if(linkedList[i] == e)	return true;
		
		}
		
		return false;
	
	}
	
	public boolean containsAll(Collection c){
	
		int flag=0;
	
		for(int i=0; i<c.getSize(); i++){
		
			for(int j=0; j<size; j++){
		
				if(linkedList[i] == c.getElement(j))	++flag;
				
			}
			
			if(flag != i)	return false;
		
		}
		
		return true;
	
	}
	
	public boolean isEmpty(){
	
		if(size == 0)	return true;
		
		return false;
	
	}
	
	public void remove(E e){
	
		int i=0, j=0;
	
		E[] tempLinkedList = (E[]) new Object[size];
	
		for(; i<size;i++,j++){
		
			if(linkedList[i] != e)	tempLinkedList[j] = linkedList[i];
			else{
				--j;
				--size;
			}
		
		}
		
		linkedList = tempLinkedList;
		
		try{
			if(i == j)	throw new CollectionException("This collection doesn't have the element specified");
		}catch(Exception message){	System.out.println(message);}
	}
	
	public void removeAll(Collection c){
	
		int i=0, j, k, tempSize=0;
		
		E[] tempLinkedList = (E[]) new Object[c.getSize()+size];
		
		for(; i<c.getSize(); i++){
		
			for(j=0, k=0; j<size; j++, k++){
			
				if(linkedList[j] == c.getElement(i))	--k;
				else{
					tempLinkedList[k] = linkedList[j];
					++tempSize;
					
				}
			
			}
		
		}
		
		linkedList = tempLinkedList;
		
		try{
			if(size == tempSize)	throw new CollectionException("This collection doesn't have any of the elements specified");
		}catch(Exception message){	System.out.println(message);}
		
		size = tempSize;
	
	}
	
	public void retainAll(Collection c){
	
		int i=0, j, k;
		
		E[] tempLinkedList = (E[]) new Object[c.getSize()+size];
		
		for(; i<c.getSize(); i++){
		
			for(j=0, k=0; j<size; j++, k++){
			
				if(linkedList[j] != c.getElement(i))	--k;
				else	tempLinkedList[k] = linkedList[j];
			
			}
		
		}
		
		try{
			if(c.getSize() == 0){
		
				clear();
			
				throw new CollectionException("The given collection is empty. The collection is emptied out.");
		
			}
		}catch(Exception message){	System.out.println(message);}
		
		linkedList = tempLinkedList;
		
		size = c.getSize();
	
	}
	
	public int size(){	return getSize();}
	
	public void setSize(int num){	size = num;}
	
	public int getSize(){	return size;}
	
	public E element(){
	
		try{
			if(size == 0)	throw new CollectionException("This collection is empty. Terminating.");
			System.exit(0);
			
		}catch(Exception message){	System.out.println(message);}
		
		return linkedList[0];
	
	}
	
	public void offer(E e){	add(e);}
	
	public E poll(){
	
		E e = linkedList[0];
		
		try{
			if(size == 0){	
					throw new CollectionException("This collection is empty. Terminating.");
			}else{
			
				E[] tempLinkedList = (E[]) new Object[size];
	
				for(int i=1; i<size; i++)	tempLinkedList[--i] = linkedList[i];
				
				linkedList = tempLinkedList;
		
				--size;
			
			}
			
		}catch(Exception message){	
			System.out.println(message);
			System.exit(0);
		}

		return e;
	
	}

}
