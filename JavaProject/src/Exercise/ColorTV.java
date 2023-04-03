package Exercise;

class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}
public class ColorTV extends TV{
	int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		//size 필드는 private 제한자라 서브클래스에서 접근할 수 없으므로 get 메소드로 필드값 가져옴
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}
	
}
