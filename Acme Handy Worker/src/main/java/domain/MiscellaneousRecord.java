
package domain;

import java.util.Collection;

import org.hibernate.validator.constraints.URL;

public class MiscellaneousRecord extends DomainEntity {

	private String				title;
	private String				link;
	private Collection<String>	comments;


	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@URL
	//Opcional
	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}
	//Opcional

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}

}
