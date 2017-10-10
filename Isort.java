import java.io.File;
import java.util.ArrayList;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedWriter;	
import java.io.FileWriter; 	

class Isort
{
	public static void insertSort(ArrayList<Integer> a, int n)
	{
      //Assume first element is sorted and consider the elements from second position for sorting
		int value, index;
		for (int i=1;i<=n-1;i++) 
		{
			value = a.get(i);
			index = i;
			while(index>0 && value<a.get(index-1))
			{
				a.set(index,a.get(index-1));
				a.set(index-1,value);
				index=index-1;
			}
			 
		} 
	}

	public static void main(String args[]) throws IOException
	{
		int len;
		String str,outputFile;
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		File inputfile = null;
		/*The main reason for using ArrayList to Array is because they are dynamic and if here are multiple lines in the Input file, 
		we cannot determine the exact length to create an array of definite size*/ 
		ArrayList<Integer> a = new ArrayList<Integer>();
		if (args.length>0)
			inputfile = new File(args[0]); //Reading first argument from command line for input file name
      	else 
         	return;
		br = new BufferedReader(new FileReader(inputfile));//directing to the input file for reading values
		while((str=br.readLine())!= null)
			{
				String[] ar = str.split(";"); //Extract all numbers seperated by semi colon from inputfile as string
				for (int i=0 ;i<ar.length;i++)
				{
					if(ar[i].trim().length()>0) //Handle the white spaces between two semi-colons
					{
						a.add(Integer.parseInt(ar[i].trim())); //Converts the string into Integer and add it to ArrayList
					}
				}
			}
		len = a.size();//determining the size of ArrayList
		if (len>0)
		{
			insertSort(a,len); //passing the reference of the ArrayList and length of the ArrayList
		}
		else
		{
			return;
		}
		outputFile = "answers.txt";
		fw = new FileWriter(outputFile);
		bw = new BufferedWriter(fw);
		for(int i=0;i<a.size()-1;i++)
			bw.write(a.get(i).toString()+" ; ");//Inserts all sorted elements into the new output file
		bw.write(a.get(a.size()-1).toString()); //Insert the last element without semi colon at he end
		if(bw != null)
			{
				bw.close();
			}
		if(fw != null)
			{
				fw.close();
			}
	}
}
