# Insertion-sort-with-Array-List-implementation
Insertion sort implemented in Java which takes input from the file where numbers are separated by semi colon, output will will displayed in another file "answers.txt"

--------------------
Platform/Compiler
--------------------

jGrasp        (Platform)
javac           (compiler)

---------------------------------
Command Line Arguments
---------------------------------

Example:  javac Isort.java 		(Compiling)
	java Isort test.txt 		(Running)

test.txt - Input file with testcase
Isort.java - Source File

---------------------------------
Input/Output & Issues
---------------------------------

1. The Input file path has to be given in the Comand Line. If the input file name is not mentioned in the Command Line,
an empty output file (answers.txt) is created without any data.

2.  The Output file (answers.txt) is created with the sorted order of the numbers available in input file in the default folder where the source code is present.

3. The numbers given in the input file should only be Integers.


------------------
Program Design 
------------------

Main Function:

1. The input file path is fetched from the comand line argument.

2. The file is being read using BufferedReader and the data (numbers) stored in a String array. 
    These numbers in String array are converted into Integer and added for the ArrayList.

3. The ArrayList reference and the length of the ArrayList is sent to the Insertion sort module.

4. Once the numbers in the ArrayList are sorted, these are inserted into the new file (answers.txt) and saved in the default file path where the source code is available.


insertSort(ArrayList a, int n)

1. This module will sort the given list of numbers in increasing order ausing Insertion Sort algorithm.


-------------------
Algorithm
-------------------

Step 1 : If it is the first element, it is already sorted;
Step 2 : The loop should run from the second element and continue till end;
Step 3 : Compare with all elements in the sorted sub-list
Step 4 : Shift all the elements in the sorted sub-list that is greater than the 
                value to be sorted
Step 5 : Insert the value
Step 6 : Repeat until list is sorted

-------------------
Pseudo Code	
-------------------

procedure insertSort( A : ArrayList , n : length of ArrayList )
   int index
   int value
	
   for i = 1 to length(A) inclusive do:
	
      /* select value to be inserted */
      value = A[i]
      index = i
      
      /*locate index for the element to be inserted */
		
      while index > 0 and A[index-1] > valueToInsert do:
         A[index ] = A[index -1]
         index  = index  -1
      end while
		
      /* insert the number at index */
      A[index] = value
      
   end for
	
end procedure

