
package domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class CustomizableFinder extends DomainEntity {

	private Integer	resultNumber;
	private Integer	timeCache;


	//Getters and Setters

	@NotNull
	@NotBlank
	public Integer getResultNumber() {
		return this.resultNumber;
	}

	public void setResultNumber(final Integer resultNumber) {
		this.resultNumber = resultNumber;
	}

	@NotNull
	@NotBlank
	public Integer getTimeCache() {
		return this.timeCache;
	}

	public void setTimeCache(final Integer timeCache) {
		this.timeCache = timeCache;
	}

}
