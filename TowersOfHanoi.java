
public class TowersOfHanoi {
	public static void main(String[] args) throws Exception
	{
		int numberOfDiscs=3;
		Tower[] towers=new Tower[3];
		for (int i=0;i<3;i++)
			towers[i]=new Tower(i,numberOfDiscs);
		for(int i=3;i>=1;i--)
			towers[0].addDisc(i);
		towers[0].moveDiscs(numberOfDiscs, towers[0], towers[1], towers[2]);
		
	}
	
	
	
	
	
}
