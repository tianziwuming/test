package test.domain;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.user_id
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.user_name
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.user.user_desc
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    private String userDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.user_id
     *
     * @return the value of public.user.user_id
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.user_id
     *
     * @param userId the value for public.user.user_id
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.user_name
     *
     * @return the value of public.user.user_name
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.user_name
     *
     * @param userName the value for public.user.user_name
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.user.user_desc
     *
     * @return the value of public.user.user_desc
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.user.user_desc
     *
     * @param userDesc the value for public.user.user_desc
     *
     * @mbggenerated Thu May 15 15:18:02 CST 2014
     */
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
}