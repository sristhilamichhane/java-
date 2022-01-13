class doActivities{
	int a,b,c;
	void add(int i,int j)
	{ a=i;
	b=j;
		c=a+b;
	}
}

	class playingGame extends doActivities
	{
		void display() {
			System.out.println("Add:"+c);
		}
	}

class MultilevelInheritance extends playingGame{

	public static void main(String[] args) {
		MultilevelInheritance m= new MultilevelInheritance();
		m.add(20, 30);
		m.display();
	

	}

}
