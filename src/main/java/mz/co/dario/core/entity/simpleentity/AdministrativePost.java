package mz.co.dario.core.entity.simpleentity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("administrativepost")
public class AdministrativePost extends SimpleEntity implements Serializable  {

	private static final long serialVersionUID = 3085259156727724731L;
	
	public static final String TYPE = "administrativepost";

	public String getType() {
		return TYPE;
	}

}
