
package Chess;

public abstract class ChessPiece {
	private String color;
	private Position boardPosition;
	private String type = "";

	public ChessPiece(String color, Position startingPosition){
		setColor(Color);
		setPosition(startingPosition);
	}

	abstract private void setStartingPosition();

	abstract public String movement();

	abstract public boolean checkValidMovement(Position start, Position end);

	public boolean isKing(){
		return false;
	}
	
	public String getColor(){
		return this.color;
	}

	public void setColor(String color){
		String newColor = color.toLowercase();

		if(newColor.equals("white"))
			this.color = newColor;
		else
			this.color = "black";
	}
	
	protected void setType(String newType){
		this.type = newType;
	}

	public String getType(){
		return this.type;
	}
	
	public Position getPosition(){
		return this.boardPosition;
	}

	public void setPosition(Position newPosition){
		this.boardPosition = newPosition;
	}
}