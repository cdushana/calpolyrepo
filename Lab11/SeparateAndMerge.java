import java.util.*;

public class SeparateAndMerge
{
	public static void main(String[] args)
	{
		LList<Integer> listInt = new LList<Integer>();
		LList<Float> listFloat = new LList<Float>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input some integers or floats: ");
		while(!scanner.hasNext("q"))
		{
			if(scanner.hasNextInt())
			{
				listInt.add(scanner.nextInt());
			}
			else if(scanner.hasNextFloat())
			{
				listFloat.add(scanner.nextFloat());
			}
			else
			{
				scanner.next();
			}
		}
		scanner.close();

		System.out.println("Inputted values: ");
		Iterator intIter = listInt.iterator();
		Iterator floatIter = listFloat.iterator();

        for(int i = 0; intIter.hasNext() || floatIter.hasNext(); i++) // continue until node == null
        {
        	if(intIter.hasNext() &&  i % 2 == 0)		// all even values
        	{
        		System.out.print(intIter.next() + " ");
        	}
        	else if(floatIter.hasNext() &&  (i + 1) % 2 == 0)	// all odd values
        	{
        		System.out.print(floatIter.next() + " ");
        	}
        }
        System.out.println(); 
	}
}