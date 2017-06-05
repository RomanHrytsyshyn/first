package first;

public class Square implements Figure  {
public double a;
public Square (double sideA){
	a = sideA;
}
@Override
public double getSquare() {
	// TODO Auto-generated method stub
	return Math.pow(a, 2);
}
}