
# Java Apprentice Badge

##### Brandon Fowler Membership Team

### TASKS:

### Lifecycle of an Object: 
When an object is first created, the class file is 
loaded by locating the class file on the disk. Java
then initializes the static fields to be used in 
following objects of the same type. Java then allocates
memory for the object and creates a reference so to
keep track of it. Java then calls the object's 
constructor. Once the object no longer has any 
active references Java deletes the object. This is
done by Java's garbage collector.

### Basic Data Types in Memory
Primitive data types such as boolean, int, and longs 
are stored in the stack as the code is read. Data
types such as arrays, strings, and objects are stored
in the heap. A reference to these objects is stored in 
the stack during runtime. 


### Breaking StringBuilder
Run main() in breakStringBuilder.java. I found that the 
StringBuilder on my computer can only have 603,979,774 
characters or 1,207,959,548 bytes before it runs
out of heap. 


### Comparing StringBuffer and StringBuilder
Running breakStringBuffer I found that it also crashed at
603,979,774 characters. But it did take a lot longer
for StringBuffer to fill up then StringBuilder. 
Looking online it seems the reason for this is that
StringBuffer is thread safe. So if you're sure you're
not using threads StringBuilder would be the better
option. 

### Comparing Data Structures

##### ArrayList
Arraylists have the advantage of fast random access.
They are also stored sequentially which can simplify
some operations. They are also quick to iterate across.
But they slow when it comes to deleting or inserting 
elements as all elements that follow must be shifted.
Resizing which takes place automatically is also 
expensive. 

##### LinkedList
LinkedLists very efficient removal and insertion. No
need to preallocate memory. Slower and more inefficient
iteration and random access. 

##### HashMap
Hashmaps are useful in storing key value pairs. They
also iterate and access elements quickly. Unfortunately 
resizing is expensive and performance drops as the map 
fills up. 

##### HashSet
HashSet allows null values and enforces there are no
duplicate values. But insertion order is not maintained.

##### TreeSet
TreeSet also ensures unique elements and provides fast
access. It also stores elements in ascending order. 

### Sorting Files
Run main() in FileSorter.java. Look in 'resources' 
package for output.

### Reverse Sorting a File
Run main() in FileSorterReverse.java. Look in 'resources' 
package for output.


### Exception Handling 
Exceptions.java demonstrates handling for checked and 
unchecked exceptions. 


### Enums
In BloodType.java I created an enum. Enums are most useful 
for when you want to classify objects. They allow you to 
assign a name to a numerical value instead of having to 
remember which numerical value corresponds to which 
classification. For example, in BLoodType.java the enum
'AB' represents the integer 2. Without the enum I would
have to remember 2 represents blood type AB. 


### Common Logic in Classes
All classes and logic are in the logicClasses package.
The hand class has 5 fingers. It reuses the logic 
'extendFinger' when it calls runs 'openHand'. This is
an example of composition. The person class has the 
function 'getLeftHand' which is reused in the baby 
class as baby class extends and inherits from Person
class. The 'pray' function is a static method which 
any class could call in order to reuse the logic.
<br />

For reusing logic, composition is useful when you have 
a 'has a' relationship where one object has multiple
objects. Such as a keyboard having many keys, or a 
building having many doors. When you define the function
in the object that is owned by the other object, the
owner need only call that function, rather than making
a similar function for each object it owns. Or, rather
than the building making a function to close each door, it 
only needs call the close door function on whatever 
door it wants to close.
<br />

Inheritance is useful for reusing logic when you have
many objects that perform a common function. Individual
objects can differ but if inherited from a common parent
class they can all reuse the logic stored in the parent. 

Static functions have the advantage of being easier to 
write and less cumbersome than inheritance or composition. 
But they can sometimes be more confusing and sometimes
make it harder to understand the code. Associating logic
with classes is generally a better practice as it 
improves organization. 

### Overloading Constructors
Sauce.java contains examples of constructor chaining. 
There is a constructor for every combination of 
parameters as long at least one parameter is provided. 

### Good and Bad Encapsulation
GoodEncapsulation.java and BadEncapsulation.java show
examples of good and bad encapsulation. The purpose
of encapsulation is to allow a user of the class to 
use it without a knowledge of the inner workings. 
Making fields public that are not necessary for the
user to know is bad encapsulation. 

### Passing Parameters
In ParamTypesToMethod.java are some examples of 
passing by value and reference in java. In Java
primitive types and the String class are passed by 
value. Objects are passed by reference but the 
reference to the object cannot be changed. Only the
contents of the object itself can be modified. 
The 'final' keyword assures an object will not be 
reassigned with the 'new' keyword or if a String
or primitive type that the value will not be changed. 


### Access Modifiers
In the accessModifiers package is a parent-child
relationship between two classes that demonstrates
how the access modifiers public, private, and
protected can be used. Public can be used for
attributes but this is usually discouraged. It's
usually better practice for these to be private
or protected and to be accessed by getters and 
setters. This helps improve encapsulation and makes
the object more consistent. Public is best used for
method a user of the class would need to be able to
call. Private is useful for encapsulating class
attributes and subtasks to the public methods of 
a class, as these need not be seen by a user. 
Protected is used to allow child classes to access
members of a parent class without letting a user
access them.

### Virtual Methods
In the virtualMethods package are three classes. 
The AI is an abstract class which is extended by
Jenny and Jerry. The abstract method 'think' in 
AI is implemented by both. In the main method in
AI both the Jenny and Jerry object are added to 
an array list of type AI. Java is able to call 
the think method on both without knowing what
subclass the two AI are. 

### InstanceOf and Type Casting
The package 'types' shows examples of casting
and instanceof in Main.java.

### Overriding Methods
The 'overriding' package contains a parent class
'Bird' and a child class 'Chicken'. 'Chicken'
overrides the 'makeNoiseMethod' in 'Bird'.
<br />

Overriding is useful when you want to be able to
use child classes and parent classes interchangeably
without knowing the specifics of either. But it 
can sometimes lead to unexpected behaviour when a
child overrides the method and changes its 
behaviour significantly. 

### Overloading
In Pig.java in the overloading package I overloaded
both the constructor and the squeal function.
<br />

Overloading is useful when you want to allow the 
class user options on calling the constructor or
function. Maybe to specify a default behaviour or
something. Though sometimes it can make things 
more inconsistent and confusing for the class 
user. 

### Logging
In the logging package the Main.java class shows 
examples of logging with the different levels. In
the log4j.properties the logger is set up to log
to both the console and the file 'log.out'.
