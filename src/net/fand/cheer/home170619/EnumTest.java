package net.fand.cheer.home170619;

public class EnumTest {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setName("zhangsan");

		if ("ÄÐ".equals(admin.getSex()) || "nan".equals(admin.getSex())
				|| "male".equals(admin.getSex())) {

		}

		if (Admin.SEX_MAN.equals(admin.getSex())) {

		}

		admin.setSex(enum_sex.M);
		if (enum_sex.M.equals(admin.getSex())) {

		}

	}
}

class Admin {
	public final static String SEX_MAN = "M";
	public final static String SEX_nv = "F";

	private String id;
	private String name;
	private enum_sex sex;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public enum_sex getSex() {
		return sex;
	}

	public void setSex(enum_sex sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

enum enum_sex {
	M, F
}