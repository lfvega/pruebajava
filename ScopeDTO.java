package com.citysightseeing.commissiontest.dto;

import com.citysightseeing.commissiontest.dto.enums.ScopeTypeEnum;

public class ScopeDTO {

	private Long id;
	private Long channelId;
	private Long companyId;
	private String name;
	private ScopeTypeEnum type;

	/**
	 * Constructor
	 */
	public ScopeDTO() {
	}

	/**
	 * Getter id
	 * 
	 * @return Long id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter Id
	 * 
	 * @param Long
	 *            id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Getter channelId
	 * 
	 * @return Long channelId
	 */
	public Long getChannelId() {
		return channelId;
	}

	/**
	 * Setter channelId
	 * 
	 * @param Long
	 *            channelId
	 */
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	/**
	 * Getter companyId
	 * 
	 * @return Long companyId
	 */
	public Long getCompanyId() {
		return companyId;
	}

	/**
	 * Setter companyId
	 * 
	 * @param Long
	 *            companyId
	 */
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	/**
	 * Getter name
	 * 
	 * @return String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter name
	 * 
	 * @param String
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter type
	 * 
	 * @return ScopeTypeEnum type
	 */
	public ScopeTypeEnum getType() {
		return type;
	}

	/**
	 * Setter type
	 * 
	 * @param ScopeTypeEnuntype
	 */
	public void setType(ScopeTypeEnum type) {
		this.type = type;
	}

	public String toString() {
		return "ScopeDTO [id=" + id + ", channelId=" + channelId
				+ ", companyId=" + companyId + ", name=" + name + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScopeDTO other = (ScopeDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/**
	 * Method isParent
	 * 
	 * @param ScopeDTO
	 *            scope
	 * @return boolean
	 */
	public boolean isParent(ScopeDTO scope) {
		Long scopeId = scope.getId();
		return scopeId != null
				&& (scopeId.equals(id) || scopeId.equals(channelId) || scopeId
						.equals(companyId));
	}
}
