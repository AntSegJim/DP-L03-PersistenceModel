
package domain;

import java.util.Collection;
import java.util.Date;

public class Finder extends DomainEntity {

	private Date					moment;

	private Collection<FixUpTask>	fixUpTask;

	private Collection<Filter>		filter;


	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public Collection<FixUpTask> getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final Collection<FixUpTask> fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

	public Collection<Filter> getFilter() {
		return this.filter;
	}

	public void setFilter(final Collection<Filter> filter) {
		this.filter = filter;
	}

}
