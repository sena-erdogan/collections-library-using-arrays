JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = Collection.java Set.java List.java Queue.java HashSet.java ArrayList.java LinkedList.java CollectionIterator.java CollectionException.java Driver.java

default: classes

classes: $(CLASSES:.java=.class)
	java Driver

clean:
	$(RM) *.class
