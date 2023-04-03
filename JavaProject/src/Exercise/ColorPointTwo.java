package Exercise;

class PointTwo{
	private int x,y;
	public PointTwo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {//x,y 재설정
		this.x = x;
		this.y = y;
	}
}
public class ColorPointTwo extends PointTwo{
	String color;
	public ColorPointTwo() {
		super(0,0);
		this.color = "BLACK";
	}
	public ColorPointTwo(int x, int y) {
		super(x,y);
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return color+"색의 ("+getX()+","+getY()+")의 점입니다.";
	}
	public static void main(String[] args) {
		ColorPointTwo zeroPoint = new ColorPointTwo();
		System.out.println(zeroPoint.toString());
		ColorPointTwo cp = new ColorPointTwo(10,10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString());
	}
}
