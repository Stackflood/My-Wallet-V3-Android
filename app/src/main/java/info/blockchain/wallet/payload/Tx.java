package info.blockchain.wallet.payload;

import java.util.Map;

public class Tx {

    private String strHash = null;
    private String strNote = null;
    private String strDirection = null;
    private double amount = 0.0;
    private long ts = 0L;
    private Map<Integer,String> tags = null;
    private boolean isMove = false;

    public Tx(String hash, String note, String direction, double amount, long date, Map<Integer,String> tags) {
        strHash = hash;
        strNote = note;
        strDirection = direction;
        this.amount = amount;
        ts = date;
        this.tags = tags;
    }

    public Tx(String note, String direction, double amount, long date, Map<Integer,String> tags) {
        strNote = note;
        strDirection = direction;
        this.amount = amount;
        ts = date;
        this.tags = tags;
    }

    public String getHash() {
        return strHash;
    }

    public void setHash(String hash) {
        strHash = hash;
    }

    public String getNote() {
        return strNote;
    }

    public void setNote(String note) {
        strNote = note;
    }

    public String getDirection() {
        return strDirection;
    }

    public void setDirection(String direction) {
        strDirection = direction;
    }

    public long getTS() {
        return ts;
    }

    public void setTS(long ts) {
        this.ts = ts;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isMove() {
        return isMove;
    }

    public void setIsMove(boolean isMove) {
        this.isMove = isMove;
    }

    public Map<Integer,String> getTags() {
        return this.tags;
    }

    public void setTags(Map<Integer,String> tags) {
        this.tags = tags;
    }

}