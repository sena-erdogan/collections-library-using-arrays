import java.util.*;
import java.lang.Exception;
public class CollectionIterator<E>{
		
	private Collection<E> collection;
	private int itr;

	public CollectionIterator(){	itr=0;}

	public boolean hasNext(){

		if(itr<collection.getSize()-1)	return true;
		else	return false;

	}

	public E next(){

		try{
			if(hasNext() == true){
				++itr;
				
			}else throw new CollectionException("This iterator has no next element. Terminating.");
		}catch(Exception message){	System.out.println(message);
						System.exit(0);}
						
		return collection.getElement(itr);
	
	}

	public void remove(){

		try{
			if(collection.getSize() != 0){
			
				E e = collection.getElement(itr);
			
				collection.remove(e);
				
				collection.setSize(collection.getSize() - 1);
				
			}else throw new CollectionException("This iterator has no element. Terminating.");
		}catch(Exception message){	System.out.println(message);
						System.exit(0);}

	}
}

