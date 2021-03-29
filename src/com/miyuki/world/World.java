package com.miyuki.world;

import com.miyuki.graphicslibrary.Vector2;

public class World {
	
	private Tile[][] tiles;
	private int size;
	
	public World(int[][] world,int size) {
		tiles = new Tile[size][size];
		
		for(int x = 0; x < size; x++) {
			for(int y = 0; y < size; y++) {
				tiles[x][y] = Tile.tiles.get(world[x][y]);
			}
		}
		
		this.size = size;
	}
	
	public void onUpdate() {
		for(int x = 0; x < size; x++) {
			for(int y = 0; y < size; y++) {
				tiles[x][y].onUpdate();
			}
		}
	}
	
	public void onRender() {
		for(int x = 0; x < size; x++) {
			for(int y = 0; y < size; y++) {
				tiles[x][y].onRender(new Vector2(x * Tile.SIZE,y * Tile.SIZE));
			}
		}
	}
}