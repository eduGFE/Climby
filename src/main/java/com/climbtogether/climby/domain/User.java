package com.climbtogether.climby.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

	private static final long serialVersionUID = -985853124316450362L;

	@Id
	@SequenceGenerator(name = "idUserSeqGenerator", sequenceName = "sc_user", allocationSize = 1)
	@GeneratedValue(generator = "idUserSeqGenerator")
	@Column(name = "id_user",unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "full_name", nullable = false)
	private String fullName;
	
	@Column(name = "experience", nullable = false)
	private Integer experience;
	
//	@Column(name = "position")
//	private Integer position;
	
	@Column(name = "phone", nullable = false)
	private String phone;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "score")
	private BigDecimal score;
	
	@Column(name = "outputs")
	private Integer outputs;
	
	@Column(name = "user_photo", nullable = false)
	private String userPhoto;
	
	
//	private List<String> reservation;
//	
//	private  List<String> travel;
	
	
	
	
	
	
}