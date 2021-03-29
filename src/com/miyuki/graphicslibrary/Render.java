package com.miyuki.graphicslibrary;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public final class Render {
	
	static Graphics g;
	static Dimension viewport;
	
	/**
	 * clears the viewport (removes all the bullshit you have rendered on it 
	 */
	public static void clearViewport() {
		g.clearRect(0,0,viewport.width,viewport.height);
	}
	
	/**
	 * draws a image relative to the Camera Position. 
	 */
	public static void drawImage(BufferedImage image,Vector2 position,Vector2 scale) {
		if(!insideViewport(position)) {
			return;
		}
		
		Vector2i location = toRenderCoords(position);
		Vector2i size = scale.toVector2i();
		
		g.drawImage(image,location.x,location.y,size.x,size.y,null);
	}
	
	/**
	 * draws a image relative to the Camera Position. 
	 */
	public static void drawImage(BufferedImage image,Vector2 position) {
		if(!insideViewport(position)) {
			return;
		}
		
		Vector2i location = toRenderCoords(position);
		
		g.drawImage(image,location.x,location.y,null);
	}
	
	/**
	 * draws a image without calculating the Image Position Relative to the camera (use this for GUI). 
	 */
	public static void drawStaticImage(BufferedImage image,Vector2 position,Vector2 scale) {
		if(!insideStaticViewport(position)) {
			return;
		}
		
		Vector2i location = position.toVector2i();
		Vector2i size = scale.toVector2i();
		
		g.drawImage(image,location.x,location.y,size.x,size.y,null);
	}
	
	/**
	 * draws a image without calculating the Image Position Relative to the camera (use this for GUI). 
	 */
	public static void drawStaticImage(BufferedImage image,Vector2 position) {
		if(!insideStaticViewport(position)) {
			return;
		}
		
		Vector2i location = position.toVector2i();
		
		g.drawImage(image,location.x,location.y,null);
	}
	
	/**
	 * Checks if a renderer coords are inside the Viewport.
	 * (this one is for relative coordinates to the camera)
	 */
	public static boolean insideViewport(Vector2 position) {
		Vector2i pos = toRenderCoords(position);
		
		if(pos.x < 0 || pos.x > viewport.width) {
			return true;
		}
		
		if(pos.y < 0 || pos.y > viewport.height) {
			return true;
		}
		return false;
	}
	

	/**
	 * Checks if a renderer coords are inside the Viewport. 
	 * (this one is for static coordinates)
	 */
	public static boolean insideStaticViewport(Vector2 position) {
		Vector2i pos = position.toVector2i();
		
		if(pos.x < 0 || pos.x > viewport.width) {
			return true;
		}
		
		if(pos.y < 0 || pos.y > viewport.height) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * returns the Coordinates of a Calculated Vector for rendering into the viewport. 
	 */
	public static Vector2i toRenderCoords(Vector2 position) {
		return new Vector2i((int) (position.x - Camera.position.x),(int) (position.y - Camera.position.y)); 
	}
	
	public static Dimension getViewport() {
		return viewport;
	}
	
	public static void setGraphics(Graphics g) {
		Render.g = g;
	}
	
	public static void setViewport(Dimension viewport) {
		Render.viewport = viewport;
	}
}