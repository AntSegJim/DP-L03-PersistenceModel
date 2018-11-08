
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Sponsor extends Actor {

	private Collection<Sponsorship>	sponsorship;


	//Getters and Setters
	@OneToMany
	public Collection<Sponsorship> getSponsorship() {
		return this.sponsorship;
	}

	public void setSponsorship(final Collection<Sponsorship> sponsorship) {
		this.sponsorship = sponsorship;
	}

}
