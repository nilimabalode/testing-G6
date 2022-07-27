package Method;

public class staticnonstatic2 {
	static int a=10;                //static variable
	       int b=20;                //nonstatic variable
	       
	       
	       staticnonstatic2(){          //user define constructor with zero args
	    	a=23;
	    	b=56;
	    	
	    }
	       staticnonstatic2(int v){     //user define with argument
	    	   a=50;
	    	   b=67;
	       }
	       staticnonstatic2(char u){      // //user define with argument
	    	   
	       }
	       public static void main(String[] args) {
			System.out.println(a);
			
			 staticnonstatic2 x=new  staticnonstatic2();
			 System.out.println(a);
			 System.out.println(x.b);
			 
			 staticnonstatic2 y=new  staticnonstatic2(11);
			 System.out.println(a);
			 System.out.println(y.b);
			 
			 staticnonstatic2 z=new  staticnonstatic2('#');
			 System.out.println(a);
			 System.out.println(z.b);
			 
	       }

}
			
			
			
			
			
			
			
			
		
