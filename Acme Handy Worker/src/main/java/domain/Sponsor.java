
package domain;

import java.util.Collection;

public class Sponsor extends Actor {

	private Collection<Sponsorship>	sponsorship;


	//Getters and Setters
	public Collection<Sponsorship> getSponsorship() {
		return this.sponsorship;
	}

	public void setSponsorship(final Collection<Sponsorship> sponsorship) {
		this.sponsorship = sponsorship;
	}

}
