package org.mumbai.forsociety.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "facilities")
public class Facilities {
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "facilitie_id")
	private Long facilitieId;
	@Column(name = "heading")
	private String heading;
	@Column(name = "description")
	private String description;
	@Column(name = "posted_date")
	private Date postedDate;
	@Column(name = "applicable_date")
	private Date applicableDate;
	@Column(name = "accepted")
	private Boolean accepted;

	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public Long getFacilitieId() {
		return facilitieId;
	}

	public void setFacilitieId(Long facilitieId) {
		this.facilitieId = facilitieId;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	public Date getApplicableDate() {
		return applicableDate;
	}

	public void setApplicableDate(Date applicableDate) {
		this.applicableDate = applicableDate;
	}

}
