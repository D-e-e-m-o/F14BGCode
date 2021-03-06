package com.f14.f14bgdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.f14.framework.common.model.BaseModel;

/**
 * CodeDetail generated by MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CODE_DETAIL", uniqueConstraints = {})
public class CodeDetail extends BaseModel implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String codeType;
	private String label;
	private String value;
	private String descr;
	private Integer codeIndex;
	private Boolean activeInd;

	@Id
	@TableGenerator(name = "PK_GEN", allocationSize = 100, table = "PK_GEN", valueColumnName = "VALUE", pkColumnName = "NAME", pkColumnValue = "SEQ_ID")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PK_GEN")
	@Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "CODE_TYPE")
	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	@Column(name = "LABEL")
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Column(name = "VALUE")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "DESCR")
	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	@Column(name = "CODE_INDEX")
	public Integer getCodeIndex() {
		return codeIndex;
	}

	public void setCodeIndex(Integer codeIndex) {
		this.codeIndex = codeIndex;
	}

	@Column(name = "ACTIVE_IND")
	public Boolean getActiveInd() {
		return activeInd;
	}

	public void setActiveInd(Boolean activeInd) {
		this.activeInd = activeInd;
	}

}