package cn.flyme.shop.entities;

import java.util.Date;

public class Orders {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.uid
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.total
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private Float total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.address
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.tel
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.date
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.ispay
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private Integer ispay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.location
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private String location;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.uid
     *
     * @return the value of orders.uid
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.uid
     *
     * @param uid the value for orders.uid
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.total
     *
     * @return the value of orders.total
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public Float getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.total
     *
     * @param total the value for orders.total
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setTotal(Float total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.address
     *
     * @return the value of orders.address
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.address
     *
     * @param address the value for orders.address
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.tel
     *
     * @return the value of orders.tel
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.tel
     *
     * @param tel the value for orders.tel
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.date
     *
     * @return the value of orders.date
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.date
     *
     * @param date the value for orders.date
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.ispay
     *
     * @return the value of orders.ispay
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public Integer getIspay() {
        return ispay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.ispay
     *
     * @param ispay the value for orders.ispay
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setIspay(Integer ispay) {
        this.ispay = ispay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.location
     *
     * @return the value of orders.location
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.location
     *
     * @param location the value for orders.location
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
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
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
                && (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
                && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
                && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
                && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
                && (this.getIspay() == null ? other.getIspay() == null : this.getIspay().equals(other.getIspay()))
                && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getIspay() == null) ? 0 : getIspay().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return result;
    }
}