
public class Biggest {
public static void main(String[] args)
{
	String s="hello world this is javaworld";

	highest(s);
	
	
}
public static String highest(String s)
{
	String[] s1=s.split(" ");
	String max=s1[0];
	for(int i=0;i<s1.length;i++)
	{
		if(max.length()<s1[i].length())
		{
			max=s1[i];
		}
		
	}
	System.out.println(max);
	return max;
}

}
