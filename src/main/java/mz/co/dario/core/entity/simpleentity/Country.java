package mz.co.dario.core.entity.simpleentity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("country")
public class Country extends SimpleEntity implements Serializable {

	private static final long serialVersionUID = 4081828880709012887L;
	
	public static final String TYPE = "country";

	public String getType() {
		return TYPE;
	}

}
