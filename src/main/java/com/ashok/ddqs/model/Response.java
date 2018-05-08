package com.ashok.ddqs.model;

import java.io.Serializable;

/**
 * Model class of RESPONSE.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Response implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** RESPONSE_ID. */
	private Integer responseId;

	/** RESPONSE_VALUE. */
	private String responseValue;

	/** VENDOR. */
	private Vendor vendor;

	/** QUESTIONAIR. */
	private Questionair questionair;

	/**
	 * Constructor.
	 */
	public Response() {
	}

	/**
	 * Set the RESPONSE_ID.
	 * 
	 * @param responseId
	 *            RESPONSE_ID
	 */
	public void setResponseId(Integer responseId) {
		this.responseId = responseId;
	}

	/**
	 * Get the RESPONSE_ID.
	 * 
	 * @return RESPONSE_ID
	 */
	public Integer getResponseId() {
		return this.responseId;
	}

	/**
	 * Set the RESPONSE_VALUE.
	 * 
	 * @param responseValue
	 *            RESPONSE_VALUE
	 */
	public void setResponseValue(String responseValue) {
		this.responseValue = responseValue;
	}

	/**
	 * Get the RESPONSE_VALUE.
	 * 
	 * @return RESPONSE_VALUE
	 */
	public String getResponseValue() {
		return this.responseValue;
	}

	/**
	 * Set the VENDOR.
	 * 
	 * @param vendor
	 *            VENDOR
	 */
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	/**
	 * Get the VENDOR.
	 * 
	 * @return VENDOR
	 */
	public Vendor getVendor() {
		return this.vendor;
	}

	/**
	 * Set the QUESTIONAIR.
	 * 
	 * @param questionair
	 *            QUESTIONAIR
	 */
	public void setQuestionair(Questionair questionair) {
		this.questionair = questionair;
	}

	/**
	 * Get the QUESTIONAIR.
	 * 
	 * @return QUESTIONAIR
	 */
	public Questionair getQuestionair() {
		return this.questionair;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((responseId == null) ? 0 : responseId.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Response other = (Response) obj;
		if (responseId == null) {
			if (other.responseId != null) {
				return false;
			}
		} else if (!responseId.equals(other.responseId)) {
			return false;
		}
		return true;
	}

}
