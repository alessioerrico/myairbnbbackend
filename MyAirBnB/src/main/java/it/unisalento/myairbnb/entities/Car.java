// Generated with g9.

package it.unisalento.myairbnb.entities;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="car")
public class Car implements Serializable {

    /** Primary key. */
    protected static final String PK = "licensePlate";

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
    @Column(name="license_plate", unique=true, nullable=false, length=45)
    private String licensePlate;
    @Column(length=45)
    private String model;
    @Column(precision=10)
    private int seats;
    @Column(length=45)
    private String fuel;
    @Column(length=45)
    private String brand;
    @Column(length=45)
    private String type;
    @Column(length=45)
    private String transmission;
    @ManyToOne(optional=false)
    @JoinColumn(name="idproduct", nullable=false)
    private Product product;

    /** Default constructor. */
    public Car() {
        super();
    }

    /**
     * Access method for licensePlate.
     *
     * @return the current value of licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Setter method for licensePlate.
     *
     * @param aLicensePlate the new value for licensePlate
     */
    public void setLicensePlate(String aLicensePlate) {
        licensePlate = aLicensePlate;
    }

    /**
     * Access method for model.
     *
     * @return the current value of model
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter method for model.
     *
     * @param aModel the new value for model
     */
    public void setModel(String aModel) {
        model = aModel;
    }

    /**
     * Access method for seats.
     *
     * @return the current value of seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Setter method for seats.
     *
     * @param aSeats the new value for seats
     */
    public void setSeats(int aSeats) {
        seats = aSeats;
    }

    /**
     * Access method for fuel.
     *
     * @return the current value of fuel
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * Setter method for fuel.
     *
     * @param aFuel the new value for fuel
     */
    public void setFuel(String aFuel) {
        fuel = aFuel;
    }

    /**
     * Access method for brand.
     *
     * @return the current value of brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Setter method for brand.
     *
     * @param aBrand the new value for brand
     */
    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    /**
     * Access method for type.
     *
     * @return the current value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for type.
     *
     * @param aType the new value for type
     */
    public void setType(String aType) {
        type = aType;
    }

    /**
     * Access method for transmission.
     *
     * @return the current value of transmission
     */
    public String getTransmission() {
        return transmission;
    }

    /**
     * Setter method for transmission.
     *
     * @param aTransmission the new value for transmission
     */
    public void setTransmission(String aTransmission) {
        transmission = aTransmission;
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
     * Compares the key for this instance with another Car.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Car and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Car)) {
            return false;
        }
        Car that = (Car) other;
        Object myLicensePlate = this.getLicensePlate();
        Object yourLicensePlate = that.getLicensePlate();
        if (myLicensePlate==null ? yourLicensePlate!=null : !myLicensePlate.equals(yourLicensePlate)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Car.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Car)) return false;
        return this.equalKeys(other) && ((Car)other).equalKeys(this);
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
        if (getLicensePlate() == null) {
            i = 0;
        } else {
            i = getLicensePlate().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[Car |");
        sb.append(" licensePlate=").append(getLicensePlate());
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
        ret.put("licensePlate", getLicensePlate());
        return ret;
    }

}
