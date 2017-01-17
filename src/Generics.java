package src;

import java.lang.reflect.Method;

class Generics 
{
	public static void printArray(Object[] o)
	{
		for(int i = 0; i < o.length; i++) {
			System.out.println(o[i].toString());
		}
	}

	public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray(intArray);
        printArray(stringArray);
        
        if(Generics.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}