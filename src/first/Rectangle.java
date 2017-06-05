package first;

public class Rectangle implements Figure  {
public double a;
public double b;
public Rectangle (double sideA, double sideB){
	a = sideA;
	b = sideB;
}
@Override
public double getSquare() {
	// TODO Auto-generated method stub
	return a * b;
}
}