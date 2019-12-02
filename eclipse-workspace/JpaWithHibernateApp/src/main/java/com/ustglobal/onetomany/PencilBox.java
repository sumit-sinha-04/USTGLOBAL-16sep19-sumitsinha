package com.ustglobal.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ustglobal.onetoone.Person;
import com.ustglobal.onetoone.VoterCard;

import lombok.Data;

@Data
@Entity
@Table(name="PencilBox")
public class PencilBox {
@Id
	@Column
	private int bid;
@Column	
private String bname;

}
