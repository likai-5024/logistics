package logistics;

public class TestStar {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 graphicTree(5);
	}
	public static void graphicTree(int layer) {
	    String spaceStr="";
		for (int i=1;i<=layer;i++) {
			int spaces=layer-i;
			for(int j=0;j<spaces;j++) {
			    System.out.print(" ");
				if(i==1) {
				     spaceStr+=" ";
			    }
			}
			int stars=2*i-1;
			for (int j=0;j<stars;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j=0;j<layer;j++) {
			System.out.println(spaceStr+"*");
		}
	}
}