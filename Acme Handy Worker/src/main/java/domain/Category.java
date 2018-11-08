
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Category extends DomainEntity {

	private String					name;
	private Category				parent;
	private Collection<Category>	soon;


	//Getters and Setters

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@ManyToOne(optional = false)
	public Category getParent() {
		return this.parent;
	}

	public void setParent(final Category parent) {
		this.parent = parent;
	}

	@OneToMany(mappedBy = "parent")
	public Collection<Category> getSoon() {
		return this.soon;
	}

	public void setSoon(final Collection<Category> soon) {
		this.soon = soon;
	}

}
