projectDaedalus
===============

Project Daedalus
Table of Contents:
	

	
Information:
	Game Mechanic:
	
	In the current Real Time Strategy Schema, the player is simply given a large amount of information about the world in which s/he is playing.  There is no need to observe a unit in order to figure out whether he is friend, neutral or foe, or which other player he is owned by.  The game simply tells you.  
	
	In order to more accurately simulate real warfare, ProjectDaedalus will initially treat every unit that is observed for the first time as a neutral, generic unit of its type.   I.E: When Player1 sees Player2's infantry unit for the first time Daedalus only shows the player the information that s/he has gathered on that unit type within a +/- accuracy rating, if the this is the first observation of said unit, Daedalus responds by treating the unit as a true neutral generic, which the player can override, Telling Daedalus to treat the unit as either a friend, foe, or neutral unit.  
	
	While the player is observing the unit, Daedalus's accuracy rating will continue to go up, however observation can only occur if at least one of the following conditions is met: A)The unit is currently on the same section of map that the player is looking at, B)The player has at least one unit within view range of the Bogey Unit, or C)The Bogey Unit is within range of one of the players radar facilities.  This will allow Daedalus to provide the player with certain assumptions about units that are observed in the future.  
	
	Further Daedalus should incorporate a prediction engine based planning system.  This system is to serve as an advisor to the player, and makes it's predictions on the amount of data the player has gathered about the world around him/her.  
	
	When the player enters planning mode he is shown a map of the currently observable world.  This map CAN BE STALE!  So the longer the player takes to plan his course of action, the less accurate of a prediction the engine will provide.  While in planning mode, the player can generate a series of mock (build, move, attack) orders on the planning map.  Each order will create a node along a timeline that represents the predicted result if that order is carried out.  Each of these nodes will also spawn a time line of length N - 1 where N is the number of nodes on the originating Timeline so that the player is given the ability to see (tree math here) predictions based on the orders that he has planned.  
	
	In future releases Icharus, the prediction engine, can be user configured to show different presets of predictions, for example Player1 decides that when s/he enters planning mode s/he wants Ichars to show him/her The Most Likely prediction, the most accurate prediction, and the least likely prediction, while Player2 wants Icharus to simply display all predictions for a given move order, the most likely prediction for a given build order, and the most accurate prediction for all orders if they are carried out exactly as planned.  
	
	
	