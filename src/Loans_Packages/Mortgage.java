package Loans_Packages;

public class Mortgage {

    public String m_type;
    public String m_term;

    public Mortgage(String type, String term) {
        m_type = type;
        m_term = term;
    }

    public String getM_type() {
        return m_type;
    }

    public void setM_type(String m_type) {
        this.m_type = m_type;
    }

    public String getM_term() {
        return m_term;
    }

    public void setM_term(String m_term) {
        this.m_term = m_term;
    }

    @Override
    public String toString() {
        return "type:  " + this.m_type + " term:  " + this.m_term;
    }

}
