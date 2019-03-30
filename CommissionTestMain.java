package com.citysightseeing.commissiontest.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.citysightseeing.commissiontest.dto.CustomCommisionDTO;
import com.citysightseeing.commissiontest.dto.SaleDTO;
import com.citysightseeing.commissiontest.dto.ScopeDTO;
import com.citysightseeing.commissiontest.dto.enums.ScopeTypeEnum;
import com.citysightseeing.commissiontest.impl.CommissionServiceImpl;

public class CommissionTestMain {

	public static void main(String[] args) {
		
		CommissionServiceImpl commission = new CommissionServiceImpl();
		SaleDTO sale = new SaleDTO();
		String salir= "";
		List<CustomCommisionDTO> customCommissions = new ArrayList<>();
		boolean endWhile= false;
		ScopeDTO scopeDTO = new ScopeDTO();
		ScopeDTO scopeToDistribute = new ScopeDTO();
		ScopeDTO accountOwner = new ScopeDTO();
		Scanner write = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Cantidad total :");
		sale.setId(Long.valueOf(1));
		sale.setTotalAmount(Long.valueOf(write.nextLine()));
		sale.setSupplierId(Long.valueOf(1));
		sale.setOptionId(Long.valueOf(2));
		
		scopeDTO.setChannelId(null);
		scopeDTO.setId(Long.valueOf(1));
		scopeDTO.setCompanyId(null);
		scopeDTO.setType(ScopeTypeEnum.CHANNEL);
		scopeDTO.setName(null);
		sale.setPointOfSale(scopeDTO);
		scopeToDistribute.setId(Long.valueOf(1));
		scopeToDistribute.setChannelId(null);
		scopeToDistribute.setCompanyId(null);
		scopeToDistribute.setName(null);
		scopeToDistribute.setType(ScopeTypeEnum.CHANNEL);
		sale.setScopeToDistribute(scopeToDistribute);
		
		accountOwner.setId(Long.valueOf(1));
		accountOwner.setChannelId(null);
		accountOwner.setCompanyId(null);
		accountOwner.setName(null);
		accountOwner.setType(ScopeTypeEnum.CHANNEL);
		sale.setAccountOwner(accountOwner);

		while(!endWhile) {
			
			int id = +1;
			CustomCommisionDTO custom56 = new CustomCommisionDTO();

		
			custom56.setId(Long.valueOf(id));
		
			System.out.println("Comision:");
			custom56.setCommission(Long.valueOf(write.nextInt()));
			custom56.setFixed(true);
			custom56.setOrderCommission(0);
			custom56.setSupplierId(Long.valueOf(1));
			custom56.setProductId(null);
			custom56.setOptionId(null);
			custom56.setPointOfSale(null);
			custom56.setScopeToDistribute(null);
			custom56.setAccountOwner(null);
			customCommissions.add(custom56);
			
			System.out.println("¿salir?:");
			salir =write.next();
			
			if(salir.equals("Si") || salir.equals("S") || salir.equals("s") || salir.equals("si")) {
				endWhile = true;
			}
		}
		
		write.close();
	    
	
		
		double[] listcalculated =commission.calculateCommission(sale, customCommissions); 
		for(int i = 0 ; i <listcalculated.length; i++) {
			System.out.println(listcalculated[i]);
		}
		
		
	}

}
