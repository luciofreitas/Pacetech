package exercicioPOO;

public class Invoice {

    private int nItemFaturado, qntdComprada;
    private String descItem;
    private double precoItem;

    public Invoice(int nItemFaturado, int qntdComprada, String descItem, double precoItem) {
        this.setnItemFaturado(nItemFaturado);
        this.setDescItem(descItem);
        this.setQntdComprada(qntdComprada);
        this.setPrecoItem(precoItem);
    }

    public double getInvoiceAccount() {
        return qntdComprada * precoItem;
    }

    public int getnItemFaturado() {
        return nItemFaturado;
    }

    public void setnItemFaturado(int nItemFaturado) {
        this.nItemFaturado = nItemFaturado;
    }

    public int getQntdComprada() {
        return qntdComprada;
    }

    public void setQntdComprada(int qntdComprada) {
        if (qntdComprada < 0) {
            this.qntdComprada = 0;
        } else {
            this.qntdComprada = qntdComprada;
        }
    }

    public String getDescItem() {
        return descItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        if (precoItem < 0) {
            this.precoItem = 0.0f;
        } else {
            this.precoItem = precoItem;
        }
    }
}
