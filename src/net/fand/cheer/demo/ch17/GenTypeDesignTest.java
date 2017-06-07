package net.fand.cheer.demo.ch17;

import java.util.Date;
import java.util.List;

public class GenTypeDesignTest {
	public static void main(String[] args) {
		ListView<User> userListView=new ListView<User>();
		ListView<Product> productListView=new ListView<>();
		ListView<Order> orderListView=new ListView<Order>();
	}
}

class ListView<T extends DataEntity> {
	private List<T> data;
	private Page page;
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
}

class Page{
	private int current;
	private int pagesize;
	private int total;
	private int countPage;
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCountPage() {
		return countPage;
	}
	public void setCountPage(int countPage) {
		this.countPage = countPage;
	}
}

class User extends DataEntity{
	
}

class Product extends DataEntity{
	
}

class Order extends DataEntity{
	
}

class DataEntity{
	private User createUser;
	private Date createDate;
	private User updateUser;
	private Date updateDate;
	private boolean delected;
	
}