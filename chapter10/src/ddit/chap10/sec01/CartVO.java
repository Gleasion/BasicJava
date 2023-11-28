package ddit.chap10.sec01;

public class CartVO {
	private String cartMember;
	private String cartNo;
	private String cartProd;
	private int cartQty;
	
	public CartVO() {}
	public CartVO(String cartMember, String cartNo, String cartProd, int cartQty) {
		this.cartMember=cartMember;
		this.cartNo=cartNo;
		this.cartProd=cartProd;
		this.cartQty=cartQty;
	}
	public String getCartMember() {
		return cartMember;
	}
	public void setCartMember(String cartMember) {
		this.cartMember = cartMember;
	}
	public String getCartNo() {
		return cartNo;
	}
	public void setCartNo(String cartNo) {
		this.cartNo = cartNo;
	}
	public String getCartProd() {
		return cartProd;
	}
	public void setCartProd(String cartProd) {
		this.cartProd = cartProd;
	}
	public int getCartQty() {
		return cartQty;
	}
	public void setCartQty(int cartQty) {
		this.cartQty = cartQty;
	}
	

}
