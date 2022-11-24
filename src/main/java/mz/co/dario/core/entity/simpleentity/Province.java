package mz.co.dario.core.entity.simpleentity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("province")
public class Province extends SimpleEntity implements Serializable  {

	private static final long serialVersionUID = -1395587329000301460L;
	
	public static final String TYPE = "province";

	public String getType() {
		return TYPE;
	}

}
