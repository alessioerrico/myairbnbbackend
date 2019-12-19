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

@Entity(name="excursion")
public class Excursion implements Serializable {

    /** Primary key. */
    protected static final String PK = "idexcursion";

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
    private int idexcursion;
    @Column(name="end_lat", nullable=false, length=12)
    private float endLat;
    @Column(name="end_lon", nullable=false, length=12)
    private float endLon;
    @ManyToOne(optional=false)
    @JoinColumn(name="idproduct", nullable=false)
    private Product product;

    /** Default constructor. */
    public Excursion() {
        super();
    }

    /**
     * Access method for idexcursion.
     *
     * @return the current value of idexcursion
     */
    public int getIdexcursion() {
        return idexcursion;
    }

    /**
     * Setter method for idexcursion.
     *
     * @param aIdexcursion the new value for idexcursion
     */
    public void setIdexcursion(int aIdexcursion) {
        idexcursion = aIdexcursion;
    }

    /**
     * Access method for endLat.
     *
     * @return the current value of endLat
     */
    public float getEndLat() {
        return endLat;
    }

    /**
     * Setter method for endLat.
     *
     * @param aEndLat the new value for endLat
     */
    public void setEndLat(float aEndLat) {
        endLat = aEndLat;
    }

    /**
     * Access method for endLon.
     *
     * @return the current value of endLon
     */
    public float getEndLon() {
        return endLon;
    }

    /**
     * Setter method for endLon.
     *
     * @param aEndLon the new value for endLon
     */
    public void setEndLon(float aEndLon) {
        endLon = aEndLon;
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
     * Compares the key for this instance with another Excursion.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Excursion and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Excursion)) {
            return false;
        }
        Excursion that = (Excursion) other;
        if (this.getIdexcursion() != that.getIdexcursion()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Excursion.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Excursion)) return false;
        return this.equalKeys(other) && ((Excursion)other).equalKeys(this);
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
        i = getIdexcursion();
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
        StringBuffer sb = new StringBuffer("[Excursion |");
        sb.append(" idexcursion=").append(getIdexcursion());
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
        ret.put("idexcursion", Integer.valueOf(getIdexcursion()));
        return ret;
    }

}
