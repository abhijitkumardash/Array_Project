package com.array.basic;

import java.util.HashSet;

/* To Find Duplicate Elements In An Array Using HashSet */
public class DuplicatesInArray 
{   
	public static void main(String[] args) 
	{
		//String[] str = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		int [] no = {1,3,4,5,1,2,3,4,5,5,5,5};

		//HashSet<String> set = new HashSet<String>();
		HashSet<Integer> set = new HashSet<Integer>();

		for (int arrayElement : no)
		{
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is : "+arrayElement);
			}
		}
	}    
}

/* To Find Duplicate Elements In An Array Using Using Brute Force Method */
/*public class DuplicatesInArray 
{   
    public static void main(String[] args) 
    {
        String[] str = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
 
        for (int i = 0; i < str.length-1; i++)
        {
            for (int j = i+1; j < str.length; j++)
            {
                if( (str[i].equals(str[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+str[j]);
                }
            }
        }
    }    
}*/