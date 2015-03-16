
public class LinkedListAddition {
public static void main(String[] args){
	
	// 1st number is 135 : 5->3->1
	Digit d1=new Digit();
	d1.data=1;
	Digit d2=new Digit();
	d2.data=1;
	Digit d3=new Digit();
	d3.data=1;
	
	d1.next=d2;
	d2.next=d3;
	d3.next=null;
	
	//2nd number is 26 : 6->2
	Digit d4=new Digit();
	d4.data=6;
	Digit d5=new Digit();
	d5.data=2;
	
	d4.next=d5;
	d5.next=null;
	
	Digit num1=d1;
	Digit num2=d4;

	forwardAddition(num1, num2);
}
static Digit reverseAddition(Digit num1,Digit num2,int carry){
	//base case
	if(num1==null && num2==null)
		return null;
	int digit1,digit2;
	if (num1!=null)
		digit1=num1.data;
	else digit1=0;
	if(num2!=null)
		digit2=num2.data;
	else 
		digit2=0;
		
	int sum=digit1+digit2+carry;
	int digit=sum%10;
	Digit d=new Digit();
	d.data=digit;
	if(sum >=10){
		
		d.next=reverseAddition((num1==null)?null:num1.next,(num2==null)?null:num2.next,1);
	}
	else
		d.next=reverseAddition((num1==null)?null:num1.next, (num2==null)?null:num2.next, 0);
	return d;
		
}

static void forwardAddition(Digit num1,Digit num2){
	int l1=0;
	Digit g1=num1;
	Digit g2=num2;
	while(g1!=null){
		l1++;
		g1=g1.next;
	}
	int l2=0;
	while(g2!=null){
		l2++;
		
		g2=g2.next;
		
	}

	Digit n1=null;Digit n2=null;
	if (l1<l2){
		n1=padZero(num1,l2-l1);
		n2=num2;
	}
	else if(l2<l1){
		n2=padZero(num2,l1-l2);
		n1=num1;
	}
	else{
		n1=num1;n2=num2;

	}

	Result result=doAddition(n1,n2);
	if (result.carry==1){
		Digit d=new Digit();
		d.data=1;
		d.next=result.out;
		result.out=d;
	}
	while(result.out!=null){
		System.out.print(result.out.data+"->");
		result.out=result.out.next;
	}
		
}

static Result doAddition(Digit num1,Digit num2){

	
	
	if(num1.next==null && num2.next==null){
		int sum=num1.data+num2.data;
		int d=sum%10;
		Digit dg=new Digit();
		dg.data=d;
		Result rs=new Result();
		rs.out=dg;
		if(sum>=10)
			rs.carry=1;
		else
			rs.carry=0;
		return rs;
	}
	Result res=doAddition(num1.next, num2.next);
	int s=num1.data+num2.data+res.carry;
	int dig=s%10;
	Digit digit=new Digit();
	digit.data=dig;
	if (s>10)
		res.carry=1;
	else 
		res.carry=0;
	digit.next=res.out;
	res.out=digit;
	return res;	
}
static Digit padZero(Digit num,int numberOfZeroes){
Digit d = null;

while(numberOfZeroes!=0){
	d=new Digit();
	d.data=0;
	d.next=num;
	num=d;
	numberOfZeroes--;
}

return num;
}
}
class Digit{
	int data;
	Digit next;
}
//Wrapper class
class Result{
	int carry;
	Digit out;
}

