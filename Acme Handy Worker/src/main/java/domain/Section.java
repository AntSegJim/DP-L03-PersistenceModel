
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Section extends DomainEntity {

	private Integer	number;
	private String	title;
	private String	pieceOftext;


	//Getters
	public Integer getNumber() {
		return this.number;
	}
	@NotBlank
	public String getTitle() {
		return this.title;
	}
	@NotBlank
	public String getPieceOfText() {
		return this.pieceOftext;
	}

	//Setters
	public void setNumber(final Integer num) {
		this.number = num;
	}
	public void setTitle(final String tit) {
		this.title = tit;
	}
	public void setPieceOfText(final String piece) {
		this.pieceOftext = piece;
	}
}
