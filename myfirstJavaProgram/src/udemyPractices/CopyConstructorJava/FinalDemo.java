package udemyPractices.CopyConstructorJava;


public class FinalDemo{
	final int Max ;
	final int Min;
		
		 FinalDemo(int Max2, int Min2){

			Max = Max2;
			Min = Min2;
			System.out.println("Max Value in FinalDemo: "+Max);
			System.out.println("Min Value in FinalDemo: "+Min);
		 }
		 FinalDemo(FinalDemo fd){
			 Max = fd.Min;
			 Min = fd.Max;
			 System.out.println("Max Value in FinalDemo(copy): "+Max);
			 System.out.println("Min Value in FinalDemo(copy): "+Min);
		 }

public static void main(String[] args) {
		FinalDemo demo1 =new FinalDemo(500, 2);
		//System.out.println(demo1);

		FinalDemo demo2 =new FinalDemo(demo1);
		//System.out.println(demo2);
	
	Integer a = new Integer(5);
	Integer b = new Integer(10);
	a++;
	b=a;
	System.out.println(a+"\n"+b);
	b++;
	System.out.println(a+"\n"+b);
		
		

	}
}

