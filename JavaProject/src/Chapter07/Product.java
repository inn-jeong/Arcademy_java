package Chapter07;

public class Product<T,M> {
	private T kind;//T=Tv
	private M model;//M=String
	//T=Tv가 리턴 타입
	public T getKind() {
		return kind;
	}
	//T=Tv가 매개변수 타입
	//Tv kind = new Tv()
	public void setKind(T kind) {
		this.kind = kind;
	}
	//M=String이 리턴 타입
	public M getModel() {
		return model;
	}
	//M=String이 매개변수 타입
	public void setModel(M model) {
		this.model = model;
	}
}
