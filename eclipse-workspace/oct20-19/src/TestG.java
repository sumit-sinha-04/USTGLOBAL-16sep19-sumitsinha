
public class TestG {
	public static void main(String[] args) {
		FirstGen f= new FirstGen();
		f.msg();
		f.call();
		System.out.println("**************************");


		SecondGen s= new SecondGen();
		s.msg();
		s.call();
		s.games();
		System.out.println("**************************");

		ThirdGen th= new ThirdGen();
		th.call();
		th.msg();
		th.games();
		th.camera();

	}
}
