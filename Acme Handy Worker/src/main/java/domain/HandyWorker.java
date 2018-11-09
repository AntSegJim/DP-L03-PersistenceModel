
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class HandyWorker extends Actor {

	private String					makeHandyWorker;
	private Integer					score;

	private Collection<Endorsement>	endorseHWorker;
	private Collection<Endorsement>	receiveEndorseFromHWorker;

	private Collection<Application>	application;

	private Collection<Curricula>	curricula;

	private Collection<Tutorial>	tutorial;


	public String getMakeHandyWorker() {
		return this.makeHandyWorker;
	}

	public void setMakeHandyWorker(final String makeHandyWorker) {
		this.makeHandyWorker = makeHandyWorker;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(final Integer score) {
		this.score = score;
	}

	@OneToMany(mappedBy = "handyWorker")
	public Collection<Endorsement> getEndorseHWorker() {
		return this.endorseHWorker;
	}

	public void setEndorseHWorker(final Collection<Endorsement> endorseHWorker) {
		this.endorseHWorker = endorseHWorker;
	}

	@OneToMany(mappedBy = "handyWorker")
	public Collection<Endorsement> getReceiveEndorseFromHWorker() {
		return this.receiveEndorseFromHWorker;
	}

	public void setReceiveEndorseFromHWorker(final Collection<Endorsement> receiveEndorseFromHWorker) {
		this.receiveEndorseFromHWorker = receiveEndorseFromHWorker;
	}

	@OneToMany(mappedBy = "handyWorker")
	public Collection<Application> getApplication() {
		return this.application;
	}

	public void setApplication(final Collection<Application> application) {
		this.application = application;
	}

	@OneToMany
	public Collection<Curricula> getCurricula() {
		return this.curricula;
	}

	public void setCurricula(final Collection<Curricula> curricula) {
		this.curricula = curricula;
	}

	@OneToMany
	public Collection<Tutorial> getTutorial() {
		return this.tutorial;
	}

	public void setTutorial(final Collection<Tutorial> tutorial) {
		this.tutorial = tutorial;
	}

}
