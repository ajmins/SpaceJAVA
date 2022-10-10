package myfirstJavaProgram;

public class Keyword {

	//53 reserved words in java 
	// it cannot be used as variables, methods, classes, or any other identifiers
	//out of this, const, goto are not used
	//instead of const use final;
	//goto has no function
	
	// true, false, and null are not keywords, 
	//but they are literals and reserved words 
	//that cannot be used as identifiers.


	//list of keywords
	/*
	 
		abstract	continue	for			new			switch
		assert		default		goto		package		synchronized
		boolean		do			if			private		this
		break		double		implements	protected	throw
		byte		else		import		public		throws
		case		enum		instanceof	return		transient
		catch		extends		int			short		try
		char		final		interface	static		void
		class		finally		long		strictfp	volatile
		const		float		native		super		while
	 */
	//final : cannot be updated later

	public static void main(String[] args) {
		//final keywords
		final double PI = 3.14159;
		
		//pi =4; //The final local variable pi cannot be assigned. It must be blank and not using a compound assignment
		
		System.out.println(PI);
		
		
		

		

	}

}
