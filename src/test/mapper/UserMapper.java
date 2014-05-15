package test.mapper;

import java.util.List;

import test.domain.User;
import test.domain.UserExample;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    User selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    int updateByPrimaryKey(User record);
}