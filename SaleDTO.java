package com.citysightseeing.commissiontest.dto;

/**
 * class
 * 
 * @author vegalf
 * 
 */
public class SaleDTO {

	private Long id;
	/**
	 * Money amount of the sale.
	 */
	private double totalAmount;

	/**
	 * Supplier of the product.
	 */
	private Long supplierId;
	/**
	 * Product of the option.
	 */
	private Long productId;
	/**
	 * Option that was sold.
	 */
	private Long optionId;
	/**
	 * Point of the sale. It field can be null.
	 */
	private ScopeDTO pointOfSale;
	/**
	 * Scope that distribute the sale.
	 */
	private ScopeDTO scopeToDistribute;
	/**
	 * Account owner of the sale.
	 */
	private ScopeDTO accountOwner;

	/**
	 * Constructor
	 */
	public SaleDTO() {

	}

	/**
	 * getter id
	 * 
	 * @return Long id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * setter id
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * getter totalAmount
	 * 
	 * @return double totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * setter totalAmount
	 * 
	 * @param totalAmount
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * getter supplierId
	 * 
	 * @return Long supplierId
	 */
	public Long getSupplierId() {
		return supplierId;
	}

	/**
	 * setter supplierId
	 * 
	 * @param supplierId
	 */
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	/**
	 * getter productId
	 * 
	 * @return Long productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * setter productId
	 * 
	 * @param productId
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * getter optionId
	 * 
	 * @return Long optionId
	 */
	public Long getOptionId() {
		return optionId;
	}

	/**
	 * setter optionId
	 * 
	 * @param optionId
	 */
	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	/**
	 * getter pointOfSale
	 * 
	 * @return ScopeDTO pointOfSale
	 */
	public ScopeDTO getPointOfSale() {
		return pointOfSale;
	}

	/**
	 * setter pointOfSale
	 * 
	 * @param pointOfSale
	 */
	public void setPointOfSale(ScopeDTO pointOfSale) {
		this.pointOfSale = pointOfSale;
	}

	/**
	 * getter scopeToDistribute
	 * 
	 * @return ScopeDTO scopeToDistribute
	 */
	public ScopeDTO getScopeToDistribute() {
		return scopeToDistribute;
	}

	/**
	 * setter scopeToDistribute
	 * 
	 * @param scopeToDistribute
	 */
	public void setScopeToDistribute(ScopeDTO scopeToDistribute) {
		this.scopeToDistribute = scopeToDistribute;
	}

	/**
	 * getter accountOwner
	 * 
	 * @return ScopeDTO accountOwner
	 */
	public ScopeDTO getAccountOwner() {
		return accountOwner;
	}

	/**
	 * setter accountOwner
	 * 
	 * @param accountOwner
	 */
	public void setAccountOwner(ScopeDTO accountOwner) {
		this.accountOwner = accountOwner;
	}

	/**
	 * method toString
	 */
	public String toString() {
		return "SaleDTO [id=" + id + ", totalAmount=" + totalAmount
				+ ", supplierId=" + supplierId + ", productId=" + productId
				+ ", optionId=" + optionId + ", pointOfSale=" + pointOfSale
				+ ", scopeToDistribute=" + scopeToDistribute
				+ ", accountOwner=" + accountOwner + "]";
	}

	/**
	 * method hashCode
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * method equals
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaleDTO other = (SaleDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
