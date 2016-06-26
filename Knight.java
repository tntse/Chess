package Chess;

public class Knight extends ChessPiece{

	public Knight (String color, Position startingPosition){
		super(color, startingPosition);
		super.setType("Knight");
	}

	public String movement (){
		return "TODO";
	}

	public boolean checkValidMovement (Position start, Position end){
		// TODO
		return true;
	}

}