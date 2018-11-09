
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Warranty extends DomainEntity {

	private String				title;
	private Collection<String>	terms;
	private Collection<String>	laws;


	//Getters and Setters
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@ElementCollection
	public Collection<String> getTerms() {
		return this.terms;
	}

	public void setTerms(final Collection<String> terms) {
		this.terms = terms;
	}
	@ElementCollection
	public Collection<String> getLaws() {
		return this.laws;
	}

	public void setLaws(final Collection<String> laws) {
		this.laws = laws;
	}

}
