package com.practice.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public class Payment {
		BigDecimal amount;
		Date dateOfPayment;
		Map<String, String> metaInfo;
		Boolean isSuccessful;
}
