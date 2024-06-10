RAINFALL 
import java.util.Scanner; 
class rainfall 
{ 
Scanner p=new Scanner(System.in); 
float a[]=new float[12]; 
String s[]={"jan","feb","mar","apr","may","jun","july","aug","sep","oct","nov","dec"}; 
void setdata() 
{ 
} 
System.out.println("Enter rainfall values: "); 
for(int i=0;i<=11;i++) 
{  
} 
void display() 
{ 
a[i]=p.nextFloat(); 
for(int i=0;i<=11;i++) 
{ 
} 
} 
void sumavg() 
{ 
System.out.println(s[i]+"-"+a[i]); 
float avg,sum=0; 
for(int i=0;i<12;i++) 
{ 
} 
sum=sum+a[i]; 
System.out.println("Sum of rainfalls: "+sum); 
avg=sum/12; 
System.out.println("Average rainfall: "+avg); 
} 
void biggest() 
{ 
float big=a[0]; 
int c=0,i; 
for(i=1;i<12;i++) 
{ 
} 
If(big<a[i]) 
{ 
} 
big=a[i]; 
c=i; 
System.out.println("Most rainfall is : "+big+" in "+s[c]); 
} 
void smallest() 
{ 
float small=a[0]; 
int c=0,i; 
for(i=1;i<12;i++) 
{ 
} 
if(small>a[i]) 
{ 
} 
small=a[i]; 
c=i; 
System.out.println("Least rainfall is : "+small+" in "+s[c]); 
} 
void sort() 
{ 
      float temp1; 
      String temp2; 
 for(int i=0;i<12;i++) 
      { 
           for(int j=0;j<12-i-1;j++) 
           { 
            if(a[j]>a[j+1]) 
                { 
                temp1=a[j]; 
                temp2=s[j]; 
                a[j]=a[j+1]; 
                s[j]=s[j+1]; 
                a[j+1]=temp1; 
                s[j+1]=temp2; 
            } 
           } 
      } 
 for(int i=0;i<12;i++) 
      { 
        System.out.println(a[i]+" "+s[i]); 
      } 
} 
void check() 
{ 
    boolean r=false; 
    System.out.println("Enter rainfall: "); 
    float n1=p.nextFloat(); 
    for(int i=0;i<12;i++) 
         { 
          if(n1==a[i]) 
          { 
           System.out.println("The rainfall is in the month: "+s[i]); 
           r=true; 
          } 
     } 
     if(r==false) 
          System.out.println("No month had that rainfall"); 
} 
} 
class rain 
{ public static void main(String args[]) 
{ 
Scanner q=new Scanner(System.in); 
rainfall rf=new rainfall(); 
rf.setdata(); 
while(true) 
{  
System.out.println("1.Display rainfall values: "+"\n2.Sum and avg of 
rainfall"+"\n3.Most rainfall"+"\n4.Least rainfall"+"\n5.sort the rain fall"+"\n6.check 
rainfall"+"\n7.exit"); 
System.out.println("Enter choice: "); 
int n=q.nextInt(); 
switch(n) 
{ case 1:rf.display(); 
break; 
case 2:rf.sumavg(); 
break; 
case 3:rf.biggest(); 
break; 
case 4:rf.smallest(); 
break; 
case 5:rf.sort(); 
break; 
case 6:rf.check(); 
break; 
case 7:System.out.println("Thank you  21311A0516"); 
System.exit(0); 
} 
} 
} 
}
/* 
OUTPUT: 
Enter rainfall values: 23 45 76 29 67 83 57 16 25 19 66 27 
1.Display rainfall values:  
2.Sum and avg of rainfall 
3.Most rainfall 
4.Least rainfall 
5.sort the rain fall 
6.check rainfall 
7.exit 
Enter choice: 1   
jan-23.0 
feb-45.0 
mar-76.0 
apr-29.0 
may-67.0     
jun-83.0 
july-57.0 
aug-16.0 
sep-25.0 
oct-19.0 
nov-66.0 
//It displays rainfall in all months 
dec-27.0 
Enter choice: 2   
//It displays sum and average value of rainfall 
Sum of rainfalls: 533.0 
Average rainfall: 44.416668 
Enter choice: 3   
Most rainfall is : 83.0 in jun 
Enter choice: 4   
Least rainfall is : 16.0 in aug 
Enter choice: 5   
16.0  aug 
19.0  oct 
23.0  jan 
25.0  sep 
27.0  dec 
29.0  apr 
45.0  feb 
57.0  july 
66.0  nov 
67.0  may 
76.0  mar 
83.0  jun 
Enter choice: 6  
//most rainfall 
//least rainfall 
//sorting of rainfall  month 
//checking given rainfall in which month 
Enter rainfall: 83 
The rainfall is in the month: jun 
Enter choice: 7  
Thank you  21311A0516 
//exit from application 
*/