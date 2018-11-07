
package domain;

import java.util.Collection;

public class Administrator extends Actor {

	private Collection<Category>	categories;


	//Getters and Setters
	public Collection<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(final Collection<Category> categories) {
		this.categories = categories;
	}

}
