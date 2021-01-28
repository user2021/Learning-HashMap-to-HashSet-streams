package Loans_Packages;

public class Document {

    public String m_loanID;
    public String m_rate;

    public Document(String loanID, String rate) {
        m_loanID = loanID;
        m_rate = rate;
    }

    public String getM_loanID() {
        return m_loanID;
    }

    public void setM_loanID(String m_loanID) {
        this.m_loanID = m_loanID;
    }

    public String getM_rate() {
        return m_rate;
    }

    public void setM_rate(String m_rate) {
        this.m_rate = m_rate;
    }

    @Override
    public String toString() {
        return "loanID:  " + this.m_loanID + " rate:  " + this.m_rate;
    }

}
