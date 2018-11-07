
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import security.UserAccount;

@Entity
@Access(AccessType.PROPERTY)
public class Actor extends DomainEntity {

	private String								name;
	private String								middleName;
	private String								surname;
	private String								photo;
	private String								email;
	private String								phone;
	private String								adress;
	private Integer								numberSocialProfiles;
	private UserAccount							userAccount;
	private Collection<ProfileSocialNetwork>	profileSocialNetwork;
	private Collection<MessageBox>				messageBox;


	//Getters and Setters

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	@URL
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	//	if email has following patterns, the value is well. 
	//	alias <identifier@domain>  -->  ^[A-z0-9]+\s*[A-z0-9\s]*\s\<[A-z0-9]+\@[A-z0-9]+\.[A-z0-9.]+\>
	//	identificador@  -->  ^[A-z0-9]+\@
	//	alias <identifier@>  -->  ^[A-z0-9]+\s*[A-z0-9\s]*\s\<[A-z0-9]+\@\>
	@Email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Pattern(regexp = "^\\+[1-9][0-9]{0,2}\\ \\([1-9][0-9]{0,2}\\)\\ [0-9]{4,}$|^\\+[1-9][0-9]{0,2}\\ [0-9]{4,}$|^[0-9]{4,}$ ")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	//OPCIONAL
	public String getAdress() {
		return this.adress;
	}

	public void setAdress(final String adress) {
		this.adress = adress;
	}

	//OPCIONAL
	public Integer getNumberSocialProfiles() {
		return this.numberSocialProfiles;
	}

	public void setNumberSocialProfiles(final Integer numberSocialProfiles) {
		this.numberSocialProfiles = numberSocialProfiles;
	}

	@OneToOne(cascade = CascadeType.ALL)
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(final UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@OneToMany
	public Collection<ProfileSocialNetwork> getProfileSocialNetwork() {
		return this.profileSocialNetwork;
	}

	public void setProfileSocialNetwork(final Collection<ProfileSocialNetwork> profileSocialNetwork) {
		this.profileSocialNetwork = profileSocialNetwork;
	}

	@OneToMany
	public Collection<MessageBox> getMessageBox() {
		return this.messageBox;
	}

	public void setMessageBox(final Collection<MessageBox> messageBox) {
		this.messageBox = messageBox;
	}

}
