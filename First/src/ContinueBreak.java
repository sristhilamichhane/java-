
public class ContinueBreak {

	public static void main(String[] args) {
		for(int i=0; i<4;i++) {
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
		for(int j=0;j<6;j++) {
			if(j==4) {
				break;
			}
			System.out.println(j);
		}
	}

}
