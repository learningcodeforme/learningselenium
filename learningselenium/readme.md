Standard Java Naming Conventions

A Few Words About Cases
Using the right letter case is the key to following a naming convention:

Lowercase is where all the letters in a word are written without any capitalization (e.g., while, if, mypackage).

Uppercase is where all the letters in a word are written in capitals. When there are more than two words in the name use underscores to separate them (e.g., MAX_HOURS, FIRST_DAY_OF_WEEK).


CamelCase (also known as Upper CamelCase) is where each new word begins with a capital letter (e.g., CamelCase, CustomerAccount, PlayingCard).

Mixed case (also known as Lower CamelCase) is the same as CamelCase except the first letter of the name is in lowercase (e.g., hasChildren, customerFirstName, customerLastName).


The below list outlines the standard Java naming conventions for each identifier type:

Packages: Names should be in lowercase. With small projects that only have a few packages it's okay to just give them simple (but meaningful!) names:

package pokeranalyzer package mycalculator
 
  
In software companies and large projects where the packages might be imported into other classes, the names will normally be subdivided. Typically this will start with the company domain before being split into layers or features:
 package 
 com.mycompany.utilities package
 org.bobscompany.application.userinterface 
 
 
 
Classes: Names should be in CamelCase.
Try to use nouns because a class is normally representing something in the real world:
Example ->  class Customer class Account 


Interfaces: Names should be in CamelCase. They tend to have a name that describes an operation that a class can do:
 
 interface Comparable 
 
 interface Enumerable 
 
Note that some programmers like to distinguish interfaces by beginning the name with an "I":
interface IComparable interface IEnumerable 
 
 
Methods: Names should be in mixed case. Use verbs to describe what the method does:
void calculateTax() string getSurname() 
 
 
Variables: Names should be in mixed case. The names should represent what the value of the variable represents:
 string firstName
 int orderNumber 
Only use very short names when the variables are short-lived, such as in for loops:
 for (int i=0; i<20;i++) {   //i only lives in here } 
 
 
Constants: Names should be in uppercase.
 static final int DEFAULT_WIDTH static 
 final int MAX_HEIGHT 
 
 
 
 # how to format code 
  ctrl+shift_f 
  
  
  how to debug code in java