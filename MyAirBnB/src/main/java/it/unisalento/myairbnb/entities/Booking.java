// Generated with g9.

package it.unisalento.myairbnb.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="booking")
public class Booking implements Serializable {

    /** Primary key. */
    protected static final String PK = "BookingPrimary";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Column(nullable=false, precision=10)
    private int quantity;
    @Column(name="start_date", nullable=false)
    private Timestamp startDate;
    @Column(name="end_date", nullable=false)
    private Timestamp endDate;
    @Column(nullable=false, length=45)
    private String paid;
    @ManyToOne(optional=false)
    @JoinColumn(name="idproduct", nullable=false)
    private Product product;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="iduser", nullable=false)
    private User user;

    /** Default constructor. */
    public Booking() {
        super();
    }

    /**
     * Access method for quantity.
     *
     * @return the current value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter method for quantity.
     *
     * @param aQuantity the new value for quantity
     */
    public void setQuantity(int aQuantity) {
        quantity = aQuantity;
    }

    /**
     * Access method for startDate.
     *
     * @return the current value of startDate
     */
    public Timestamp getStartDate() {
        return startDate;
    }

    /**
     * Setter method for startDate.
     *
     * @param aStartDate the new value for startDate
     */
    public void setStartDate(Timestamp aStartDate) {
        startDate = aStartDate;
    }

    /**
     * Access method for endDate.
     *
     * @return the current value of endDate
     */
    public Timestamp getEndDate() {
        return endDate;
    }

    /**
     * Setter method for endDate.
     *
     * @param aEndDate the new value for endDate
     */
    public void setEndDate(Timestamp aEndDate) {
        endDate = aEndDate;
    }

    /**
     * Access method for paid.
     *
     * @return the current value of paid
     */
    public String getPaid() {
        return paid;
    }

    /**
     * Setter method for paid.
     *
     * @param aPaid the new value for paid
     */
    public void setPaid(String aPaid) {
        paid = aPaid;
    }

    /**
     * Access method for product.
     *
     * @return the current value of product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Setter method for product.
     *
     * @param aProduct the new value for product
     */
    public void setProduct(Product aProduct) {
        product = aProduct;
    }

    /**
     * Access method for user.
     *
     * @return the current value of user
     */
    public User getUser() {
        return user;
    }

    /**
     * Setter method for user.
     *
     * @param aUser the new value for user
     */
    public void setUser(User aUser) {
        user = aUser;
    }

    /** Temporary value holder for group key fragment userIduser */
    private transient int tempUserIduser;

    /**
     * Gets the key fragment iduser for member user.
     * If this.user is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setUserIduser.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see User
     */
    public int getUserIduser() {
        return (getUser() == null ? tempUserIduser : getUser().getIduser());
    }

    /**
     * Sets the key fragment iduser from member user.
     * If this.user is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getUserIduser.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIduser New value for the key fragment
     * @see User
     */
    public void setUserIduser(int aIduser) {
        if (getUser() == null) {
            tempUserIduser = aIduser;
        } else {
            getUser().setIduser(aIduser);
        }
    }

    /** Temporary value holder for group key fragment productIdproduct */
    private transient int tempProductIdproduct;

    /**
     * Gets the key fragment idproduct for member product.
     * If this.product is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setProductIdproduct.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Product
     */
    public int getProductIdproduct() {
        return (getProduct() == null ? tempProductIdproduct : getProduct().getIdproduct());
    }

    /**
     * Sets the key fragment idproduct from member product.
     * If this.product is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getProductIdproduct.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdproduct New value for the key fragment
     * @see Product
     */
    public void setProductIdproduct(int aIdproduct) {
        if (getProduct() == null) {
            tempProductIdproduct = aIdproduct;
        } else {
            getProduct().setIdproduct(aIdproduct);
        }
    }

    /**
     * Compares the key for this instance with another Booking.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Booking and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Booking)) {
            return false;
        }
        Booking that = (Booking) other;
        if (this.getUserIduser() != that.getUserIduser()) {
            return false;
        }
        if (this.getProductIdproduct() != that.getProductIdproduct()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Booking.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Booking)) return false;
        return this.equalKeys(other) && ((Booking)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getUserIduser();
        result = 37*result + i;
        i = getProductIdproduct();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Booking |");
        sb.append(" userIduser=").append(getUserIduser());
        sb.append(" productIdproduct=").append(getProductIdproduct());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("userIduser", Integer.valueOf(getUserIduser()));
        ret.put("productIdproduct", Integer.valueOf(getProductIdproduct()));
        return ret;
    }

}
