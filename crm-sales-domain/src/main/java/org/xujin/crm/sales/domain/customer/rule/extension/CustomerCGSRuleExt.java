package org.xujin.crm.sales.domain.customer.rule.extension;

import org.xujin.crm.sales.common.BizCode;
import org.xujin.crm.sales.domain.customer.rule.extensionpoint.CustomerRuleExtPt;
import org.xujin.halo.extension.Extension;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;
import org.xujin.crm.sales.domain.customer.entity.CustomerE;

@Extension(bizCode= BizCode.CGS)
public class CustomerCGSRuleExt implements CustomerRuleExtPt {
	Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public boolean addCustomerCheck(CustomerE customerE) {
		//Any Customer can be added
		return true;
	}
}
