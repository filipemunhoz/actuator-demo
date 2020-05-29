package com.actuator.actuatordemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DISTRIBUTION_ITEM")
public class DistributionItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "distribution_item_id")
	private Long id;
	
	@Column(nullable = false)
	private int ranking;
	
	@Column(nullable = false)
	private String name;

	@Column(name = "access", nullable = false)
	private int accessPerDay;
	
    @ManyToOne
    @JoinColumn(name = "distribution_list_id", insertable = false, updatable = false)
    private DistributionList distributionList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccessPerDay() {
		return accessPerDay;
	}

	public void setAccessPerDay(int accessPerDay) {
		this.accessPerDay = accessPerDay;
	}

	public DistributionList getDistributionList() {
		return distributionList;
	}

	public void setDistributionList(DistributionList distributionList) {
		this.distributionList = distributionList;
	}
    
    
}