
public class StaticInRecursion {
	int count=0;
public static void main(String[] args){
	StaticInRecursion s=new StaticInRecursion();
	s.test();
}
void test(){
	
	if (count==5)
		return;
	else{
		count++;
		System.out.println(count);
		test();
		//return;
	}
}
}
