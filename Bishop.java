package Chess;

public class Bishop extends ChessPiece{

	public Bishop (String color, Position startingPosition){
		super(color, startingPosition);
		super.setType("Bishop");
	}

	public String movement(){
		return "TODO";
	}

	public boolean checkValidMovement(Position start, Position end){
		// TODO
		return true;
	}


	
}