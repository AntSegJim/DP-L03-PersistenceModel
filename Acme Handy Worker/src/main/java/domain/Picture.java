
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Picture extends DomainEntity {

	private String	picture;	//url


	//Getters
	@URL
	@NotBlank
	public String getPicture() {
		return this.picture;
	}

	//Setters
	public void setPicture(final String pic) {
		this.picture = pic;
	}

}
