// Generated with g9.

package it.unisalento.myairbnb.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="user", indexes={@Index(name="user_email_IX", columnList="email", unique=true)})
public class User implements Serializable {

    /** Primary key. */
    protected static final String PK = "iduser";

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
    private int iduser;
    @Column(nullable=false, length=255)
    private String name;
    @Column(nullable=false, length=255)
    private String surname;
    @Column(unique=true, nullable=false, length=255)
    private String email;
    @Column(nullable=false)
    private Date birthdate;
    @Column(nullable=false, length=45)
    private String role;
    @OneToMany(mappedBy="user")
    private Set<Category> category;
    @OneToMany(mappedBy="user")
    private Set<Product> product;
    @OneToMany(mappedBy="user")
    private Set<Booking> booking;
    @OneToMany(mappedBy="user")
    private Set<Comments> comments;

    /** Default constructor. */
    public User() {
        super();
    }

    /**
     * Access method for iduser.
     *
     * @return the current value of iduser
     */
    public int getIduser() {
        return iduser;
    }

    /**
     * Setter method for iduser.
     *
     * @param aIduser the new value for iduser
     */
    public void setIduser(int aIduser) {
        iduser = aIduser;
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
     * Access method for surname.
     *
     * @return the current value of surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Setter method for surname.
     *
     * @param aSurname the new value for surname
     */
    public void setSurname(String aSurname) {
        surname = aSurname;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for birthdate.
     *
     * @return the current value of birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * Setter method for birthdate.
     *
     * @param aBirthdate the new value for birthdate
     */
    public void setBirthdate(Date aBirthdate) {
        birthdate = aBirthdate;
    }

    /**
     * Access method for role.
     *
     * @return the current value of role
     */
    public String getRole() {
        return role;
    }

    /**
     * Setter method for role.
     *
     * @param aRole the new value for role
     */
    public void setRole(String aRole) {
        role = aRole;
    }

    /**
     * Access method for category.
     *
     * @return the current value of category
     */
    public Set<Category> getCategory() {
        return category;
    }

    /**
     * Setter method for category.
     *
     * @param aCategory the new value for category
     */
    public void setCategory(Set<Category> aCategory) {
        category = aCategory;
    }

    /**
     * Access method for product.
     *
     * @return the current value of product
     */
    public Set<Product> getProduct() {
        return product;
    }

    /**
     * Setter method for product.
     *
     * @param aProduct the new value for product
     */
    public void setProduct(Set<Product> aProduct) {
        product = aProduct;
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
     * Compares the key for this instance with another User.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class User and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User that = (User) other;
        if (this.getIduser() != that.getIduser()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another User.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof User)) return false;
        return this.equalKeys(other) && ((User)other).equalKeys(this);
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
        i = getIduser();
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
        StringBuffer sb = new StringBuffer("[User |");
        sb.append(" iduser=").append(getIduser());
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
        ret.put("iduser", Integer.valueOf(getIduser()));
        return ret;
    }

}
