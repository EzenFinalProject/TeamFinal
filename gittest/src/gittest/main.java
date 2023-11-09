package gittest;

public class main {

	public static void main(String[] args) {
		
		System.out.println("init");
		System.out.println("init2");
		
		CommentVO cmt = new CommentVO();
		
		cmt.setCno(1);
		cmt.setWriter("ÀüÇı¼º");
		cmt.setContent("±êÇãºê Å×½ºÆ®¿ë");
		int cno = cmt.getCno();
		String cw = cmt.getWriter();
		String ct = cmt.getContent();
		
		System.out.println(cno);
		System.out.println(cw);
		System.out.println(ct);
		
		
		
		
	}
	
	
	//µ¡¼À ¸Ş¼­µå
	public int asdf(int a, int b) {
		int aaaaa =  a+b;
		return aaaaa;
	}
	

	
	public int plus(int a , int b) {
		System.out.println(a+b);
		int p = a+b;
		return p;
	}
	
	public int minus(int a , int b) {
		System.out.println(a-b);
		int m = a-b;
		return m;
	}
	
	public int test(int a , int b) {
		int result = a*b;
		return result;
	}
	
	public double test2(int a , int b) {
		double result = (double)a/b;
		return result;
	}
	

}
