class Pattern7{

      public static void main(String [] args)
       {
	      for(int i=0;i<5;i++)
		  {
		    for(int j=5;j>=i;j--)
			  {
			  System.out.print(" ");
			  }
			  for(int x=0;x<=i;x++)
			  {
			  System.out.print("*");
			  }
			  for (int k=1;k<=i;k++)
			  {  
              System.out.print("*");
			  }
			  System.out.println();
		      }
			   for(int i1=0;i1<=5;i1++)
		      {
		      for(int j1=0;j1<=i1;j1++)
			  {
			  System.out.print(" ");
			  }
			  for (int k1=5;k1>=i1;k1--)
			  {  
              System.out.print("*");
			  }
	          for(int x1=4;x1>=i1;x1--)
		      {
		      System.out.print("*");
			  }
			  System.out.println();
		      }
	          
		   }
		}
    
		  

    	
    