package it.unisalento.myairbnb.dto;

import java.sql.Timestamp;
import java.util.Date;

public class ExcursionDTO {
	
		int idexcursion;
		float end_lat;
		float end_lon;
		//Parent attributes
				int idproduct;
				public int getIdproduct() {
					return idproduct;
				}
				public void setIdproduct(int idproduct) {
					this.idproduct = idproduct;
				}
				float price;
				
				String description;
				float longitude;
				float lat;
				String approved;
				String urlImmagine;
				Timestamp startAvailability;
				Timestamp endAvailability;
				int idseller;
				String nameseller;
				String surnameseller;
				Date birthdateseller;
				String emailseller;
	public int getIdexcursion() {
			return idexcursion;
		}
		public void setIdexcursion(int idexcursion) {
			this.idexcursion = idexcursion;
		}
		public float getEnd_lat() {
			return end_lat;
		}
		public void setEnd_lat(float end_lat) {
			this.end_lat = end_lat;
		}
		public float getEnd_lon() {
			return end_lon;
		}
		public void setEnd_lon(float end_lon) {
			this.end_lon = end_lon;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public float getLongitude() {
			return longitude;
		}
		public void setLongitude(float longitude) {
			this.longitude = longitude;
		}
		public float getLat() {
			return lat;
		}
		public void setLat(float lat) {
			this.lat = lat;
		}
		public String getApproved() {
			return approved;
		}
		public void setApproved(String approved) {
			this.approved = approved;
		}
		public String getUrlImmagine() {
			return urlImmagine;
		}
		public void setUrlImmagine(String urlImmagine) {
			this.urlImmagine = urlImmagine;
		}
		public Timestamp getStartAvailability() {
			return startAvailability;
		}
		public void setStartAvailability(Timestamp startAvailability) {
			this.startAvailability = startAvailability;
		}
		public Timestamp getEndAvailability() {
			return endAvailability;
		}
		public void setEndAvailability(Timestamp endAvailability) {
			this.endAvailability = endAvailability;
		}
		public int getIdseller() {
			return idseller;
		}
		public void setIdseller(int idseller) {
			this.idseller = idseller;
		}
		public String getNameseller() {
			return nameseller;
		}
		public void setNameseller(String nameseller) {
			this.nameseller = nameseller;
		}
		public String getSurnameseller() {
			return surnameseller;
		}
		public void setSurnameseller(String surnameseller) {
			this.surnameseller = surnameseller;
		}
		public Date getBirthdateseller() {
			return birthdateseller;
		}
		public void setBirthdateseller(Date birthdateseller) {
			this.birthdateseller = birthdateseller;
		}
		public String getEmailseller() {
			return emailseller;
		}
		public void setEmailseller(String emailseller) {
			this.emailseller = emailseller;
		}
		

}
