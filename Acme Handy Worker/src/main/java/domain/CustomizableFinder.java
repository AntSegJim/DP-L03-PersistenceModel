
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class CustomizableFinder extends DomainEntity {

	private Integer	resultNumber;
	private Integer	timeCache;


	//Getters and Setters

	@NotNull
	public Integer getResultNumber() {
		return this.resultNumber;
	}

	public void setResultNumber(final Integer resultNumber) {
		this.resultNumber = resultNumber;
	}

	@NotNull
	public Integer getTimeCache() {
		return this.timeCache;
	}

	public void setTimeCache(final Integer timeCache) {
		this.timeCache = timeCache;
	}

}
