
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Customer extends Actor {

	private Integer					score;

	private Collection<Endorsement>	endorseCustomer;
	private Collection<Endorsement>	receiveEndorseFromCustomer;


	//Getters and Setters
	public Integer getScore() {
		return this.score;
	}

	public void setScore(final Integer score) {
		this.score = score;
	}

	@OneToMany(mappedBy = "customer")
	public Collection<Endorsement> getEndorseCustomer() {
		return this.endorseCustomer;
	}

	public void setEndorseCustomer(final Collection<Endorsement> endorseCustomer) {
		this.endorseCustomer = endorseCustomer;
	}

	@OneToMany(mappedBy = "customer")
	public Collection<Endorsement> getReceiveEndorseFromCustomer() {
		return this.receiveEndorseFromCustomer;
	}

	public void setReceiveEndorseFromCustomer(final Collection<Endorsement> receiveEndorseFromCustomer) {
		this.receiveEndorseFromCustomer = receiveEndorseFromCustomer;
	}

}
