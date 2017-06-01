package Entity;
public class Guitar {
private String id;
	private Double price;
	private Builder builder;
	private Type type;
	private int numStrings;
	private GuitarSpec spec;

public Guitar(){
		
	}
	public Guitar(String id, Double price, Builder builder,  Type type, int numStrings) {
		super();
		this.id=id;
		this.price=price;
		this.type = type;
		this.numStrings = numStrings;
		this.spec=new GuitarSpec();
	}
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getNumStrings() {
		return numStrings;
	}
	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public GuitarSpec getSpec() {
		//return new GuitarSpec(builder,model,type,backWood,topWood,numStrings);
		return spec;
	}
	public void setSpec(GuitarSpec spec) {
		this.spec = spec;
	}
}
