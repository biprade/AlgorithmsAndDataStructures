
// Stock Span Problem Revisit

public class StockSpanProblem {
	
public static void main(String[] args){
	Stack<Integer> s=new Stack<Integer>();
	int[] stock={100, 80, 60, 70, 60, 75, 85};

	int[] stock_span = new int[stock.length];
	stock_span[0]=1;
	s.push(0);
	for(int i=1;i<stock.length;i++){
		while(!s.isEmpty() && stock[s.peek()]<=stock[i])
			s.pop();
		if(s.isEmpty())
			stock_span[i]=i+1;
		else
			stock_span[i]=i-s.peek();
		s.push(i);
		
}		
for(int i=0;i<stock.length;i++){
	System.out.println(stock_span[i]);
}
	
}
}

