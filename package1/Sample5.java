package package1;

public class Sample5
{
		//Data members
		public int input1;
		public int input2;
		//constructor method
		public Sample5(int temp1,int temp2)
		{
			input1=temp1;
			input2=temp2;
		}
		//operational methods
		public int add()
		{
			int output=input1+input2;
			return(output);
		}
		public int add(int a)
		{	
			input1=a;
			int output=input1+input2;
			return(output);
		}
        public int add(int a, int b)
        {
        	input1=a;
        	input2=b;
        	int output=input1+input2;
        	return(output);
        	
        }
        

	}



