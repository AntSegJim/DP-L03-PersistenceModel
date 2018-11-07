
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

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
