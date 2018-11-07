
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.Pattern;

public class Filter extends DomainEntity {

	private String					ticker;
	private String					description;
	private String					adress;
	private Date					startDate;
	private Date					endDate;
	private Double					lowPrice;
	private Double					highPrice;

	private Collection<Warranty>	warranty;
	private Collection<Category>	category;


	//Getters and Setters
	@Pattern(regexp = "(^[0-9]{6}[-][A-Z0-9] {6}$)")
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
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

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	public Double getLowPrice() {
		return this.lowPrice;
	}

	public void setLowPrice(final Double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public Double getHighPrice() {
		return this.highPrice;
	}

	public void setHighPrice(final Double highPrice) {
		this.highPrice = highPrice;
	}

	public Collection<Warranty> getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final Collection<Warranty> warranty) {
		this.warranty = warranty;
	}

	public Collection<Category> getCategory() {
		return this.category;
	}

	public void setCategory(final Collection<Category> category) {
		this.category = category;
	}

}
