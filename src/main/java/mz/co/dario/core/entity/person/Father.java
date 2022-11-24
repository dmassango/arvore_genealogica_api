package mz.co.dario.core.entity.person;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("father")
public class Father extends Person implements Serializable {

	private static final long serialVersionUID = 4081828880709012887L;
	
	public static final String TYPE = "father";

	public String getType() {
		return TYPE;
	}

}
