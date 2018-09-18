package co.edu.javeriana.foundation.middleware.controller;

import java.util.UUID;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import co.edu.javeriana.foundation.middleware.context.ContextHolder;


public abstract class IntegrationController {

	private static final String TRANSACTION_ID = "TRANSACTION-ID";

	@Autowired
	private ContextHolder context;
	
	private static Logger LOGGER = LoggerFactory.getLogger(IntegrationController.class);
	
	public void createTransactionState( final Exchange exchange ){
		
		String txId = UUID.randomUUID().toString();
		LOGGER.info("creating transaction-context with id {}", txId);
		exchange.getIn().setHeader(TRANSACTION_ID, txId);
		context.initTransactionContext(txId);
	}
	
	public void releaseContext( final Exchange exchange ) {
		
		String txId = exchange.getIn().getHeader(TRANSACTION_ID,String.class);
		LOGGER.info("releasing transaction-context with id {}", txId);
		context.releaseTransactionContext(txId);
	}
	
	public void putContextAttribute( final Exchange exchange, final String attributeName, final Object attributeValue ) {
		String txId = exchange.getIn().getHeader(TRANSACTION_ID,String.class);
		LOGGER.info("adding attribute to transaction-context with id {}", txId);
		context.putAttribute(txId, attributeName, attributeValue);
	}
	
	public Object getContextAttribute( final Exchange exchange, final String attributeName ) {
		String txId = exchange.getIn().getHeader(TRANSACTION_ID,String.class);
		LOGGER.info("retrieving attribute from transaction-context with id {}", txId);
		return context.getAttribute(txId , attributeName);
	}
	
}
