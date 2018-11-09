
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Access(AccessType.PROPERTY)
public class Curricula extends DomainEntity {

	private String							ticker;
	private PersonalRecord					personalRecord;
	private Collection<EducationRecord>		educationRecord;
	private Collection<ProfessionalRecord>	professionalRecord;
	private Collection<EndoserRecord>		endoserRecord;
	private Collection<MiscellaneousRecord>	miscellaneousRecord;


	//@Pattern(regexp = "^[0-9]{6}\\-[A-Z 0-9]{6}$")
	@Column(unique = true)
	//@Pattern(regexp = "^[0-9]{6}$")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@OneToOne(optional = false)
	public PersonalRecord getPersonalRecord() {
		return this.personalRecord;
	}

	public void setPersonalRecord(final PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	}

	@OneToMany
	public Collection<EducationRecord> getEducationRecord() {
		return this.educationRecord;
	}

	public void setEducationRecord(final Collection<EducationRecord> educationRecord) {
		this.educationRecord = educationRecord;
	}

	@OneToMany
	public Collection<ProfessionalRecord> getProfessionalRecord() {
		return this.professionalRecord;
	}

	public void setProfessionalRecord(final Collection<ProfessionalRecord> professionalRecord) {
		this.professionalRecord = professionalRecord;
	}

	@OneToMany
	public Collection<EndoserRecord> getEndoserRecord() {
		return this.endoserRecord;
	}

	public void setEndoserRecord(final Collection<EndoserRecord> endoserRecord) {
		this.endoserRecord = endoserRecord;
	}

	@OneToMany
	public Collection<MiscellaneousRecord> getMiscellaneousRecord() {
		return this.miscellaneousRecord;
	}

	public void setMiscellaneousRecord(final Collection<MiscellaneousRecord> miscellaneousRecord) {
		this.miscellaneousRecord = miscellaneousRecord;
	}

}
