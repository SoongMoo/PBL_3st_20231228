package java_20240123;

public class Account {
	int ano;
	String owner;
	int balance;
	public Account() {}
	public Account(int ano, String owner, int balance) {
		this.ano = ano;
		this.balance = balance;
		this.owner = owner;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return ano;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalace() {
		return balance;
	}
}
