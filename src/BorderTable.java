
public class BorderTable {

	public static void main(String []args)
	{
		String input = 		"AGTCAGTCAG";
		int prefixArray[] = {10,0,0,0,6,0,0,0,2,0};
		int n = prefixArray.length;
		
		for(int i: computerBorderArray(prefixArray, n))
		{
			System.out.print(i+"\t");
		}
	}

	private static int[] computerBorderArray(int[] prefixArray, int n) {
		int []borderTable = new int[n];
		borderTable[0] = 0;
		int l = 0;
		
		for(int i = 1; i<=n-1; i++)
		{
			if(i+prefixArray[i]-1>=l)
			{
				for(int r = 0; r < i+prefixArray[i]-1-l; r++)
				{
					borderTable[i+prefixArray[i]-r-1]=prefixArray[i]-r;
				}
				l = i + prefixArray[i];
			}
		}
		return borderTable;
	}
}
