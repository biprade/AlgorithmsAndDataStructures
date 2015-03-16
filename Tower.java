

class Tower{
		int towerNum;
		StackImplementationWithArray discs;
		Tower(int towerNum,int numberOfDiscs)
		{
			this.towerNum=towerNum;
			discs=new StackImplementationWithArray(numberOfDiscs);
		}
		public void addDisc(int data) throws Exception
		{
			if (!(this.discs.isEmpty()) && this.discs.peek()<=data)
				System.out.println("Error placing disc since it is larger than the top disc");
			else
				discs.push(data);
		}
		public void moveDiscs(int numberOfDiscs,Tower origin,Tower buffer,Tower destination) throws Exception
		{
			
			if (numberOfDiscs>0)
			{
			this.moveDiscs(numberOfDiscs-1,origin,destination,buffer);
			moveLastDisc(origin,destination);
			buffer.moveDiscs(numberOfDiscs-1, buffer, origin, destination);
			}
		}
		public void moveLastDisc(Tower origin,Tower destination) throws Exception
		{
			int disc=origin.discs.pop();
			destination.addDisc(disc);
			System.out.println("Moved disc "+disc+" from tower "+origin.towerNum+" to Tower "+destination.towerNum);
		}
		
		
	}