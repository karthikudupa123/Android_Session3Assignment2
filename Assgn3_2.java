public class Assgn3_2
{
	public static void main(String[] args)
	{
		String S1,S2;		//String declaration
		boolean same;		//Boolean variable declaration
		S1="karthik";		//String S1 initialization
		S2="karthi";		//String S2 initialization
		if(S1.equals(S2))	//Comparing strings
			same=true;   	//Assigning boolean value TRUE to variable same
		else
			same=false;		//Assigning boolean value FALSE to variable same
		System.out.println("Strings S1 & S2 are same: This statement is "+same);
	}
}
