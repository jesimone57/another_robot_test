package model;

import enumeration.Facing;
import enumeration.State;

/**
 *  Square bounded environment for robot movement.
 *
 * Created by jsimone on 6/18/17.
 */
public class Table {
	private int dimensionX;
	private int dimensionY;
	private Cell[][] cellArray;

	public Table(int dimension) {
		if (dimension < 2 || dimension > 100) {
			throw new IllegalArgumentException("Table dimension must be between 2 and 100");
		}
		this.dimensionX = dimension;
		this.dimensionY = dimension;
		cellArray = new Cell[dimension][dimension];
		init();
	}

	public boolean isPositionAllowed(int x, int y) {
		boolean isPositionAllowed = true;
		if (x < 0 || y < 0 || x >= dimensionX || y >= dimensionY) {
			isPositionAllowed = false;
		}
		return isPositionAllowed;
	}

	public void positionedTo(int x, int y, Facing facing) {
		if (isPositionAllowed(x, y)) {
			for (int i = 0; i < dimensionX; i++) {
				for (int j = 0; j < dimensionY; j++) {
					if (cellArray[i][j].getState() == State.OCCUPIED) {
						cellArray[i][j].setState(State.EMPTY).setVisited(true).setOrientation(null);
						break;
					}
				}
			}
			cellArray[x][y].setState(State.OCCUPIED, facing);
		} else {
			throw new IllegalStateException("New position X=" + x + " Y=" + y + " is not allowed.");
		}
	}

	public int getDimensionX() {
		return dimensionX;
	}

	public int getDimensionY() {
		return dimensionY;
	}

	public Cell[][] getCellArray() {
		return cellArray;
	}

	private void init() {
		for (int i = 0; i < dimensionX; i++) {
			for (int j = 0; j < dimensionY; j++) {
				cellArray[i][j] = new Cell(State.EMPTY);
			}
		}
	}

	private String rowBoundary() {
		StringBuilder sb = new StringBuilder();
		sb.append("   ");
		for (int i = 0; i < dimensionX; i++) {
			sb.append("----");
		}
		sb.append("-");
		return sb.toString();
	}

	private String colIndexes() {
		StringBuilder sb = new StringBuilder();
		sb.append("   ");
		for (int i = 0; i < dimensionX; i++) {
			sb.append(String.format("  %2d", i));
		}
		return sb.toString();
	}

	public void display() {
		System.out.println(colIndexes());
		System.out.println(rowBoundary());
		for (int j = 0; j < dimensionY; j++) {
			displayRow(j);
		}
	}

	private void displayRow(int j) {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format(" %2d", j));
		for (int i = 0; i < dimensionX; i++) {
			sb.append("|").append(cellArray[i][j]);
		}
		sb.append("|");
		System.out.println(sb.toString());
		System.out.println(rowBoundary());
	}

	public static void main(String[] args) {
		Table grid = new Table(5);
		grid.display();
	}

}
