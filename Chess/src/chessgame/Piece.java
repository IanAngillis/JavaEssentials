package chessgame;

import java.util.Arrays;

public abstract class Piece {
	// instantievariabelen
		private int x;
		private int y;
		private int value;
		private String color;
		private String name;
		private boolean hasMoved;
		private int totalMoves;
		private String colors[] = { "BLACK", "WHITE" };
		private String kindOfPieces[] = { "PAWN", "ROOK", "KNIGHT", "BISSHOP", "QUEEN", "KING" };
		private int values[] = { 1, 5, 3, 3, 7, 9 };

		// Klassevariabelen

		// Constructors
		public Piece(int x, int y, String color, String name) {
			this.setX(x);
			this.setY(y);
			this.setColor(color);
			this.setName(name);
			this.hasMoved = false;
		}
		// Methodes

		public final String getPosition() {
			return this.getX() + this.getY() + "";
		}
		
		@Override
		public String toString() {
			return "Piece [x=" + x + ", y=" + y + ", value=" + value + ", color=" + color + ", name=" + name + ", colors="
					+ Arrays.toString(colors) + ", kindOfPieces=" + Arrays.toString(kindOfPieces) + ", values="
					+ Arrays.toString(values) + "]";
		}

		public abstract void showPossibleMovementPositions();

		// Getters and setters
		public int getTotalMoves() {
			return totalMoves;
		}
		
		public void setTotalMoves(int totalMoves) {
			this.totalMoves = totalMoves;
		}
		
		public boolean getHasMoved() {
			return hasMoved;
		}
		
		public void setHasMoved(boolean decision) {
			this.hasMoved = decision;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {

			if (this.name != null) {
				return;
			}

			if (nameIsValid(name)) {
				this.name = name;
				this.setValue();
			}
		}
		
		private boolean nameIsValid(String name) {
			for(int i = 0; i < this.getKindOfPieces().length; i++) {
				if(name.toUpperCase().equals(this.getKindOfPieces()[i])) {
					return true;
				}
			}
			return false;
		}

		public int[] getValues() {
			return this.values;
		}

		public String[] getKindOfPieces() {
			return this.kindOfPieces;
		}

		public String[] getColors() {
			return this.colors;
		}

		public int getValue() {
			return value;
		}

		private void setValue() {

			if (value == 0) {
				for (int i = 0; i < this.getKindOfPieces().length; i++) {
					if (this.getKindOfPieces()[i].equals(this.getName())) {
						this.value = this.getValues()[i];
					}
				}
			}
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {

			if (x < 0) {
				x = 0;
			} else if (x > 7) {
				x = 7;
			}

			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {

			if (y < 0) {
				y = 0;
			} else if (y > 7) {
				y = 7;
			}

			this.y = y;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {

			if (this.color == null) {

				if (color.toUpperCase().equals("WHITE") || color.toUpperCase().equals("BLACK")) {
					this.color = color;
				} else {
					return;
				}
			} else {
				return;
			}

		}
}
