package com.sriindu.java.oopss;


interface ChessPlayer{
	void moves();
}

class queens implements ChessPlayer{
	public void moves() {
		System.out.println("up , rigght,left ,down ");
	}
}

class rook implements ChessPlayer{
	public void moves() {
		System.out.println("up ,down ");
	}
}



public class Interface {

	public static void main(String[] args) {
		
     ChessPlayer c=new queens();
     c.moves();
     ChessPlayer r= new rook();
     r.moves();
	}

}
