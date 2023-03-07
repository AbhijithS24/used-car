package usedcar.model;

public class Car {

	public int ad_id;
	public String imgurl;
	public String model;
	public String manafacturer;
	public int year;
	public String transmission;
	public String color;
	public int kmdriven;
	public int price;

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManafacturer() {
		return manafacturer;
	}

	public void setManafacturer(String manafacturer) {
		this.manafacturer = manafacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKmdriven() {
		return kmdriven;
	}

	public void setKmdriven(int kmdriven) {
		this.kmdriven = kmdriven;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAd_id() {
		return ad_id;
	}

	public void setAd_id(int ad_id) {
		this.ad_id = ad_id;
	}

	@Override
	public String toString() {
		return "Car [imgurl=" + imgurl + ", model=" + model + ", manafacturer=" + manafacturer + ", year=" + year
				+ ", transmission=" + transmission + ", color=" + color + ", kmdriven=" + kmdriven + ", price=" + price
				+ "]";
	}

}
