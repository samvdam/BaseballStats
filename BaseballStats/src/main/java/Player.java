
public class Player {

	private String name;
	private int ab;
	private int h;
	private int d;
	private int t;
	private int hr;
	private int r;
	private int bb;

	public Player() {

	}

	public Player(String name, int ab, int h, int d, int t, int hr, int r, int bb) {
		this.name = name;
		this.ab = ab;
		this.h = h;
		this.d = d;
		this.t = t;
		this.hr = hr;
		this.r = r;
		this.bb = bb;
	}
	
	public double ba() {
		return h*1.0/ab;
	}
	
	public double obp() {
		return (h+bb*1.0)/(ab+bb);
	}
	
	public double slg() {
		return this.tb()/ab;
	}
	
	public double obs() {
		return this.slg()+this.obp();
	}
	
	public double tb() {
		return h+2.0*d+3.0*t+4.0*hr;
	}

}
