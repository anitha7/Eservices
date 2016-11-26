package java.com.cloudspace.casestructurerecord;

public class Casestructure {
	private String Headersection;
	private String Addresssection;
	private String Customersection;
	private String Policysection;
	private String Discountsection;
	private String Servicesection;
	public String getHeadersection() {
		return Headersection;
	}
	public void setHeadersection(String headersection) {
		Headersection = headersection;
	}
	public String getAddresssection() {
		return Addresssection;
	}
	public void setAddresssection(String addresssection) {
		Addresssection = addresssection;
	}
	public String getCustomersection() {
		return Customersection;
	}
	public void setCustomersection(String customersection) {
		Customersection = customersection;
	}
	public String getPolicysection() {
		return Policysection;
	}
	public void setPolicysection(String policysection) {
		Policysection = policysection;
	}
	public String getDiscountsection() {
		return Discountsection;
	}
	public void setDiscountsection(String discountsection) {
		Discountsection = discountsection;
	}
	public String getServicesection() {
		return Servicesection;
	}
	public void setServicesection(String servicesection) {
		Servicesection = servicesection;
	}
	@Override
	public String toString() {
		return "Casestructure [Headersection=" + Headersection
				+ ", Addresssection=" + Addresssection + ", Customersection="
				+ Customersection + ", Policysection=" + Policysection
				+ ", Discountsection=" + Discountsection + ", Servicesection="
				+ Servicesection + "]";
	}
	
}
