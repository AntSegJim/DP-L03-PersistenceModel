
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

public class FixUpTask extends DomainEntity {

	private String					ticker;
	private Date					moment;
	private String					description;
	private String					adress;
	private Double					maximunPrice;
	private Integer					periodTime;

	private Customer				customer;
	private Category				category;
	private Warranty				warranty;
	private Collection<Complaint>	complaint;
	private Collection<Application>	application;


	//Getters and Setters

	@Pattern(regexp = "(^[0-9]{6}[-][A-Z0-9] {6}$)")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@Past
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

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(final String adress) {
		this.adress = adress;
	}

	public Double getMaximunPrice() {
		return this.maximunPrice;
	}

	public void setMaximunPrice(final Double maximunPrice) {
		this.maximunPrice = maximunPrice;
	}

	public Integer getPeriodTime() {
		return this.periodTime;
	}

	public void setPeriodTime(final Integer periodTime) {
		this.periodTime = periodTime;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(final Category category) {
		this.category = category;
	}

	public Warranty getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final Warranty warranty) {
		this.warranty = warranty;
	}

	public Collection<Complaint> getComplaint() {
		return this.complaint;
	}

	public void setComplaint(final Collection<Complaint> complaint) {
		this.complaint = complaint;
	}

	public Collection<Application> getApplication() {
		return this.application;
	}

	public void setApplication(final Collection<Application> application) {
		this.application = application;
	}

}
