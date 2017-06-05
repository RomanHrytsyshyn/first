package first;

public class Appl {
	public static void main(String[] args){
Rectangle FirstRectangle = new Rectangle (2,8);
//double result = FirstRectangle.getSquare();
Rectangle SecondRectangle = new Rectangle (2,3);
Square FirstSquare = new Square (5);
Figure[] FigureArray = {FirstRectangle, SecondRectangle, FirstSquare};
for (int i = 0; i < FigureArray.length; i++){
	System.out.println(FigureArray[i].getSquare());
}
}
}