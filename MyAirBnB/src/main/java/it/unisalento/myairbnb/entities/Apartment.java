// Generated with g9.

package it.unisalento.myairbnb.entities;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="apartment")
public class Apartment implements Serializable {

    /** Primary key. */
    protected static final String PK = "idapartment";

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

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int idapartment;
    @Column(precision=10)
    private int rooms;
    @Column(precision=10)
    private int beds;
    @Column(precision=10)
    private int bathrooms;
    @ManyToOne(optional=false)
    @JoinColumn(name="idproduct", nullable=false)
    private Product product;

    /** Default constructor. */
    public Apartment() {
        super();
    }

    /**
     * Access method for idapartment.
     *
     * @return the current value of idapartment
     */
    public int getIdapartment() {
        return idapartment;
    }

    /**
     * Setter method for idapartment.
     *
     * @param aIdapartment the new value for idapartment
     */
    public void setIdapartment(int aIdapartment) {
        idapartment = aIdapartment;
    }

    /**
     * Access method for rooms.
     *
     * @return the current value of rooms
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * Setter method for rooms.
     *
     * @param aRooms the new value for rooms
     */
    public void setRooms(int aRooms) {
        rooms = aRooms;
    }

    /**
     * Access method for beds.
     *
     * @return the current value of beds
     */
    public int getBeds() {
        return beds;
    }

    /**
     * Setter method for beds.
     *
     * @param aBeds the new value for beds
     */
    public void setBeds(int aBeds) {
        beds = aBeds;
    }

    /**
     * Access method for bathrooms.
     *
     * @return the current value of bathrooms
     */
    public int getBathrooms() {
        return bathrooms;
    }

    /**
     * Setter method for bathrooms.
     *
     * @param aBathrooms the new value for bathrooms
     */
    public void setBathrooms(int aBathrooms) {
        bathrooms = aBathrooms;
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
     * Compares the key for this instance with another Apartment.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Apartment and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Apartment)) {
            return false;
        }
        Apartment that = (Apartment) other;
        if (this.getIdapartment() != that.getIdapartment()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Apartment.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Apartment)) return false;
        return this.equalKeys(other) && ((Apartment)other).equalKeys(this);
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
        i = getIdapartment();
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
        StringBuffer sb = new StringBuffer("[Apartment |");
        sb.append(" idapartment=").append(getIdapartment());
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
        ret.put("idapartment", Integer.valueOf(getIdapartment()));
        return ret;
    }

}
