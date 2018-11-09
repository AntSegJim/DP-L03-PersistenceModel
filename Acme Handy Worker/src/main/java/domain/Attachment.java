
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Attachment extends DomainEntity {

	private String	link;	// : String {Url}{NotBlank}


	public String getLink() {
		return this.link;
	}

	@URL
	@NotBlank
	public void setLink(final String link) {
		this.link = link;
	}

}
