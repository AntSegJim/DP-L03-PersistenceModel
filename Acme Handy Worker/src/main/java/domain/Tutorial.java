
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Tutorial extends DomainEntity {

	private String					title;
	private Date					moment;
	private String					summary;
	private Collection<Picture>		picture;
	private Collection<Section>		section;
	private Collection<Sponsorship>	sponsorship;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}
	@ManyToMany
	public Collection<Picture> getPicture() {
		return this.picture;
	}

	public void setPicture(final Collection<Picture> picture) {
		this.picture = picture;
	}
	@OneToMany(cascade = CascadeType.ALL)
	public Collection<Section> getSection() {
		return this.section;
	}

	public void setSection(final Collection<Section> section) {
		this.section = section;
	}
	@ManyToMany
	public Collection<Sponsorship> getSponsorship() {
		return this.sponsorship;
	}

	public void setSponsorship(final Collection<Sponsorship> sponsorship) {
		this.sponsorship = sponsorship;
	}

}
