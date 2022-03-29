package com.turkcell.rentACar.business.requests.update;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateInvoiceRequest {

	@NotNull
	private int invoiceId;
	
	@NotNull
	private long invoiceNumber;
	
	@NotNull
	private int rentalId;
	
	@NotNull
	private int paymentId;
}
