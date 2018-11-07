
package domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class CreditCard extends DomainEntity {

	private String	holderName;
	private String	brandName;
	private Integer	number;
	private Integer	expirationMonth;
	private Integer	expirationYear;
	private Integer	CW;


	@NotBlank
	@NotNull
	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(final String holderName) {
		this.holderName = holderName;
	}
	@NotBlank
	@NotNull
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(final String brandName) {
		this.brandName = brandName;
	}
	@NotBlank
	@NotNull
	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(final Integer number) {
		this.number = number;
	}
	@NotBlank
	@NotNull
	public Integer getExpirationMonth() {
		return this.expirationMonth;
	}

	public void setExpirationMonth(final Integer expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	@NotBlank
	@NotNull
	public Integer getExpirationYear() {
		return this.expirationYear;
	}

	public void setExpirationYear(final Integer expirationYear) {
		this.expirationYear = expirationYear;
	}
	@NotBlank
	@NotNull
	@Range(min = 100, max = 999)
	public Integer getCW() {
		return this.CW;
	}

	public void setCW(final Integer cW) {
		this.CW = cW;
	}
}
