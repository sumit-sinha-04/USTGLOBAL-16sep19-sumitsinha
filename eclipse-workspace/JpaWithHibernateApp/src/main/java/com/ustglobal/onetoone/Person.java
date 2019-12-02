package com.ustglobal.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="Person")
public class Person {
	@Id
	@Column
private int id;
	@Column
private String  name;


@OneToOne(cascade = CascadeType.ALL)	 
	@JoinColumn(name="vid")
	private VoterCard	votercard;	
	
}
