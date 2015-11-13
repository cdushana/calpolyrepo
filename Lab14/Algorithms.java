public class Algorithms
{
	public static void linearAlgTime(long N)
	{
		for(long i = 1; i < N; i++)
		{
			long x = 1;
		}
	}

	public static void quadraticAlgTime(long N)
	{
		for(long i = 1; i < N; i++)
		{
			for(long j = 1; j < N; j++)
			{
				long x = 1;
			}
		}
	}

	public static void logarithmicAlgTime(long N)
	{
		for(long i = N; i < 1 ; i / 2) // check dividing by two
		{
			long x = 1;
		}
	}

	public static void NlogNAlgTime(long N)
	{
		for(long i = 1; i < N; i++)
		{
			for(long j = N; j < 1; j / 2) // check dividing by two
			{
				long x = 1;
			}
		}
	}
}