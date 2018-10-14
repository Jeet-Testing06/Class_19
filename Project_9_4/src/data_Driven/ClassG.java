// Array and BDD Framework theory

package data_Driven;

public class ClassG {
	
	public static void main(String[] args) {
		
		
		int i[] = new int[3];
		
		int []j = new int[3];
		
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		
		j[0] = 1;
		j[1] = 2;
		j[2] = 3;
		
		int k[] = {1,2,3};
		
		int []l = {1,2,3};
		
		for(int m=0; m<i.length; m++)
		{
			System.out.println(i[m]);
		}
		
		System.out.println();
		
		for(int m=0; m<i.length; m++)
		{
			System.out.println(j[m]);
		}
		
		System.out.println();
		
		for(int m=0; m<k.length; m++)
		{
			System.out.println(k[m]);
		}
		
		System.out.println();
		
		for(int m=0; m<l.length; m++)
		{
			System.out.println(l[m]);
		}
		
	}

}


/*BDD Framework
behavior-driven development

use case  --  use case annotation generate  --  annotation will be applied
on method  --  and will write the logic inside method based upon annotation

*/