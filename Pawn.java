package Chess;

public class Pawn implements ChessPiece{
	
	public Pawn (String color, Position startingPosition){
		super();
		super.setColor(color);
		super.setPosition(startingPosition);
		super.setType("Pawn");
	}

	public String movement(){
		return "TODO";
	}

	public boolean checkValidMovement(Position start, Position end){
		// TODO
		return true;
	}

}