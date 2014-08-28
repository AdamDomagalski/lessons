package lesson001;

public class Apple {
	final private Integer weight;
	
	public Apple(Integer weight){
		this.weight = weight;
	}
	
	public Integer getWeight(){
		return weight;
	}
	
	@Override
	public String toString(){
		return "Apple [weight="+ weight+ "]";
	}
}
