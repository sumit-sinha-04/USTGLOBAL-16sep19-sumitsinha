package com.ustglobal.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ustglobal.onetoone.Person;
import com.ustglobal.onetoone.VoterCard;

import lombok.Data;

@Data
@Entity
@Table(name="Pencil")
public class Pencil {
@Id
@Column
	private int pid;
@Column
	private String color;
@ManyToOne(cascade = CascadeType.ALL)	 
@JoinColumn(name="bid",nullable=false)
private PencilBox pencilBox;
	
}
