package mz.co.dario.core.entity.territoryclassifier;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("birthPlace")
public class BirthPlace extends TerritoryClassifier implements Serializable {

	private static final long serialVersionUID = 4081828880709012887L;

	public static final String TYPE = "birthPlace";

	public String getType() {
		return TYPE;
	}

}
