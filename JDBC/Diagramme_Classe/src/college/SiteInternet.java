package college;

public class SiteInternet {
	private College college;

	public SiteInternet() {
		super();
	}

	public SiteInternet(College college) {
		super();
		this.college = college;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "SiteInternet [college=" + college + "]";
	}

}
