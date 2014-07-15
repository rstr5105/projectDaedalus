package com.badwater.ProjectDaedalus.units;

import java.awt.Point;

public class Unit {

	private static final int DIE_TIME = 1000; //Time it takes for a creature to die.
	
	private static final int STATE_ALIVE = 0;
	private static final int STATE_DYING = 1;
	private static final int STATE_DEAD = 2;
	
	private static final int NUM_OF_STATES = 3;
	
	private int state;
	private int stateTime;
	private int maxSpeed;
	
	private float x;
	private float y;
	
	private float dx;
	private float dy;
	
	private Point destination;
	
	private float lastVelocityX;
	private float lastVelocityY;
	
	public void update(long elapsedTime){
		
	
		if(getVelocityX() < 0){
		
		}
		
		else if (getVelocityY() < 0){
			
		}
		
		else if (getVelocityX() > 0 ){
			
		}
		else if (getVelocityY() > 0){
			
		}
		else if(getState() == STATE_DYING && lastVelocityX > 0){
			
		}
		else if(getState() == STATE_DYING && lastVelocityX < 0){
			
		}
		else if(getState() == STATE_DYING && lastVelocityY > 0){
			
		}
		
		
		else if(getState() == STATE_DYING && lastVelocityY < 0){
			//do stuff
		}
		
		lastVelocityX = getVelocityX();
		lastVelocityY = getVelocityY();
	
	}
	public float getMaxSpeed(){
		return maxSpeed;
	}
	
	public void wakeup() {
		if (getState() == STATE_ALIVE && destination != null){
			moveTowardDestination(destination);
		}
	}
	
	public int getState(){
		return state;
	}
	
	public float getX() {
		// TODO Auto-generated method stub
		return x;
	}

	public float getY() {
		// TODO Auto-generated method stub
		return y;
	}
	
	public void setX(float x){
		this.x = x;
	}
	
	public void setY(float y){
		this.y = y;
	}
	public float getVelocityX(){
		return dx;
	}
	public float getVelocityY(){
		return dy;
	}
	
	public void setVelocityX(float dx){
		this.dx = dx;
	}
	
	public void setVelocityY(float dy){
		this.dy = dy;
	}
	
	public void moveTowardDestination(Point destination){
		/*
		 * TODO: 
		 * 		Write a pathfinder class.
		 *		Debug PathFinder Class.
		 *		re-write pathfinder class, because the first N iterations are probably not going to be good enough for me.
		 *		repeat 1 - 3 
		 */
	}
	
	public void clearDestination(Point destination){
		if(destination != null){
			setDestination(null);
		}
	}
	public void setDestination(Point destination){
		this.destination = destination;
	}
	

	
}
