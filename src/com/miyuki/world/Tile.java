package com.miyuki.world;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import com.miyuki.graphicslibrary.Vector2;

public abstract class Tile {

	//CONSTANTS
	
	/**
	 * Tile Size. 
	 */
	public static final int SIZE = 32;
	
	/**
	 * list of created tiles. 
	 */
	public static List<Tile> tiles = new ArrayList<Tile>();
	
	/**
	 * 
	 * Tile Texture that will be rendered.
	 * (32x32 textures pls)
	 * 
	 * @author Miyuki 
	 */
	public BufferedImage texture;

	/**
	 * if this is set to true, 
	 * it will be used as a collider for the player.
	 */
	public boolean solid;
	
	public Tile(BufferedImage texture,boolean solid) {
		this.texture = texture;
		this.solid = solid;
		
		tiles.add(this);
	}
	
	/**
	 * Called Every Frame. 
	 */
	public void onUpdate() {
		
	}
	
	/**
	 * Called Every Render Frame. 
	 */
	public void onRender(Vector2 tilePosition) {
		
	}
}
