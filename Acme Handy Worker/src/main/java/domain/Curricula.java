
package domain;

import java.util.Collection;

import javax.validation.constraints.Pattern;

public class Curricula extends DomainEntity {

	private String							ticker;
	private PersonalRecord					personalRecord;
	private Collection<EducationRecord>		educationRecord;
	private Collection<ProfessionalRecord>	professionalRecord;
	private Collection<EndoserRecord>		endoserRecord;
	private Collection<MiscellaneousRecord>	miscellaneousRecord;


	@Pattern(regexp = "^[0-9]{6}[-][A-Z0-9] {6}$)")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	public PersonalRecord getPersonalRecord() {
		return this.personalRecord;
	}

	public void setPersonalRecord(final PersonalRecord personalRecord) {
		this.personalRecord = personalRecord;
	}

	public Collection<EducationRecord> getEducationRecord() {
		return this.educationRecord;
	}

	public void setEducationRecord(final Collection<EducationRecord> educationRecord) {
		this.educationRecord = educationRecord;
	}

	public Collection<ProfessionalRecord> getProfessionalRecord() {
		return this.professionalRecord;
	}

	public void setProfessionalRecord(final Collection<ProfessionalRecord> professionalRecord) {
		this.professionalRecord = professionalRecord;
	}

	public Collection<EndoserRecord> getEndoserRecord() {
		return this.endoserRecord;
	}

	public void setEndoserRecord(final Collection<EndoserRecord> endoserRecord) {
		this.endoserRecord = endoserRecord;
	}

	public Collection<MiscellaneousRecord> getMiscellaneousRecord() {
		return this.miscellaneousRecord;
	}

	public void setMiscellaneousRecord(final Collection<MiscellaneousRecord> miscellaneousRecord) {
		this.miscellaneousRecord = miscellaneousRecord;
	}

}
