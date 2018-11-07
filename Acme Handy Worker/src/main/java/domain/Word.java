
package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class Word extends DomainEntity {

	private String	name;
	private Integer	value;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Range(min = 0, max = 1)
	public Integer getValue() {
		return this.value;
	}

	public void setValue(final Integer value) {
		this.value = value;
	}

}
