package com.citysightseeing.commissiontest.dto;

/**
 * Class
 * 
 * @author vegalf
 * 
 */
public class CustomCommisionDTO {

	private Long id;
	/**
	 * Commision to apply
	 */
	private double commission;
	/**
	 * If the commission is fixed, the commission is amount else the commission
	 * is percentage.
	 */
	private boolean fixed;
	/**
	 * The sale could be from 0 to 5 order commission.
	 */
	private int orderCommission;

	// The rest of the fields are to define the commission
	private Long supplierId;
	private Long productId;
	private Long optionId;
	private ScopeDTO pointOfSale;
	private ScopeDTO scopeToDistribute;
	private ScopeDTO accountOwner;

	/**
	 * Constructor
	 */
	public CustomCommisionDTO() {

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
	 * Setter id
	 * 
	 * @param Long
	 *            id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Getter commission
	 * 
	 * @return double commission
	 */
	public double getCommission() {
		return commission;
	}

	/**
	 * Setter commission
	 * 
	 * @param double commission
	 */
	public void setCommission(double commission) {
		this.commission = commission;
	}

	/**
	 * Is fixed
	 * 
	 * @return boolean fixed
	 */
	public boolean isFixed() {
		return fixed;
	}

	/**
	 * Setter fixed
	 * 
	 * @param boolean fixed
	 */
	public void setFixed(boolean fixed) {
		this.fixed = fixed;
	}

	/**
	 * Getter orderCommission
	 * 
	 * @return int orderCommission
	 */
	public int getOrderCommission() {
		return orderCommission;
	}

	/**
	 * Setter orderCommission
	 * 
	 * @param int orderCommission
	 */
	public void setOrderCommission(int orderCommission) {
		this.orderCommission = orderCommission;
	}

	/**
	 * Getter supplierId
	 * 
	 * @return Long supplierId
	 */
	public Long getSupplierId() {
		return supplierId;
	}

	/**
	 * Setter supplierId
	 * 
	 * @param Long
	 *            supplierId
	 */
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	/**
	 * Getter productId
	 * 
	 * @return Long productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * Setter productId
	 * 
	 * @param Long
	 *            productId
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * Getter optionId
	 * 
	 * @return Long optionId
	 */
	public Long getOptionId() {
		return optionId;
	}

	/**
	 * Setter optionId
	 * 
	 * @param Long
	 *            optionId
	 */
	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	/**
	 * Getter pointOfSale
	 * 
	 * @return ScopeDTO pointOfSale
	 */
	public ScopeDTO getPointOfSale() {
		return pointOfSale;
	}

	/**
	 * Setter pointOfSale
	 * 
	 * @param ScopeDTO
	 *            pointOfSale
	 */
	public void setPointOfSale(ScopeDTO pointOfSale) {
		this.pointOfSale = pointOfSale;
	}

	/**
	 * Getter scopeToDistribute
	 * 
	 * @return ScopeDTO scopeToDistribute
	 */
	public ScopeDTO getScopeToDistribute() {
		return scopeToDistribute;
	}

	/**
	 * Setter scopeToDistribute
	 * 
	 * @param ScopeDTO
	 *            scopeToDistribute
	 */
	public void setScopeToDistribute(ScopeDTO scopeToDistribute) {
		this.scopeToDistribute = scopeToDistribute;
	}

	/**
	 * Getter accountOwner
	 * 
	 * @return ScopeDTO accountOwner
	 */
	public ScopeDTO getAccountOwner() {
		return accountOwner;
	}

	/**
	 * Setter accountOwner
	 * 
	 * @param ScopeDTO
	 *            accountOwner
	 */
	public void setAccountOwner(ScopeDTO accountOwner) {
		this.accountOwner = accountOwner;
	}

	/**
	 * Method toString
	 */
	public String toString() {
		return "CustomCommisionDTO [id=" + id + ", commission=" + commission
				+ ", fixed=" + fixed + ", orderCommission=" + orderCommission
				+ ", supplierId=" + supplierId + ", productId=" + productId
				+ ", optionId=" + optionId + ", pointOfSale=" + pointOfSale
				+ ", scopeToDistribute=" + scopeToDistribute
				+ ", accountOwner=" + accountOwner + "]";
	}

	/**
	 * Method hashcode
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * Method equals
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomCommisionDTO other = (CustomCommisionDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
