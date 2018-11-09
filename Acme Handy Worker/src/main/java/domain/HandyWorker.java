
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class HandyWorker extends Actor {

	private String					makeHandyWorker;
	private Integer					score;

	private Collection<Endorsement>	endorseHWorker;
	private Collection<Endorsement>	receiveEndorseFromHWorker;

	private Collection<Application>	Applicacion;

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
	@ElementCollection
	@OneToMany(mappedBy = "handyWorker")
	public Collection<Endorsement> getEndorseHWorker() {
		return this.endorseHWorker;
	}

	public void setEndorseHWorker(final Collection<Endorsement> endorseHWorker) {
		this.endorseHWorker = endorseHWorker;
	}
	@ElementCollection
	@OneToMany(mappedBy = "handyWorker")
	public Collection<Endorsement> getReceiveEndorseFromHWorker() {
		return this.receiveEndorseFromHWorker;
	}

	public void setReceiveEndorseFromHWorker(final Collection<Endorsement> receiveEndorseFromHWorker) {
		this.receiveEndorseFromHWorker = receiveEndorseFromHWorker;
	}
	@ElementCollection
	@OneToMany(mappedBy = "handyWorker")
	public Collection<Application> getApplicacion() {
		return this.Applicacion;
	}

	public void setApplicacion(final Collection<Application> applicacion) {
		this.Applicacion = applicacion;
	}
	@ElementCollection
	@OneToMany
	public Collection<Curricula> getCurricula() {
		return this.curricula;
	}

	public void setCurricula(final Collection<Curricula> curricula) {
		this.curricula = curricula;
	}
	@ElementCollection
	@OneToMany
	public Collection<Tutorial> getTutorial() {
		return this.tutorial;
	}

	public void setTutorial(final Collection<Tutorial> tutorial) {
		this.tutorial = tutorial;
	}

}
