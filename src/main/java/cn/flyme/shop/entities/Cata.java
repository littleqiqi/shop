package cn.flyme.shop.entities;

public class Cata {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cata.id
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cata.name
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cata.tnum
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    private Integer tnum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cata.id
     *
     * @return the value of cata.id
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cata.id
     *
     * @param id the value for cata.id
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cata.name
     *
     * @return the value of cata.name
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cata.name
     *
     * @param name the value for cata.name
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cata.tnum
     *
     * @return the value of cata.tnum
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public Integer getTnum() {
        return tnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cata.tnum
     *
     * @param tnum the value for cata.tnum
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    public void setTnum(Integer tnum) {
        this.tnum = tnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
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
        Cata other = (Cata) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTnum() == null ? other.getTnum() == null : this.getTnum().equals(other.getTnum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 16:11:04 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTnum() == null) ? 0 : getTnum().hashCode());
        return result;
    }
}