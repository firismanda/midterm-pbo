/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author dhanifudin
 */
public class Transaction {
    Item item;
    DiscountItem discountItem;
    PromoItem promoItem;
    
    public Transaction(Item item, DiscountItem discountItem, PromoItem promoItem){
        this.item=item;
        this.discountItem=discountItem;
        this.promoItem=promoItem;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public DiscountItem getDiscountItem() {
        return discountItem;
    }

    public void setDiscountItem(DiscountItem discountItem) {
        this.discountItem = discountItem;
    }

    public PromoItem getPromoItem() {
        return promoItem;
    }

    public void setPromoItem(PromoItem promoItem) {
        this.promoItem = promoItem;
    }
    
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println(item);
		System.out.println(discountItem);
		System.out.println(promoItem);
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
