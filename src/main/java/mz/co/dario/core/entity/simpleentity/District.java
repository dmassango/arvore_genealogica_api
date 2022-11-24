package mz.co.dario.core.entity.simpleentity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("district")
public class District extends SimpleEntity implements Serializable {

	private static final long serialVersionUID = 6542586030503779868L;
	
	public static final String TYPE = "district";

	public String getType() {
		return TYPE;
	}

}
