
package domain;

import java.util.Collection;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Note extends DomainEntity {

	private Date				moment;			//: Date {NotBlank}
	private String				comment;			// : String {NotBlank}
	private Collection<String>	optionalComments;	// Opcional


	@NotBlank
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}
	//Opcional

	public Collection<String> getOptionalComments() {
		return this.optionalComments;
	}

	public void setOptionalComments(final Collection<String> optionalComments) {
		this.optionalComments = optionalComments;
	}

}
