

public class ArrayExample 
{//beginning of class
	

	public static void main(String[] args) 
	{//main method begin
		/*int numbers[]=new int[10];//array creation
		numbers[0]=500;
		numbers[1]=1500;
		numbers[2]=2500;
		numbers[3]=3500;
		numbers[4]=4500;
		numbers[5]=5500;
		numbers[6]=6500;
		numbers[7]=7500;
		numbers[8]=8500;
		numbers[9]=9500;*/
		
		//using array initializer
		int numbers[]={23,45,66,76,44,55,88,99,11,22};//marks array
		for (int i=0;   i<numbers.length;   i++)
		{	if (numbers[i] < 40)
			{	System.out.println("student no "+(i+1)+" :Fail");
			
			}//end if
			else if (numbers[i]>=40 && numbers[i]<65)
			{
				System.out.println("student no "+(i+1)+" :Pass");
			}//end of else if 1
			else if (numbers[i]>=65 && numbers[i]<75)
			{
				System.out.println("student no "+(i+1)+" :Credit");
			}//end of else if 1
			else if (numbers[i]>=75 && numbers[i]<=100)
			{
				System.out.println("student no "+(i+1)+" :Distinction");
			}
			else
			{
				System.out.println("Your marks is invalid ");
			}
			
		}//end for
		

	}//main method end

}//end of class
