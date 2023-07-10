public class Division implements Arithmetic{
public double calculate(double a,double b){
if (b==0){
throw new ArithmeticException("cannot divide by zero");
}
return a/b;
}
}
