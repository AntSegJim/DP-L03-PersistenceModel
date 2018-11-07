
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Range;

public class Application extends DomainEntity {

	private Date				moment;
	private Integer				status;
	private Double				price;
	private Collection<String>	comments;

	private HandyWorker			handyWorker;

	private CreditCard			creditCard;

	private FixUpTask			fixUpTask;

	private Collection<Phase>	phases;


	//Getters and Setters

	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@Range(min = 0, max = 2)
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(final Integer status) {
		this.status = status;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(final Double price) {
		this.price = price;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}

	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

	public Collection<Phase> getPhases() {
		return this.phases;
	}

	public void setPhases(final Collection<Phase> phases) {
		this.phases = phases;
	}

}
