package cn.flyme.shop.entities;

import java.util.Date;

public class Statistics {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statistics.id
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statistics.saloe
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    private Float saloe;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statistics.date
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statistics.id
     *
     * @return the value of statistics.id
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statistics.id
     *
     * @param id the value for statistics.id
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statistics.saloe
     *
     * @return the value of statistics.saloe
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public Float getSaloe() {
        return saloe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statistics.saloe
     *
     * @param saloe the value for statistics.saloe
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public void setSaloe(Float saloe) {
        this.saloe = saloe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statistics.date
     *
     * @return the value of statistics.date
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statistics.date
     *
     * @param date the value for statistics.date
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistics
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
        Statistics other = (Statistics) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSaloe() == null ? other.getSaloe() == null : this.getSaloe().equals(other.getSaloe()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistics
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSaloe() == null) ? 0 : getSaloe().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        return result;
    }
}