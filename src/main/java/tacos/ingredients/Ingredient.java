package tacos.ingredients;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingredient {
	
	@Id
	private final String id;
	private final String name;
	private final Type type;
	
	@SuppressWarnings("unused")
	private Ingredient() {
		
		this.id="";
		this.name="";
		this.type=null;
	};
	
	public Ingredient (String id, String name, Type type) {
		
		this.id=id;
		this.name=name;
		this.type=type;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}

}
