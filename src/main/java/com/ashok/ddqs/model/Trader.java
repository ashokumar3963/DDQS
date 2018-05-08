package com.ashok.ddqs.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of TRADER.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Trader implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** TRADER_ID. */
	private Integer traderId;

	/** TRADER_NAME. */
	private String traderName;

	/** TRADER_TYPE. */
	private String traderType;

	/** The set of BUYER. */
	private Set<Buyer> buyerSet;

	/** The set of USER. */
	private Set<User> userSet;

	/** The set of VENDOR. */
	private Set<Vendor> vendorSet;

	/**
	 * Constructor.
	 */
	public Trader() {
		this.buyerSet = new HashSet<Buyer>();
		this.userSet = new HashSet<User>();
		this.vendorSet = new HashSet<Vendor>();
	}

	/**
	 * Set the TRADER_ID.
	 * 
	 * @param traderId
	 *            TRADER_ID
	 */
	public void setTraderId(Integer traderId) {
		this.traderId = traderId;
	}

	/**
	 * Get the TRADER_ID.
	 * 
	 * @return TRADER_ID
	 */
	public Integer getTraderId() {
		return this.traderId;
	}

	/**
	 * Set the TRADER_NAME.
	 * 
	 * @param traderName
	 *            TRADER_NAME
	 */
	public void setTraderName(String traderName) {
		this.traderName = traderName;
	}

	/**
	 * Get the TRADER_NAME.
	 * 
	 * @return TRADER_NAME
	 */
	public String  getTraderName() {
		return this.traderName;
	}

	/**
	 * Set the TRADER_TYPE.
	 * 
	 * @param traderType
	 *            TRADER_TYPE
	 */
	public void setTraderType(String traderType) {
		this.traderType = traderType;
	}

	/**
	 * Get the TRADER_TYPE.
	 * 
	 * @return TRADER_TYPE
	 */
	public String getTraderType() {
		return this.traderType;
	}

	/**
	 * Set the set of the BUYER.
	 * 
	 * @param buyerSet
	 *            The set of BUYER
	 */
	public void setBuyerSet(Set<Buyer> buyerSet) {
		this.buyerSet = buyerSet;
	}

	/**
	 * Add the BUYER.
	 * 
	 * @param buyer
	 *            BUYER
	 */
	public void addBuyer(Buyer buyer) {
		this.buyerSet.add(buyer);
	}

	/**
	 * Get the set of the BUYER.
	 * 
	 * @return The set of BUYER
	 */
	public Set<Buyer> getBuyerSet() {
		return this.buyerSet;
	}

	/**
	 * Set the set of the USER.
	 * 
	 * @param userSet
	 *            The set of USER
	 */
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}

	/**
	 * Add the USER.
	 * 
	 * @param user
	 *            USER
	 */
	public void addUser(User user) {
		this.userSet.add(user);
	}

	/**
	 * Get the set of the USER.
	 * 
	 * @return The set of USER
	 */
	public Set<User> getUserSet() {
		return this.userSet;
	}

	/**
	 * Set the set of the VENDOR.
	 * 
	 * @param vendorSet
	 *            The set of VENDOR
	 */
	public void setVendorSet(Set<Vendor> vendorSet) {
		this.vendorSet = vendorSet;
	}

	/**
	 * Add the VENDOR.
	 * 
	 * @param vendor
	 *            VENDOR
	 */
	public void addVendor(Vendor vendor) {
		this.vendorSet.add(vendor);
	}

	/**
	 * Get the set of the VENDOR.
	 * 
	 * @return The set of VENDOR
	 */
	public Set<Vendor> getVendorSet() {
		return this.vendorSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((traderId == null) ? 0 : traderId.hashCode());
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
		Trader other = (Trader) obj;
		if (traderId == null) {
			if (other.traderId != null) {
				return false;
			}
		} else if (!traderId.equals(other.traderId)) {
			return false;
		}
		return true;
	}

}
