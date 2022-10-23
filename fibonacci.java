class Fibonacci{
public static void main(String args[]){
int maxNumber =10, previousNumber =0, nextNumber =1;
System.out.println("Fibonacci series of "+maxNumber+"numbers:");
int i=1;
while(i<= maxNumber)
{
System.out.println(previousNumber+" ");
int sum = previousNumber + nextNumber;
previousNumber = nextNumber;
nextNumber = sum;
i++;
}
}
}
