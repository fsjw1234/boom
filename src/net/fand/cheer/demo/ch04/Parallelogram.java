package net.fand.cheer.demo.ch04;

class Quadrangle1{
	public static void draw(Quadrangle1 q){
		
	}
}

class Square1 extends Quadrangle1{
	
}

class Anything{
	
}

public class Parallelogram extends Quadrangle1{
	public static void main(String[] args){
	Quadrangle1 q=new Quadrangle1();
	if(q instanceof Parallelogram){
		Parallelogram p=(Parallelogram) q;
	}
	if(q instanceof Square1){
		Square1 s=(Square1)q;
	}
	//System.out.println(q instanceof Anthing);
	}
}
