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

@Entity(name="comments")
public class Comments implements Serializable {

    /** Primary key. */
    protected static final String PK = "idcomment";

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
    private int idcomment;
    @Column(name="id_dest_comment", precision=10)
    private int idDestComment;
    @Column(nullable=false, length=45)
    private String text;
    @Column(nullable=false, precision=10)
    private int vote;
    @ManyToOne
    @JoinColumn(name="idproduct")
    private Product product;
    @ManyToOne(optional=false)
    @JoinColumn(name="iduser", nullable=false)
    private User user;

    /** Default constructor. */
    public Comments() {
        super();
    }

    /**
     * Access method for idcomment.
     *
     * @return the current value of idcomment
     */
    public int getIdcomment() {
        return idcomment;
    }

    /**
     * Setter method for idcomment.
     *
     * @param aIdcomment the new value for idcomment
     */
    public void setIdcomment(int aIdcomment) {
        idcomment = aIdcomment;
    }

    /**
     * Access method for idDestComment.
     *
     * @return the current value of idDestComment
     */
    public int getIdDestComment() {
        return idDestComment;
    }

    /**
     * Setter method for idDestComment.
     *
     * @param aIdDestComment the new value for idDestComment
     */
    public void setIdDestComment(int aIdDestComment) {
        idDestComment = aIdDestComment;
    }

    /**
     * Access method for text.
     *
     * @return the current value of text
     */
    public String getText() {
        return text;
    }

    /**
     * Setter method for text.
     *
     * @param aText the new value for text
     */
    public void setText(String aText) {
        text = aText;
    }

    /**
     * Access method for vote.
     *
     * @return the current value of vote
     */
    public int getVote() {
        return vote;
    }

    /**
     * Setter method for vote.
     *
     * @param aVote the new value for vote
     */
    public void setVote(int aVote) {
        vote = aVote;
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

    /**
     * Compares the key for this instance with another Comments.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Comments and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Comments)) {
            return false;
        }
        Comments that = (Comments) other;
        if (this.getIdcomment() != that.getIdcomment()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Comments.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Comments)) return false;
        return this.equalKeys(other) && ((Comments)other).equalKeys(this);
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
        i = getIdcomment();
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
        StringBuffer sb = new StringBuffer("[Comments |");
        sb.append(" idcomment=").append(getIdcomment());
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
        ret.put("idcomment", Integer.valueOf(getIdcomment()));
        return ret;
    }

}
