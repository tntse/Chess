package Chess;

public class Queen extends ChessPiece{

	public Queen (String color){
		super(color);
		super.setType("Queen");
		this.setStartingPosition();
	}

	public String movement(){
		return "TODO";
	}

	public boolean checkValidMovement(Position start, Position end){
		// TODO
		return true;
	}

	private void setStartingPosition(){

		if( this.color.equals("white") )
			this.position = new Position('D', 1);
		else
			this.position = newPosition('D', 8);
		
	}

}