
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Complaint extends DomainEntity {

	private String				ticker;			// : String{Pattern(^[0-9]{6}[-][A-Z0-9] {6}$)}
	private Date				moment;
	private String				description;
	private Integer				numberAttachments;
	private Collection<Report>	Report;


	@Pattern(regexp = "^[0-9]{6}[-][A-Z0-9] {6}$)")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Integer getNumberAttachments() {
		return this.numberAttachments;
	}

	public void setNumberAttachments(final Integer numberAttachments) {
		this.numberAttachments = numberAttachments;
	}

	public Collection<Report> getReport() {
		return this.Report;
	}
	@NotNull
	public void setReport(final Collection<Report> report) {
		this.Report = report;
	}

}
