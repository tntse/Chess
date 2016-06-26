package Chess;

public class King extends ChessPiece{

	public King (String color, Position startingPosition){
		super(color, startingPosition);
		super.setType("King");
	}

	public String movement(){
		return "TODO";
	}

	public boolean checkValidMovement (Position start, Position end){
		// TODO
		return true;
	}

	public boolean isKing(){
		return true;
	}

	private void setStartingPosition(){

		if( this.color.equals("white") )
			this.position = new Position('E', 1);
		else
			this.position = new Position('E', 8);
		
	}

}