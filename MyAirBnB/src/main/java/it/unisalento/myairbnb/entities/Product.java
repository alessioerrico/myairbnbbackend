// Generated with g9.

package it.unisalento.myairbnb.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="product")
public class Product implements Serializable {

    /** Primary key. */
    protected static final String PK = "idproduct";

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
    private int idproduct;
    @Column(length=12)
    private float price;
    @Column(length=255)
    private String description;
    @Column(name="long", nullable=false, length=12)
    private float long_;
    @Column(length=12)
    private float lat;
    @Column(nullable=false, length=45)
    private String approved;
    @Column(length=45)
    private String name;
    @Column(name="url_immagine", nullable=false, length=45)
    private String urlImmagine;
    @Column(name="start_availability", nullable=false)
    private Timestamp startAvailability;
    @Column(name="end_availability", nullable=false)
    private Timestamp endAvailability;
    @OneToMany(mappedBy="product")
    private Set<Apartment> apartment;
    @OneToMany(mappedBy="product")
    private Set<Car> car;
    @OneToMany(mappedBy="product")
    private Set<Excursion> excursion;
    @ManyToOne(optional=false)
    @JoinColumn(name="idcategory", nullable=false)
    private Category category;
    @ManyToOne(optional=false)
    @JoinColumn(name="idseller", nullable=false)
    private User user;
    @OneToMany(mappedBy="product")
    private Set<Booking> booking;
    @OneToMany(mappedBy="product")
    private Set<Comments> comments;

    /** Default constructor. */
    public Product() {
        super();
    }

    /**
     * Access method for idproduct.
     *
     * @return the current value of idproduct
     */
    public int getIdproduct() {
        return idproduct;
    }

    /**
     * Setter method for idproduct.
     *
     * @param aIdproduct the new value for idproduct
     */
    public void setIdproduct(int aIdproduct) {
        idproduct = aIdproduct;
    }

    /**
     * Access method for price.
     *
     * @return the current value of price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Setter method for price.
     *
     * @param aPrice the new value for price
     */
    public void setPrice(float aPrice) {
        price = aPrice;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for long_.
     *
     * @return the current value of long_
     */
    public float getLong_() {
        return long_;
    }

    /**
     * Setter method for long_.
     *
     * @param aLong_ the new value for long_
     */
    public void setLong_(float aLong_) {
        long_ = aLong_;
    }

    /**
     * Access method for lat.
     *
     * @return the current value of lat
     */
    public float getLat() {
        return lat;
    }

    /**
     * Setter method for lat.
     *
     * @param aLat the new value for lat
     */
    public void setLat(float aLat) {
        lat = aLat;
    }

    /**
     * Access method for approved.
     *
     * @return the current value of approved
     */
    public String getApproved() {
        return approved;
    }

    /**
     * Setter method for approved.
     *
     * @param aApproved the new value for approved
     */
    public void setApproved(String aApproved) {
        approved = aApproved;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for urlImmagine.
     *
     * @return the current value of urlImmagine
     */
    public String getUrlImmagine() {
        return urlImmagine;
    }

    /**
     * Setter method for urlImmagine.
     *
     * @param aUrlImmagine the new value for urlImmagine
     */
    public void setUrlImmagine(String aUrlImmagine) {
        urlImmagine = aUrlImmagine;
    }

    /**
     * Access method for startAvailability.
     *
     * @return the current value of startAvailability
     */
    public Timestamp getStartAvailability() {
        return startAvailability;
    }

    /**
     * Setter method for startAvailability.
     *
     * @param aStartAvailability the new value for startAvailability
     */
    public void setStartAvailability(Timestamp aStartAvailability) {
        startAvailability = aStartAvailability;
    }

    /**
     * Access method for endAvailability.
     *
     * @return the current value of endAvailability
     */
    public Timestamp getEndAvailability() {
        return endAvailability;
    }

    /**
     * Setter method for endAvailability.
     *
     * @param aEndAvailability the new value for endAvailability
     */
    public void setEndAvailability(Timestamp aEndAvailability) {
        endAvailability = aEndAvailability;
    }

    /**
     * Access method for apartment.
     *
     * @return the current value of apartment
     */
    public Set<Apartment> getApartment() {
        return apartment;
    }

    /**
     * Setter method for apartment.
     *
     * @param aApartment the new value for apartment
     */
    public void setApartment(Set<Apartment> aApartment) {
        apartment = aApartment;
    }

    /**
     * Access method for car.
     *
     * @return the current value of car
     */
    public Set<Car> getCar() {
        return car;
    }

    /**
     * Setter method for car.
     *
     * @param aCar the new value for car
     */
    public void setCar(Set<Car> aCar) {
        car = aCar;
    }

    /**
     * Access method for excursion.
     *
     * @return the current value of excursion
     */
    public Set<Excursion> getExcursion() {
        return excursion;
    }

    /**
     * Setter method for excursion.
     *
     * @param aExcursion the new value for excursion
     */
    public void setExcursion(Set<Excursion> aExcursion) {
        excursion = aExcursion;
    }

    /**
     * Access method for category.
     *
     * @return the current value of category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Setter method for category.
     *
     * @param aCategory the new value for category
     */
    public void setCategory(Category aCategory) {
        category = aCategory;
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

    /**
     * Access method for booking.
     *
     * @return the current value of booking
     */
    public Set<Booking> getBooking() {
        return booking;
    }

    /**
     * Setter method for booking.
     *
     * @param aBooking the new value for booking
     */
    public void setBooking(Set<Booking> aBooking) {
        booking = aBooking;
    }

    /**
     * Access method for comments.
     *
     * @return the current value of comments
     */
    public Set<Comments> getComments() {
        return comments;
    }

    /**
     * Setter method for comments.
     *
     * @param aComments the new value for comments
     */
    public void setComments(Set<Comments> aComments) {
        comments = aComments;
    }

    /**
     * Compares the key for this instance with another Product.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Product and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product that = (Product) other;
        if (this.getIdproduct() != that.getIdproduct()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Product.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Product)) return false;
        return this.equalKeys(other) && ((Product)other).equalKeys(this);
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
        i = getIdproduct();
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
        StringBuffer sb = new StringBuffer("[Product |");
        sb.append(" idproduct=").append(getIdproduct());
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
        ret.put("idproduct", Integer.valueOf(getIdproduct()));
        return ret;
    }

}
