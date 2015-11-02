import java.util.*;

public class SeparateAndMerge
{
	public static void main(String[] args)
	{
		LList<Integer> listInt = new LList<Integer>();
		LList<Float> listFloat = new LList<Float>();

		Scanner scanner = new Scanner(System.in);

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

		System.out.println("Inputted values: ");
		
	}
}