import java.util.*;

class Pattern3

{

public static void main (String[] args) 
{
    
int n,i,j;
    
Scanner sc=new Scanner(System.in);
    
System.out.println("Enter n value : ");
    
n=sc.nextInt();
    
char ch='A';
    
for(i=1;i<=n;i++)
    
{
        
for(j=1;j<=i;j++)
        
{
            
System.out.println(ch+" ");
            
ch++;
        
}
        
System.out.println( );
    
}
    

}

}