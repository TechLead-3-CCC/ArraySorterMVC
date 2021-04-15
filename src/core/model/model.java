package core.model;

import java.util.Arrays;
import java.util.Scanner;

public class model {
	
	//Constructeur
	public model() {
		
	}
	
//verification of an input (if it's an int)
	public int enterAndVerifyIntInput() {
		int number=0;
		boolean coherent = false;	
		while(coherent == false){
			Scanner input = new Scanner(System.in);
			
			boolean inputIsInt = input.hasNextInt();
			if(inputIsInt == false) {
				coherent = false;
				System.out.println("Please, enter an int value.");
			}else{
				
				number = input.nextInt();
				break;
				}
		}
	return number;
	}
	
//verification of an input (if it's a short)
	public short enterAndVerifyShortInput() {
		short number=0;
		boolean coherent = false;	
		while(coherent == false){
			Scanner input = new Scanner(System.in);
			
			boolean inputIsShort = input.hasNextShort();
			if(inputIsShort == false) {
				coherent = false;
				System.out.println("Please, enter an short value.");
			}else{
				
				number = input.nextShort();
				break;
				}
		}
	return number;
	}
	
	//verification of an input (if it's a long)
		public long enterAndVerifyLongInput() {
			long number=0;
			boolean coherent = false;	
			while(coherent == false){
				Scanner input = new Scanner(System.in);
				
				boolean inputIsLong = input.hasNextLong();
				if(inputIsLong == false) {
					coherent = false;
					System.out.println("Please, enter an long value.");
				}else{
					
					number = input.nextShort();
					break;
					}
			}
		return number;
		}
		
	//verification of an input (if it's a float)
	public float enterAndVerifyFloatInput() {
		float number=0;
		boolean coherent = false;	
		while(coherent == false){
			Scanner input = new Scanner(System.in);
			
			boolean inputIsFloat = input.hasNextFloat();
			if(inputIsFloat == false) {
				coherent = false;
				System.out.println("Please, enter an float value.");
			}else{
				
				number = input.nextFloat();
				break;
				}
		}
	return number;
	}
		
	//verification of an input (if it's a double)
		public double enterAndVerifyDoubleInput() {
			double number=0;
			boolean coherent = false;	
			while(coherent == false){
				Scanner input = new Scanner(System.in);
				
				boolean inputIsDouble = input.hasNextDouble();
				if(inputIsDouble == false) {
					coherent = false;
					System.out.println("Please, enter an float value.");
				}else{
					
					number = input.nextDouble();
					break;
					}
			}
		return number;
		}
	
	//verification of an input (if it's a char)
			public char enterAndVerifyCharInput() {
				char charac=0;
				Scanner input = new Scanner(System.in);
				String a = input.nextLine();
				if (a=="A" || a=="B" || a=="C" || a=="D" || a=="E" || a=="F" || a=="G" || a=="H" 
						|| a=="I" || a=="J" || a=="K" || a=="L" || a=="M" || a=="N" || a=="O"
						|| a=="P" || a=="Q" || a=="R" || a=="S" || a=="T" || a=="U" || a=="V" 
						|| a=="W" || a=="X" || a=="Y" || a=="Z" ) 
				{a=a.toLowerCase();}
				charac=a.charAt(0);
				
			return charac;
			}
		
	//verification of an Type of data's input (if it's an int)
	public int enterAndVerifyTypeOfdataInput() {
		int number=0;
		boolean coherent = false;	
		while(coherent == false){
			Scanner input = new Scanner(System.in);
			
			boolean inputIsInt = input.hasNextInt();
			if(inputIsInt == false) {
				coherent = false;
				System.out.println("Please, enter an int value.");
			}else{
				number = input.nextInt();
				if( number == 1 || number ==2 || number ==3 || number ==4 || number ==5 || number ==6 || number ==7) {
				break;	               
				}else {
					coherent = false;
					System.out.println("Please, enter an int value between {1,2,3,4,5,6,7}.");
				}
			}
				}
	return number;
	}
	
	
	//stockage of the elements of the string list
	public String [] stockageOfStringElements(int a) {
		String [] array=new String [a];
		Scanner el= new Scanner(System.in);
		for (int i=0; i<a; i++) {
			array[i]=el.nextLine();		
		}
		return array;
	}
	
	
	//stockage of the elements of the int list
	public int [] stockageOfIntElements(int a) {
		int [] array=new int [a];
		for (int i=0; i<a; i++) {
			array[i]=enterAndVerifyIntInput();		
		}
		return array;
	}
	
	//stockage of the elements of the short list
		public short [] stockageOfShortElements(int a) {
			short [] array=new short [a];
			for (int i=0; i<a; i++) {
				array[i]=enterAndVerifyShortInput();		
			}
			return array;
		}
	//stockage of the elements of the long list
			public long [] stockageOfLongElements(int a) {
				long [] array=new long [a];
				for (int i=0; i<a; i++) {
					array[i]=enterAndVerifyLongInput();		
				}
				return array;
			}
		
	//stockage of the elements of the float list
	public float [] stockageOfFloatElements(int a) {
		float [] array=new float [a];
		for (int i=0; i<a; i++) {
			array[i]=enterAndVerifyFloatInput();		
		}
		return array;
	}
	
