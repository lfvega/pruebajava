package com.citysightseeing.commissiontest.service;

import java.util.List;

import com.citysightseeing.commissiontest.dto.CustomCommisionDTO;
import com.citysightseeing.commissiontest.dto.SaleDTO;

public interface CommissionService {

	/**
	 * Return the commissions amount of a sale.
	 * 
	 * @param sale
	 *            The sale to calculate the commissions
	 * @param customCommissions
	 *            List of cutomCommissions to calculate the commissions
	 * @return A array where the position is the order commission.
	 */
	public double[] calculateCommission(SaleDTO sale, List<CustomCommisionDTO> customCommissions);

}
