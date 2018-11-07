
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Tutorial extends DomainEntity {

	private String					title;
	private Date					moment;
	private String					summary;
	private Collection<Picture>		pictures;
	private Collection<Section>		sections;
	private Collection<Sponsorship>	sponsorchips;


	//Getters

	@NotBlank
	public String getTitle() {
		return this.title;
	}
	@Past
	public Date getMoment() {
		return this.moment;
	}
	@NotBlank
	public String getSummary() {
		return this.summary;
	}
	public Collection<Picture> getPictures() {
		return this.pictures;
	}
	public Collection<Section> getSection() {
		return this.sections;
	}
	public Collection<Sponsorship> getSponsorship() {
		return this.sponsorchips;
	}

	public void setTitle(final String tit) {
		this.title = tit;
	}
	public void setMoment(final Date mom) {
		this.moment = mom;
	}
	public void setSummary(final String summ) {
		this.summary = summ;
	}
	public void setPictures(final Collection<Picture> pics) {
		this.pictures = pics;
	}
	public void setSections(final Collection<Section> sec) {
		this.sections = sec;
	}
	public void setSponsorships(final Collection<Sponsorship> spo) {
		this.sponsorchips = spo;
	}

}
