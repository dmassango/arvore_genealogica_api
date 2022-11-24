package mz.co.dario.core.entity.simpleentity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("locality")
public class Locality extends SimpleEntity implements Serializable  {

	private static final long serialVersionUID = -4140015420066438048L;
	
	public static final String TYPE = "locality";

	public String getType() {
		return TYPE;
	}

}
