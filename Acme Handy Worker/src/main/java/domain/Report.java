
package domain;

import java.util.Collection;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class Report extends DomainEntity {

	private Date					moment;		// : Date {NotBlank}
	private String					description;	// : String {NotBlank}
	private Integer					published;		//: Integer {NotBlank}
	private Collection<Note>		note;
	private Collection<Attachment>	attachment;


	@NotBlank
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}
	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
	@NotBlank
	public Integer getPublished() {
		return this.published;
	}

	public void setPublished(final Integer published) {
		this.published = published;
	}

	public Collection<Note> getNote() {
		return this.note;
	}

	public void setNote(final Collection<Note> note) {
		this.note = note;
	}

	public Collection<Attachment> getAttachment() {
		return this.attachment;
	}

	public void setAttachment(final Collection<Attachment> attachment) {
		this.attachment = attachment;
	}

}
