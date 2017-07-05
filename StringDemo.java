package assingnment4;

import java.util.ArrayList;

public class StringDemo {

	public static void main(String[] args) {
		String s = "This is a java class";
		
		String[] arr = s.split(" ");
		System.out.println("Number of words in String is : " + arr.length);
		
		System.out.println("The length of string is : " + s.length());
		
		int count =0;
		for(int i=0; i<arr.length;i++){
			//System.out.println(arr[i]);
			if(arr[i].length() == 1){
				count += 1;
			}
		}
		System.out.println("Number of Single Character words is : " + count);
		
		System.out.println("Revere of each word in String : ");
		for (int i = 0; i < arr.length; i++) {
			StringBuffer stringBuilder = new StringBuffer(arr[i]);
			System.out.print(stringBuilder.reverse()+ " ");
	    }
	    
		StringBuilder stringBuilde = new StringBuilder();
		for (int j = arr.length-1; j >= 0; j--) {
	        stringBuilde.append(arr[j]).append(' ');
	    }
	    System.out.println("\nReverse String: " + stringBuilde);
	    
	    System.out.println("Replacing java with SQL");
	    System.out.println(s.replace("java", "SQl"));
	    
	    int a = s.length()/2;
	    System.out.println("Letter at center is : " + s.charAt(a));
	    
	    System.out.println("Index at j is : " +s.indexOf("j"));
	    
	    String b = s;
	    b = s.replaceAll(" ", "");
	    b = b.toLowerCase();
	    //System.out.println(b);
	    ArrayList arrL = new ArrayList();
	    for (int i=0; i < b.length();i++){
	    	if (arrL.contains(b.charAt(i))){
	    		continue;
	    	}
	    	int counter = 1;
	    	for(int j=i+1;j<b.length();j++){
	    		if(b.charAt(i) == b.charAt(j)){
	    			counter +=1 ;
	    		}
	    	}
	    	System.out.println(b.charAt(i) + " = " + counter +" times");
	    	arrL.add(b.charAt(i));
	    	//b = b.replaceAll(b.substring(0,1),"");
	    	//System.out.println(b);
	    	//System.out.println(b.charAt(i) + " is repeated " + counter +" times");
	    	
	    }
	    ArrayList arrL1 = new ArrayList();
	    for (int i=0; i < b.length();i++){
	    	if (arrL1.contains(b.charAt(i))){
	    		continue;
	    	}
	    	int counter = 1;
	    	for(int j=i+1;j<b.length();j++){
	    		if(b.charAt(i) == b.charAt(j)){
	    			counter +=1 ;
	    		}
	    	}
	    	if (counter == 1){
	    		System.out.println("letter " + b.charAt(i)+ " occured only once ");
	    	}
	    	arrL1.add(b.charAt(i));
	    	
	    }
	    
	    String[] str1 = s.split(" ");
	    int length =0;
	    for(int i =0;i<str1.length;i++){
	    	System.out.println("index of "+ str1[i] + " is: " + s.indexOf(str1[i],length));
	    	length += str1[i].length();
	    }
	    
	    System.out.println(s.toUpperCase());
	}

}
