package cn.flyme.shop.mapper;

import cn.flyme.shop.entities.cata;
import cn.flyme.shop.entities.cataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface cataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    long countByExample(cataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    int deleteByExample(cataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    int insert(cata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    int insertSelective(cata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    List<cata> selectByExample(cataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    cata selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") cata record, @Param("example") cataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    int updateByExample(@Param("record") cata record, @Param("example") cataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    int updateByPrimaryKeySelective(cata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cata
     *
     * @mbg.generated Sun Jul 14 09:48:39 CST 2019
     */
    int updateByPrimaryKey(cata record);
}