package com.citysightseeing.commissiontest.impl;

import java.util.List;

import com.citysightseeing.commissiontest.dto.CustomCommisionDTO;
import com.citysightseeing.commissiontest.dto.SaleDTO;
import com.citysightseeing.commissiontest.service.CommissionService;

/**
 * 
 * @author vegalf
 * 
 */
public class CommissionServiceImpl implements CommissionService {

	@Override
	public double[] calculateCommission(SaleDTO sale, List<CustomCommisionDTO> customCommissions) {
		double[] list = new double[6];
		double totalCommi = 0;

		for (int i = 0; i < customCommissions.size(); i++) {

			double commi = 0;
			if (i == 0) {
				commi = customCommissions.get(i).getCommission();

				totalCommi = commi;
			} else if (i == 1) {
				commi = sale.getTotalAmount() * customCommissions.get(i).getCommission();
				totalCommi = commi;
			} else if (i == 5) {
				commi = sale.getTotalAmount() - totalCommi;
			}
			if (i <= 6) {
				list[i] = commi;
			}
			if (i > 6) {
				break;
			}
		}

		return list;
	}
}