	//stockage of the elements of the double list
		public double [] stockageOfDoubleElements(int a) {
			double [] array=new double [a];
			for (int i=0; i<a; i++) {
				array[i]=enterAndVerifyDoubleInput();		
			}
			return array;
		}
		
	//stockage of the elements of the char list
			public char [] stockageOfCharElements(int a) {
				char [] array=new char [a];
				for (int i=0; i<a; i++) {
					array[i]=enterAndVerifyCharInput();	
					
				}
				return array;
			}
			

	//method to sort an int array
	 public String [] sortIntTable(int [] array) {
		
		 int temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] < array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		 String [] k= new String [array.length];
		 for (int i=0; i<array.length;i++) {
			 k[i]=String.valueOf(array[i]);
		 }
		 return k;
	 }
	 
	//method to sort a short array
	 public String [] sortShortTable(short [] array) {
		 short temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] < array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		   String [] k= new String [array.length];
			 for (int i=0; i<array.length;i++) {
				 k[i]=String.valueOf(array[i]);
			 }
			 return k;
	 }
	 
	//method to sort a long array
	 public String [] sortLongTable(long [] array) {
		 long temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] < array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		   String [] k= new String [array.length];
			 for (int i=0; i<array.length;i++) {
				 k[i]=String.valueOf(array[i]);
			 }
			 return k;
	 }
	 
	//method to sort a float array
	 public String [] sortFloatTable(float [] array) {
		 float temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] < array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		   String [] k= new String [array.length];
			 for (int i=0; i<array.length;i++) {
				 k[i]=String.valueOf(array[i]);
			 }
			 return k;
	 }
	 
	//method to sort a double array
	 public String [] sortDoubleTable(double [] array) {
		 double temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] < array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		   String [] k= new String [array.length];
			 for (int i=0; i<array.length;i++) {
				 k[i]=String.valueOf(array[i]);
			 }
			 return k;
	 }
	 
	 //method to sort a char array
	 public String []sortCharTable(char [] array){
		 for (int i=1; i<(array.length);i++) {
			 for (int j=i;j>0;j--) {
				 if((array[j]=='a' || array[j]=='b' || array[j]=='c' || array[j]=='d' || array[j]=='e' 
						 || array[j]=='f' || array[j]=='g' || array[j]=='h' || array[j]=='i' || array[j]=='j' 
						 || array[j]=='k' || array[j]=='l' || array[j]=='m' || array[j]=='n' || array[j]=='o'
							|| array[j]=='p' || array[j]=='q' || array[j]=='r' || array[j]=='s' || array[j]=='t' 
							|| array[j]=='u' || array[j]=='v' || array[j]=='w' || array[j]=='x' || array[j]=='y' || array[j]=='z') && 
						 (array[j-1]=='a' || array[j-1]=='b' || array[j-1]=='c' || array[j-1]=='d' || array[j-1]=='e' 
							 || array[j-1]=='f' || array[j-1]=='g' || array[j-1]=='h' || array[j-1]=='i' || array[j-1]=='j' 
							 || array[j-1]=='k' || array[j-1]=='l' || array[j-1]=='m' || array[j-1]=='n' || array[j-1]=='o'
								|| array[j-1]=='p' || array[j-1]=='q' || array[j-1]=='r' || array[j-1]=='s' || array[j-1]=='t' 
								|| array[j-1]=='u' || array[j-1]=='v' || array[j-1]=='w' || array[j-1]=='x' || array[j-1]=='y' || array[j-1]=='z')) {
					 
					 char [] newArray= {array[j-1],array[j]};
					 Arrays.sort(newArray);
					 array[j-1]=newArray[0];
					 array[j]=newArray[1];
				 }
			 }
		 }
		 
		 
		 String [] k= new String [array.length];
		 for (int i=0; i<array.length;i++) {
			 k[i]=String.valueOf(array[i]);
		 }
		 return k;
	 }
	 
	//verification of a Type of list view input (if it's an int)
		public int enterAndVerifyTypeOfListViewInput() {
			int number=0;
			boolean coherent = false;	
			while(coherent == false){
				Scanner input = new Scanner(System.in);
				
				boolean inputIsInt = input.hasNextInt();
				if(inputIsInt == false) {
					coherent = false;
					System.out.println("Please, enter an int value.");
				}else{
					number = input.nextInt();
					if( number == 1 || number ==2 ) {
					break;	               
					}else {
						coherent = false;
						System.out.println("Please, enter an int value between {1,2}.");
					}
				}
					}
		return number;
		}
		
	//verification of restart input (if it's an int)
			public int restartInput() {
				int number=0;
				boolean coherent = false;	
				while(coherent == false){
					Scanner input = new Scanner(System.in);
					
					boolean inputIsInt = input.hasNextInt();
					if(inputIsInt == false) {
						coherent = false;
						System.out.println("Please, enter an int value.");
					}else{
						number = input.nextInt();
						if( number == 1 || number ==0 ) {
						break;	               
						}else {
							coherent = false;
							System.out.println("Please, enter an int value between {0,1}.");
						}
					}
						}
			return number;
			}
}
