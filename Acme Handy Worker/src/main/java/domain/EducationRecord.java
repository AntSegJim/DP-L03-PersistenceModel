
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.URL;

public class EducationRecord extends DomainEntity {

	private String				tileDiploma;
	private Date				startDate;
	private Date				endDate;
	private String				institution;
	private String				link;
	private Collection<String>	comment;


	public String getTileDiploma() {
		return this.tileDiploma;
	}

	public void setTileDiploma(final String tileDiploma) {
		this.tileDiploma = tileDiploma;
	}
	@Past
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}
	@Past
	//Opcional
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	public String getInstitution() {
		return this.institution;
	}

	public void setInstitution(final String institution) {
		this.institution = institution;
	}
	@URL
	//Opcional
	public String getLink() {
		return this.link;
	}

	public void setLink(final String link) {
		this.link = link;
	}
	//Opcional

	public Collection<String> getComment() {
		return this.comment;
	}

	public void setComment(final Collection<String> comment) {
		this.comment = comment;
	}

}
