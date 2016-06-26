package Chess;

public class Rook implements ChessPiece{
	
	public Rook (String color, Position startingPosition){
		super();
		super.setColor(color);
		super.setPosition(startingPosition);
		super.setType("Rook");
	}

	public String movement(){
		return "TODO";
	}

	public boolean checkValidMovement(Position start, Position end){
		// TODO
		return true;
	}

}