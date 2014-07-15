package com.project.ProjectDaedalus.helpers;

public class Helpers {
	private static final int TILE_SIZE = 64;
	
	public static final int TILE_SIZE_BITS = 6;
	
	
	/*
	 * Moved this from The WorldMapRenderer to here because I seem to use it in multiple locations.  
	 * We'll see if I still need it here, or if I can just leave it as a WMR method.
	 */
	public static int pixelsToTiles(float pixels){
		return pixelsToTiles(Math.round(pixels));
	}
	
	/*
	 * SAME
	 */
	public static int pixelsToTiles(int pixels){
		return (int)Math.floor((float)pixels / TILE_SIZE);
	}
	/*
	 * SAME
	 */
	
	public static int tilesToPixels(int numOfTiles){
		
		return numOfTiles << TILE_SIZE_BITS;
		
	}
}
