
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(AccessType.PROPERTY)
public class Finder extends DomainEntity {

	private Date					moment;

	private Collection<FixUpTask>	fixUpTask;

	private Filter					filter;


	@Temporal(TemporalType.TIMESTAMP)
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@ManyToMany
	public Collection<FixUpTask> getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final Collection<FixUpTask> fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

	@ManyToOne
	public Filter getFilter() {
		return this.filter;
	}

	public void setFilter(final Filter filter) {
		this.filter = filter;
	}

}
