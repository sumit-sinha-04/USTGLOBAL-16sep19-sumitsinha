package com.ustglobal.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="Voter_Card")
public class VoterCard {
	@Id
	@Column
	private int vid;
	private String vName;
	@Exclude
	@OneToOne(mappedBy="votercard")
	private Person person;

}
