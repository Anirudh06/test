package thebooklender.ooad.models;

public class Extras {

	private String key;
	private String value;
	
	
	public Extras()
	{
		
	}
	@Override
	public String toString() {
		return "Extras [key=" + key + ", value=" + value + "]";
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public Extras(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
}
