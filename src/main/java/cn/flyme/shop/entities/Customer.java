package cn.flyme.shop.entities;

public class Customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.id
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.uname
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    private String uname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.email
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.passwd
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    private String passwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.address
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.balance
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    private Float balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.tel
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    private String tel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.id
     *
     * @return the value of customer.id
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.id
     *
     * @param id the value for customer.id
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.uname
     *
     * @return the value of customer.uname
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.uname
     *
     * @param uname the value for customer.uname
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.email
     *
     * @return the value of customer.email
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.email
     *
     * @param email the value for customer.email
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.passwd
     *
     * @return the value of customer.passwd
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.passwd
     *
     * @param passwd the value for customer.passwd
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.address
     *
     * @return the value of customer.address
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.address
     *
     * @param address the value for customer.address
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.balance
     *
     * @return the value of customer.balance
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public Float getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.balance
     *
     * @param balance the value for customer.balance
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public void setBalance(Float balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.tel
     *
     * @return the value of customer.tel
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.tel
     *
     * @param tel the value for customer.tel
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPasswd() == null ? other.getPasswd() == null : this.getPasswd().equals(other.getPasswd()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPasswd() == null) ? 0 : getPasswd().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        return result;
    }
}