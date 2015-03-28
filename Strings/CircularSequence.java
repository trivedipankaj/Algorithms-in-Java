package algoInJava;
/****
 * 
 * Given a sequence of moves for a robot, check if the sequence is circular or not. A sequence of moves is circular if first and last positions of robot are same. A move can be on of the following.

  G - Go one unit
  L - Turn left
  R - Turn right 

Examples:

Input: path[] = "GLGLGLG"
Output: Given sequence of moves is circular 

Input: path[] = "GLLG"
Output: Given sequence of moves is circular
 * */



public class CircularSequence {
		
	public boolean isCircular(String path){
		int x=0; int y=0;
		int direction=0;
		/****
		 * direction 
		 * 0 N
		 * 1 E
		 * 2 S
		 * 3 W
		 * */
		for(int i=0; i<path.length(); i++){
			char curr = path.charAt(i);
			if(curr =='R'){
				direction = (direction +1)%4;
			}else if(curr=='L'){
				direction = (4+direction-1)%4;
			}else{
				if(direction==0){
					y++;
				}else if(direction ==1){
					x++;
				}else if(direction==2){
					y--;
				}else if(direction ==3){
					x--;
				}
			}
		}
		return x==0 && y==0;
	}
}
