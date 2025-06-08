import java.util.*;
import java.lang.Exception;
@SuppressWarnings("unchecked")
public class ArrayList<E> implements List<E>{
	
	private E[] arrayList;
	private int size=0;
	
	public ArrayList(){
	
		setSize(1);
		
		E[] tempArrayList = (E[])new Object[2];
		
		arrayList = tempArrayList;
	
	}
	
	public int size(){	return getSize();}
	
	public void setSize(int num){	size = num;}
	
	public int getSize(){	return size;}
	
	public E getElement(int num){	return arrayList[num];} // private, not for user's use, num won't be greater than the size
	
	public void addHere(E e, int num){ //user can choose where in the list to add the element
	
		try{
		
			if(num<size && num>=0){
		
				E[] tempArrayList = (E[])new Object[size++];
		
				for(int i=0; i<size;i++){
		
					if(i<num)	tempArrayList[i] = arrayList[i];
					else if(i==num)	tempArrayList[i] = e;
					else		tempArrayList[++i] = arrayList[i];
		
				}	
		
				++size;
		
				arrayList = tempArrayList;
		
			}else	throw new CollectionException("Index needs to be between -1 and size");
		
		}catch(Exception message){	System.out.println(message);}
	
	}
	
	public void removeHere(int num){ //user can choose which element to remove
	
		try{
		
			if(num<size && num>=0){
		
				E[] tempArrayList = (E[])new Object[size++];
		
				for(int i=0; i<size;i++){
		
					if(i<num)	tempArrayList[i] = arrayList[i];
					else if(i>num)	tempArrayList[--i] = arrayList[i];
		
				}	
		
				++size;
		
				arrayList = tempArrayList;
		
			}else	throw new CollectionException("Index needs to be between -1 and size");
		
		}catch(Exception message){	System.out.println(message);}
	
	}
	
	public CollectionIterator iterator(){
		
		return new CollectionIterator();
	
	}
		
	public boolean contains(E e){
	
		for(int i=0; i<size; i++){
		
			if(arrayList[i] == e)	return true;
		
		}
		
		return false;
	
	}
	
	public boolean add(E e){
	
		setSize(++size);
		
		arrayList[--size] = e;
		
		return true;
	
	}
	
	public void clear(){
	
		try{
			if(size==0)	throw new CollectionException("This collection is already empty");
			else{
				size=0;
		
				E[] tempArrayList = (E[])new Object[1];
		
				arrayList = tempArrayList;
			}
		}catch(Exception message){	System.out.println(message);}
	
	}
	
	public boolean containsAll(Collection c){
	
		int flag=0;
	
		for(int i=0; i<c.getSize(); i++){
		
			for(int j=0; j<size; j++){
		
				if(arrayList[i] == c.getElement(j))	++flag;
				
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
	
		E[] tempArrayList = (E[]) new Object[size];
	
		for(; i<size;i++,j++){
		
			if(arrayList[i] != e)	tempArrayList[j] = arrayList[i];
			else{
				--j;
				--size;
			}
		
		}
		
		arrayList = tempArrayList;
		
		try{
			if(i == j)	throw new CollectionException("This collection doesn't have the element specified");
		}catch(Exception message){	System.out.println(message);}
	}
	
	public void removeAll(Collection c){
	
		int i=0, j, k, tempSize=0;
		
		E[] tempArrayList = (E[]) new Object[c.getSize()+size];
		
		for(; i<c.getSize(); i++){
		
			for(j=0, k=0; j<size; j++, k++){
			
				if(arrayList[j] == c.getElement(i))	--k;
				else{
					tempArrayList[k] = arrayList[j];
					++tempSize;
				}
			}
		
		}
		
		arrayList = tempArrayList;
		
		try{
			if(size == tempSize)	throw new CollectionException("This collection doesn't have any of the elements specified");
		}catch(Exception message){	System.out.println(message);}
		
		size = tempSize;
	
	}
	
	public void retainAll(Collection c){
	
		int i=0, j, k;
		
		E[] tempArrayList = (E[]) new Object[c.getSize()+size];
		
		for(; i<c.getSize(); i++){
		
			for(j=0, k=0; j<size; j++, k++){
			
				if(arrayList[j] != c.getElement(i))	--k;
				else	tempArrayList[k] = arrayList[j];
			
			}
		
		}
		
		try{
			if(c.getSize() == 0){
		
				clear();
			
				throw new CollectionException("The given collection is empty. The collection is emptied out.");
		
			}
		}catch(Exception message){	System.out.println(message);}
		
		arrayList = tempArrayList;
		
		size = c.getSize();
	
	}
	
	public void addAll(Collection c){
	
		int i,j;
		
		E[] tempArrayList = (E[]) new Object[c.getSize()+size];
		
		for(i=0; i<size; i++)	tempArrayList[i] = arrayList[i];
		
		size += c.getSize();
		arrayList = tempArrayList;
		
		for(i=size, j=0; j<c.getSize(); i++, j++){
			
			tempArrayList[i] = (E)c.getElement(j);
		
		}
		
		try{
			if(c.getSize() == 0){
		
				clear();
			
				throw new CollectionException("The given collection is empty. The collection stays the same.");
		
			}
		}catch(Exception message){	System.out.println(message);}
	
	}

}
